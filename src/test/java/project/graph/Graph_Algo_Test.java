package project.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Graph_Algo_Test {

    private Graph_Algo graph;

    @BeforeEach
    public void setUp() {
        graph = new Graph_Algo();
    }

    @Test
    public void testAddEdgePositiveWeight() {
        graph.addEdge(1, 2, 5);
        Assertions.assertTrue(graph.adjList.containsKey(1) && graph.adjList.get(1).stream().anyMatch(e -> e.dest == 2 && e.weight == 5));
    }

    @Test
    public void testAddMultipleEdges() {
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 3);
        Assertions.assertEquals(3, graph.adjList.get(1).size());
    }



    @Test
    public void testDFSonSimpleGraph() {
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 8);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 4);

        graph.dfs(1);
        Set<Integer> visitedNodes = graph.getVisitedNodesForDFS();
        Set<Integer> expectedVisited = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Assertions.assertEquals(expectedVisited, visitedNodes);
    }

    @Test
    public void testDFSonGraphWithCycles() {
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 8);
        graph.addEdge(3, 1, 3);

        graph.dfs(1);
        Set<Integer> visitedNodes = graph.getVisitedNodesForDFS();
        Set<Integer> expectedVisited = new HashSet<>(Arrays.asList(1, 2, 3));
        Assertions.assertEquals(expectedVisited, visitedNodes);
    }



    @Test
    public void testBFSOnGraph() {
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 8);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 4);

        graph.bfs(1);
        Set<Integer> visitedNodes = graph.visitedNodes.keySet();
        Set<Integer> expectedVisited = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Assertions.assertEquals(expectedVisited, visitedNodes);
    }

    @Test
    public void testDijkistra() {
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 8);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 4);
        graph.dijkstra(1);
        Assertions.assertEquals(graph.shortestDistances.get(2), 5);
    }

    @Test
    public void testDijkstraWithBrokenPriorityQueue() {

        // Adding edges: (Source, Destination, Weight)
        graph.addEdge(1, 2, 10);
        graph.addEdge(1, 3, 5);
        graph.addEdge(2, 3, 2);
        graph.addEdge(3, 2, 3);
        graph.addEdge(2, 4, 1);
        graph.addEdge(3, 4, 9);

        // Expected shortest distances from node 1:
        // 1 -> 0 (source)
        // 2 -> 7
        // 3 -> 5
        // 4 -> 8

        graph.dijkstra(1); // Running Dijkstra from node 1

        // Expected values after running Dijkstra
        Assertions.assertEquals(0, graph.shortestDistances.get(1)); // Distance to itself
        Assertions.assertEquals(8, graph.shortestDistances.get(2)); // 1 -> 2 is 10, but 1 -> 3 -> 2 is 7
        Assertions.assertEquals(5, graph.shortestDistances.get(3)); // Direct edge 1 -> 3 with weight 5
        Assertions.assertEquals(9, graph.shortestDistances.get(4)); // 1 -> 3 -> 2 -> 4 with total weight 8
    }

    @Test
    public void testRetrieveVisitedNodesAfterDFS() {
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 8);
        graph.addEdge(2, 4, 3);

        graph.dfs(1);
        Set<Integer> visitedNodes = graph.getVisitedNodesForDFS();
        Set<Integer> expectedVisited = new HashSet<>(Arrays.asList(1, 2, 4, 3));
        Assertions.assertEquals(expectedVisited, visitedNodes);
    }
}
