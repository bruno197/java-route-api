drop table if exists TBL_GRAPH;
create table TBL_GRAPH
(
   graph_id integer not null,
   CONSTRAINT TBL_GRAPH_PK PRIMARY KEY (graph_id)
);

drop table if exists TBL_ROUTE;
create table TBL_ROUTE
(
   route_id integer not null,
   source varchar(255) not null,
   target varchar(255) not null,
   distance integer not null,
   graph_id integer not null,
   CONSTRAINT TBL_ROUTE_PK PRIMARY KEY (route_id),
   CONSTRAINT TBL_ROUTE_FK FOREIGN KEY (graph_id) REFERENCES TBL_GRAPH(graph_id) ON DELETE CASCADE
);