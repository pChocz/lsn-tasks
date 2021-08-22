package task2;

import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for Task2")
class Task2Test {

  private final static String INPUT_1 = "1 2 10 7 5 3 6 6 13 0";
  private final static String OUTPUT_1 =
      """
          0 13
          3 10
          6 7
          6 7
          """;

  private final static String INPUT_2 = "1 2 10 7 5 3 6 6 13 0 -1 14 -3 10 -25 38";
  private final static String OUTPUT_2 =
      """
          -25 38
          -1 14
          0 13
          3 10
          3 10
          6 7
          6 7
          """;

  @Test
  @DisplayName("asserts all tests")
  void test() {
    System.out.println("\n----------");
    System.out.println("Testing Task2:");
    Assertions.assertAll(
        () -> Assertions.assertEquals(OUTPUT_1, getResultForInput(INPUT_1)),
        () -> Assertions.assertEquals(OUTPUT_2, getResultForInput(INPUT_2))
    );
  }

  private String getResultForInput(final String input) {
    System.out.println("INPUT:");
    System.out.println(input);
    final ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    final String output = Task2.buildResults();
    System.out.println("OUTPUT:");
    System.out.println(output);
    return output;
  }

}