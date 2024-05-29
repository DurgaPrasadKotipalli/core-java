package com.ds.bt.graph;

import java.util.LinkedList;

public class GraphRepresentation {

    LinkedList adjList[] = null;

    GraphRepresentation(int vertex){
        adjList = new LinkedList[vertex];

        for(int i=0; i<vertex; i++){
            adjList[i] = new LinkedList();
        }

    }

    public void add(int source, int destination){
        adjList[source].add(destination);
    }
    public static void main(String[] args) {

        GraphRepresentation g = new GraphRepresentation(5);
        g.add(0, 1);
        g.add(0, 2);
        g.add(1, 0);
        g.add(1, 4);
        g.add(1, 3);
        g.add(2, 0);
        g.add(2, 3);
        g.add(3, 1);
        g.add(3, 2);
        g.add(3, 4);
        g.add(4, 1);
        g.add(4, 3);

    }

}
