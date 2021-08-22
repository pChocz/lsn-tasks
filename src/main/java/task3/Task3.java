package task3;

import util.ScannerUtil;

final class Task3 {

  public static void main(final String[] args) {
    System.out.println("""
        Task3:
        -----
        The first line of input should contain a positive number n,
        next n lines contain pairs of positive integers,
        where each pair identifies a connection between two vertices in a graph,
        """);
    final int dividedNetworks = countDividedNetworksInGraph();
    System.out.println(dividedNetworks);
  }

  static int countDividedNetworksInGraph() {
    final Graph graph = ScannerUtil.readGraphFromScanner();
    final int numberOfDividedNetworks = graph.countDividedNetworks();
    return numberOfDividedNetworks;
  }

}
