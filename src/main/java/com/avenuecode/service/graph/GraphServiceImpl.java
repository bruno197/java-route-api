package com.avenuecode.service.graph;

import com.avenuecode.adapter.route.GraphAdapter;
import com.avenuecode.adapter.route.RouteAdapter;
import com.avenuecode.entity.Graph;
import com.avenuecode.model.GraphDTO;
import com.avenuecode.repository.GraphRepository;
import com.avenuecode.repository.RouteRepository;
import com.avenuecode.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraphServiceImpl implements IService<GraphDTO> {
    @Autowired
    private GraphRepository graphRepository;
    @Autowired
    private RouteRepository routeRepository;
    @Autowired
    private RouteAdapter routeAdapter;
    @Autowired
    private GraphAdapter graphAdapter;

    @Override
    public List<GraphDTO> getAll() {
        return null;
    }

    @Override
    public GraphDTO getById(Long id) {
        return graphAdapter.toDTO(graphRepository.findById(id).get());
    }

    @Override
    public GraphDTO saveOrUpdate(GraphDTO data) {
        Graph graph = graphAdapter.toEntity(data);
        graphRepository.saveAndFlush(graph);
        graph.getRoutes().forEach(route -> route.setGraph(graph));
        routeRepository.saveAll(graph.getRoutes());
        
        return graphAdapter.toDTO(graph);
    }

    @Override
    public void delete(Long id) {

    }
}
