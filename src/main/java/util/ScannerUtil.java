package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;
import lombok.experimental.UtilityClass;
import task3.Graph;

/**
 * Utility class providing methods to read and process the input for all tasks.
 */
@UtilityClass
public class ScannerUtil {

  /**
   * Reads single line of space-separated integers from the standard I/O. In case of non-integer value returns empty
   * list.
   *
   * @return Collection of integers read from the input.
   */
  public static Collection<Integer> readIntegersFromScanner() {
    final Scanner scanner = new Scanner(System.in);
    try {
      final String line = scanner.nextLine();
      return Arrays
          .stream(line.split("\\s"))
          .map(Integer::valueOf)
          .collect(Collectors.toList());

    } catch (final NumberFormatException e) {
      System.out.println("-- INVALID DATA! --");
      System.out.println("only integer values were expected");
      return new ArrayList<>();
    }
  }

  /**
   * Reads graph from the standard input In case of non-integer value returns empty graph.
   *
   * @return Graph based on provided input.
   */
  public static Graph readGraphFromScanner() {
    final Scanner scanner = new Scanner(System.in);

    try {
      final int numberOfLinks = scanner.nextInt();
      final Graph graph = new Graph();
      for (int i = 0; i < numberOfLinks; i++) {
        final int id1 = scanner.nextInt();
        final int id2 = scanner.nextInt();
        graph.addNodesPair(id1, id2);
      }
      return graph;

    } catch (final NumberFormatException e) {
      System.out.println("-- INVALID DATA! --");
      System.out.println("only integer values were expected");
      return new Graph();
    }
  }

}
