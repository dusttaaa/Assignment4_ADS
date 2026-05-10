public class Experiment {
    public void runTraversals(Graph g) {
        long bfsStart = System.nanoTime();
        g.bfs(0);
        long bfsEnd = System.nanoTime();
        long bfsTime = bfsEnd - bfsStart;
        long dfsStart = System.nanoTime();
        g.dfs(0);
        long dfsEnd = System.nanoTime();
        long dfsTime = dfsEnd - dfsStart;
        System.out.println("BFS Execution Time: " + bfsTime + " ns");
        System.out.println("DFS Execution Time: " + dfsTime + " ns");
    }
    public void runMultipleTests() {
        System.out.println("\n===== SMALL GRAPH (10 vertices) =====");
        Graph smallGraph = createGraph(10);
        runTraversals(smallGraph);
        System.out.println("\n===== MEDIUM GRAPH (30 vertices) =====");
        Graph mediumGraph = createGraph(30);
        runTraversals(mediumGraph);
        System.out.println("\n===== LARGE GRAPH (100 vertices) =====");
        Graph largeGraph = createGraph(100);
        runTraversals(largeGraph);
    }
    private Graph createGraph(int size) {
        Graph g = new Graph();
        for (int i = 0; i < size; i++) {
            g.addVertex(new Vertex(i));
        }
        for (int i = 0; i < size - 1; i++) {
            g.addEdge(i, i + 1);
            if (i + 2 < size) {
                g.addEdge(i, i + 2);
            }
        }
        return g;
    }
    public void printResults() {
        System.out.println("\nGraph traversal experiments completed successfully.");
    }
}