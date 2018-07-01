package com.avenuecode.adapter.route;

import com.avenuecode.adapter.IAdapter;
import com.avenuecode.entity.Route;
import com.avenuecode.model.RouteDTO;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;

@Component
public class RouteAdapter implements IAdapter<Route, RouteDTO> {
    @Override
    public Route toEntity(RouteDTO dto) {
        return modelMapper.map(dto, Route.class);
    }

    @Override
    public Set<Route> toEntityList(List<RouteDTO> dtoList) {
        System.out.println(dtoList);
        Type listType = new TypeToken<Set<Route>>() {}.getType();
        System.out.println(listType);
        System.out.println("modelmapper " + modelMapper.map(dtoList, listType));
        return modelMapper.map(dtoList, listType);
    }

    @Override
    public RouteDTO toDTO(Route entity) {
        return modelMapper.map(entity, RouteDTO.class);
    }

    @Override
    public List<RouteDTO> toDTOList(List<Route> entityList) {
        Type listType = new TypeToken<List<RouteDTO>>() {}.getType();
        return modelMapper.map(entityList, listType);
    }
}
