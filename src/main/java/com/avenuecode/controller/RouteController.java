package com.avenuecode.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, value = "/routes")
public class RouteController {

    @RequestMapping(value = "/{id}/from/{source}/to/{target}",
            method = RequestMethod.POST, consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> findAvailableRoutes(@PathVariable("id") Long id,
                                                 @PathVariable("source") String source,
                                                 @PathVariable("target") String target,
                                                 @RequestParam(value = "maxStops", required=false) Long maxStops) {
        System.out.println("/"+id+"/from/"+source+"/to/"+target+"?maxStops="+maxStops);
        return null;
    }
}
