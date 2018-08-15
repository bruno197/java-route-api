package com.avenuecode.controller;

import com.avenuecode.model.GraphDTO;
import com.avenuecode.model.RouteDTO;
import com.avenuecode.service.graph.GraphServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, value = "/graph")
public class GraphController {

    @Autowired
    private GraphServiceImpl graphServiceImpl;

    @RequestMapping(value = "", method = RequestMethod.POST, consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> createNewGraph(@RequestBody Object list, HttpServletRequest request) throws Throwable {
        ObjectMapper objectMapper =  new ObjectMapper();
        GraphDTO graphDTO = objectMapper.convertValue(list, new TypeReference<GraphDTO>(){});

        for(RouteDTO g : graphDTO.getRoutes()) {
            System.out.println(g.getDistance());
        }

        return ResponseEntity.ok(objectMapper.writeValueAsString(graphServiceImpl.saveOrUpdate(graphDTO)));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> getGraphById(@PathVariable("id") Long id) {
        ObjectMapper objectMapper =  new ObjectMapper();
        try {
            return ResponseEntity.ok(objectMapper.writeValueAsString(graphServiceImpl.getById(id)));
        } catch (Exception e) {
            throw new OrderNotFoundException();
        }
    }

    @ResponseStatus(value=HttpStatus.NOT_FOUND, reason="The graph doesn't exist")
    public class OrderNotFoundException extends RuntimeException {
    }
}
