package task3;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
class Node implements Comparable<Node> {

  private final int id;
  private boolean isVisited;

  Node(final int id) {
    this.id = id;
    this.isVisited = false;
  }

  void setVisited() {
    this.isVisited = true;
  }

  @Override
  public int compareTo(final Node that) {
    return this.id - that.id;
  }

  boolean isUnvisited() {
    return !this.isVisited;
  }

}
