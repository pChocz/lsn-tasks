package task1;

import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for Task1")
class Task1Test {

  private final static String INPUT_1 = "1 10 20 20 2 5";
  private final static String OUTPUT_1 =
      """
          1 2 5 10 20
          count: 6
          distinct: 5
          min: 1
          max: 20
          """;

  private final static String INPUT_2 = "1 10 1 10 20 20 2 5 -6 -100 50";
  private final static String OUTPUT_2 =
      """
          -100 -6 1 2 5 10 20 50
          count: 11
          distinct: 8
          min: -100
          max: 50
          """;

  @Test
  @DisplayName("asserts all tests")
  void test() {
    System.out.println("\n----------");
    System.out.println("Testing Task1:");
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
    final String output = Task1.buildResults();
    System.out.println("OUTPUT:");
    System.out.println(output);
    return output;
  }

}