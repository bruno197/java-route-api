package com.avenuecode.entity;

import org.hibernate.annotations.Parent;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TBL_ROUTE")
public class Route implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRoute;
    private String source;
    private String target;
    private int distance;
    @ManyToOne(fetch = FetchType.LAZY)
    private Graph graph;

    public Long getIdRoute() {
        return idRoute;
    }

    public void setIdRoute(Long idRoute) {
        this.idRoute = idRoute;
    }

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

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }
}
