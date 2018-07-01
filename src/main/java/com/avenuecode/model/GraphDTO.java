package com.avenuecode.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class GraphDTO implements Serializable {
    @JsonProperty("id")
    @JsonAlias({"graphId", "id"})
    private Long graphId;

    @JsonProperty("data")
    @JsonAlias({"routes", "data"})
    private List<RouteDTO> routes;

    public Long getGraphId() {
        return graphId;
    }

    public void setGraphId(Long graphId) {
        this.graphId = graphId;
    }

    public List<RouteDTO> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RouteDTO> routes) {
        this.routes = routes;
    }
}
