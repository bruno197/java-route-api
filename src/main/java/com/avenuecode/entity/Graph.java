package com.avenuecode.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TBL_GRAPH")
public class Graph implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long graphId;

    @OneToMany(mappedBy = "graph")
    private List<Route> routes;

    public Long getGraphId() {
        return graphId;
    }

    public void setGraphId(Long graphId) {
        this.graphId = graphId;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }
}
