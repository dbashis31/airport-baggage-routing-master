package com.airportbaggagerouting;

import java.util.List;

import com.airportbaggagerouting.model.DirectedEdge;

/**
 * Created by Debashis on 1/21/2018.
 */
public interface DijkstraAlgorithm {
    public String findShortestPath(String entry,String dest, List<DirectedEdge> graphEdges);
}
