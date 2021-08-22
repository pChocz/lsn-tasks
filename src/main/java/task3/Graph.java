package task3;

import com.google.common.collect.Multimap;
import com.google.common.collect.TreeMultimap;

public class Graph {

  private final Multimap<Node, Node> neighborsMap;

  public Graph() {
    this.neighborsMap = TreeMultimap.create();
  }

  public void addNodesPair(final int node1Id, final int node2Id) {
    final Node node1 = this.findNodeById(node1Id);
    final Node node2 = this.findNodeById(node2Id);
    this.neighborsMap.put(node1, node2);
    this.neighborsMap.put(node2, node1);
  }

  private Node findNodeById(final int id) {
    return this.neighborsMap
        .keySet()
        .stream()
        .filter(node -> node.getId() == id)
        .findFirst()
        .orElse(new Node(id));
  }

  int countDividedNetworks() {
    int count = 0;
    while (hasUnvisitedNodes()) {
      count++;
      final Node firstUnvisitedNode = getFirstUnvisitedNode();
      dfsRecursive(firstUnvisitedNode);
    }
    return count;
  }

  boolean hasUnvisitedNodes() {
    return this.neighborsMap
        .keySet()
        .stream()
        .anyMatch(Node::isUnvisited);
  }

  Node getFirstUnvisitedNode() {
    return this.neighborsMap
        .keySet()
        .stream()
        .filter(Node::isUnvisited)
        .findFirst()
        .orElse(null);
  }

  void dfsRecursive(final Node node) {
    node.setVisited();
    for (final Node neighbor : this.neighborsMap.get(node)) {
      if (!neighbor.isVisited()) {
        dfsRecursive(neighbor);
      }
    }
  }

}
