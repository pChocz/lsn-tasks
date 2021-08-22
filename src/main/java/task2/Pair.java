package task2;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class Pair {

  private final int first;
  private final int second;

  @Override
  public boolean equals(final Object obj) {
    final Pair that = (Pair) obj;
    return this.first + this.second == that.first + that.second;
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, second);
  }

  @Override
  public String toString() {
    return "[" + first + ", " + second + "]";
  }

}
