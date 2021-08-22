package task1;

import java.util.Collection;
import java.util.TreeSet;
import java.util.stream.Collectors;
import util.ScannerUtil;

final class Task1 {

  public static void main(final String[] args) {
    System.out.println("""
        Task1:
        -----
        Expected input is a single line of space-separated numbers.
        Scanner will proceed until reaching first non-numeric character or the end of line.
        """);
    final String results = buildResults();
    System.out.println(results);
  }

  static String buildResults() {
    final Collection<Integer> numbers = ScannerUtil.readIntegersFromScanner();
    final TreeSet<Integer> numbersDistinctSorted = new TreeSet<>(numbers);
    final String numbersDistinctSortedString = buildCommaSeparatedString(numbersDistinctSorted);

    return new StringBuilder()
        .append(numbersDistinctSortedString)
        .append("\ncount: " + numbers.size())
        .append("\ndistinct: " + numbersDistinctSorted.size())
        .append("\nmin: " + numbersDistinctSorted.first())
        .append("\nmax: " + numbersDistinctSorted.last())
        .append("\n")
        .toString();
  }

  private static String buildCommaSeparatedString(final TreeSet<Integer> numbers) {
    return numbers
        .stream()
        .map(Object::toString)
        .collect(Collectors.joining(" "));
  }

}
