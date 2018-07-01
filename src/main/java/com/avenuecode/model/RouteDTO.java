package com.avenuecode.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonPropertyOrder({ "source", "target", "distance" })
@JsonIgnoreProperties({ "idRoute", "graph"})
public class RouteDTO implements Serializable {
    @JsonAlias("source")
    private String source;
    @JsonAlias("target")
    private String target;
    @JsonAlias("distance")
    private int distance;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
