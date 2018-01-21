package com.airportbaggagerouting;

/**
 * Created by Debashis on 1/21/2018.
 */
public class DijkstraAlgorithmFactory {

    public static DijkstraAlgorithm createDijkstraAlgorithm(){
        return new DijkstraAlgorithmImpl();
    }
}
