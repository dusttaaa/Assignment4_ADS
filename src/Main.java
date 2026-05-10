public class Main {
    public static void main(String[] args) {
        System.out.println("     GRAPH TRAVERSAL AND REPRESENTATION");
        System.out.println("     Undirected Graph | BFS | Recursive DFS");
        System.out.println("===========================================\n");
        Graph graph = new Graph();
        for (int i = 0; i < 10; i++) graph.addVertex(new Vertex(i));
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(3, 7);
        graph.addEdge(4, 7);
        graph.addEdge(5, 8);
        graph.addEdge(6, 9);
        System.out.println("SMALL GRAPH STRUCTURE:");
        graph.printGraph();
        System.out.println();
        graph.bfs(0);
        graph.dfs(0);
        System.out.println();
        Experiment experiment = new Experiment();
        System.out.println("RUNNING PERFORMANCE EXPERIMENTS");
        experiment.runMultipleTests();
        experiment.printResults();
        System.out.println("\n===========================================");
        System.out.println("Program finished successfully.");
    }
}