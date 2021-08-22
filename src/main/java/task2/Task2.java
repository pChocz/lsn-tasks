package task2;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import util.ScannerUtil;

final class Task2 {

  private final static int SUM = 13;

  public static void main(final String[] args) {
    System.out.println("""
        Task2:
        -----
        Expected input is a single line of space-separated numbers.
        Scanner will proceed until reaching first non-numeric character or the end of line.
        """);
    final String results = buildResults();
    System.out.println(results);
  }

  static String buildResults() {
    final Collection<Integer> numbers = ScannerUtil.readIntegersFromScanner();
    final Map<Integer, Integer> map = buildOccurencesMap(numbers);

    final StringBuilder sb = new StringBuilder();
    for (final Entry<Integer, Integer> entry : map.entrySet()) {
      final int number = entry.getKey();
      final int occurence1 = entry.getValue();
      final Integer occurence2 = map.get(SUM - number);
      if (occurence2 != null) {
        final int occurence = Math.max(occurence1, occurence2);
        for (int i = 0; i < occurence; i++) {
          sb.append(number + " " + (SUM - number) + "\n");
        }
      }
      if (number >= SUM / 2) {
        break;
      }
    }
    return sb.toString();
  }

  private static Map<Integer, Integer> buildOccurencesMap(final Collection<Integer> numbers) {
    final Map<Integer, Integer> map = new TreeMap<>();
    for (final int number : numbers) {
      map.merge(number, 1, Integer::sum);
    }
    return map;
  }
}
