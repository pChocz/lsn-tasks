package task3;

import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for Task3")
class Task3Test {

//  Regular examples:

  private final static String GRAPH_5_NODES_3_LINKS_RESULT_2 =
      """
          3
          2 3
          1 2
          5 6
          """;

  private final static String GRAPH_5_NODES_4_LINKS_RESULT_1 =
      """
          4
          2 3
          1 2
          5 6
          2 5
          """;

  private final static String GRAPH_5_NODES_5_LINKS_RESULT_1 =
      """
          5
          1 2
          2 3
          1 5
          1 6
          2 6
          """;

//  Corner cases:

  private final static String GRAPH_6_NODES_3_LINKS_RESULT_3 =
      """
          3
          1 2
          3 5
          6 7
          """;

  private final static String GRAPH_2_NODES_1_LINK_RESULT_1 =
      """
          1
          1 2
          """;

  private final static String GRAPH_2_NODES_0_REAL_LINK_RESULT_2 =
      """
          2
          1 1
          3 3
          """;

  private final static String GRAPH_10_NODES_9_LINKS_RESULT_1 =
      """
          9
          1 2
          1 3
          1 4
          1 5
          1 6
          1 7
          1 8
          1 9
          1 10
          """;

  @Test
  @DisplayName("asserts all tests")
  void test() {
    System.out.println("\n----------");
    System.out.println("Testing Task3:");
    Assertions.assertAll(
        () -> Assertions.assertEquals(2, getResultForGraph(GRAPH_5_NODES_3_LINKS_RESULT_2)),
        () -> Assertions.assertEquals(1, getResultForGraph(GRAPH_5_NODES_4_LINKS_RESULT_1)),
        () -> Assertions.assertEquals(1, getResultForGraph(GRAPH_5_NODES_5_LINKS_RESULT_1)),
        () -> Assertions.assertEquals(3, getResultForGraph(GRAPH_6_NODES_3_LINKS_RESULT_3)),
        () -> Assertions.assertEquals(1, getResultForGraph(GRAPH_2_NODES_1_LINK_RESULT_1)),
        () -> Assertions.assertEquals(2, getResultForGraph(GRAPH_2_NODES_0_REAL_LINK_RESULT_2)),
        () -> Assertions.assertEquals(1, getResultForGraph(GRAPH_10_NODES_9_LINKS_RESULT_1))
    );
  }

  private int getResultForGraph(final String graph) {
    System.out.println("\nINPUT:");
    System.out.println(graph);
    final ByteArrayInputStream inputStream = new ByteArrayInputStream(graph.getBytes());
    System.setIn(inputStream);
    final int output = Task3.countDividedNetworksInGraph();
    System.out.println("OUTPUT:");
    System.out.println(output);
    return output;
  }

}