package com.avenuecode.adapter.route;

import com.avenuecode.adapter.IAdapter;
import com.avenuecode.entity.Graph;
import com.avenuecode.model.GraphDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class GraphAdapter implements IAdapter<Graph, GraphDTO> {
    @Override
    public Graph toEntity(GraphDTO dto) {
        return modelMapper.map(dto, Graph.class);
    }

    @Override
    public Set<Graph> toEntityList(List<GraphDTO> dtoList) {
        return null;
    }

    @Override
    public GraphDTO toDTO(Graph entity) {
        return modelMapper.map(entity, GraphDTO.class);
    }

    @Override
    public List<GraphDTO> toDTOList(List<Graph> entityList) {
        return null;
    }
}
