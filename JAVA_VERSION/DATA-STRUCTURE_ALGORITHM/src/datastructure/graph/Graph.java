package datastructure.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");
        graph.removeVertex("D");
//        datastructure.graph.removeEdge("A", "B");
        graph.printGraph();
    }
    private HashMap<String, ArrayList<String>> adjacencyList = new HashMap<>();

    public boolean addVertex(String vertex) {
        if(adjacencyList.get(vertex) == null) {
            adjacencyList.put(vertex, new ArrayList<>());
            return true;
        }

        return false;
    }
    public boolean addEdge(String vertex1, String vertex2) {
        if(adjacencyList.get(vertex1) != null && adjacencyList.get(vertex2) != null) {
            adjacencyList.get(vertex1).add(vertex2);
            adjacencyList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        if(adjacencyList.get(vertex1) != null && adjacencyList.get(vertex2) != null) {
            adjacencyList.get(vertex1).remove(vertex2);
            adjacencyList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }
    public boolean removeVertex(String vertex) {
        if(adjacencyList.get(vertex) == null) return false;
        for(String otherVertex: adjacencyList.get(vertex)) {
            adjacencyList.get(otherVertex).remove(vertex);
        }
        adjacencyList.remove(vertex);
        return true;
    }
    public void printGraph() {
        System.out.println(adjacencyList);
    }

}
