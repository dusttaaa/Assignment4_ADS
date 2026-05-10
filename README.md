# Assignment 4: Graph Traversal System

## Overview
This project demonstrates how graphs work in Java using an adjacency list representation. It implements an undirected graph and two main traversal algorithms:
- Breadth-First Search (BFS)
- Depth-First Search (DFS - recursive)
The project also includes performance experiments to compare execution time on different graph sizes.

---

## Graph Representation
The graph is implemented using an adjacency list:
```java
Map<Integer, List<Integer>>
Each vertex stores its neighbors.
Example:
0 -> [1, 2]
1 -> [0, 3, 4]
This structure is efficient for sparse graphs and allows fast traversal.
Graph Structure (Example Output)
0 -> [1, 2]
1 -> [0, 3, 4]
2 -> [0, 5, 6]

---

## Traversal Algorithms

### Breadth-First Search (BFS)
BFS explores the graph level by level using a queue.
Example output:
BFS Traversal: 0 1 2 3 4 5 6 7 8 9

### Depth-First Search (DFS)
DFS explores as deep as possible using recursion.
Example output:
DFS Traversal: 0 1 3 7 4 2 5 8 6 9

---

## Experimental Results
The program was tested on three graph sizes:
Graph Size	BFS Time	DFS Time
10 vertices	391,200 ns	223,500 ns
30 vertices	996,000 ns	913,900 ns
100 vertices	2,370,500 ns	1,937,400 ns

---

## Observations
As the graph size increases, execution time increases as expected.
DFS was slightly faster in all tests, likely due to recursive execution.
Both algorithms scale similarly and follow the expected complexity.

---

## Complexity
Both BFS and DFS have the same time complexity:
O(V + E)
Where:
V = number of vertices
E = number of edges

---

## Reflection
In this project, I learned how graphs are represented using adjacency lists and how BFS and DFS traverse them differently. BFS works level by level, while DFS goes deep into the graph using recursion.
One of the main challenges was understanding how traversal order changes depending on graph structure. I also learned how to measure execution time and analyze algorithm performance in practice.
Overall, this project helped me understand graph algorithms and improve my Java programming skills.

---

## Conclusion
This project successfully implements graph traversal using BFS and DFS, and demonstrates how graph size affects performance in real execution.
