package com.avenuecode.service;

import com.avenuecode.service.graph.GraphServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class GraphServiceImplTest {

    @InjectMocks
    private GraphServiceImpl graphService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void shouldDistanceOfRouteCalculateRight() {

    }
}
