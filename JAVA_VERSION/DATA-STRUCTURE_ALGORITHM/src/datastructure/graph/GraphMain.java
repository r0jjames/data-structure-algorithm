package datastructure.graph;

public class GraphMain {
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
}
