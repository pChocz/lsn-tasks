# DEV-TEST

This repo contains my solutions for 3 tasks. Feel free to verify corectness, looking forward to discussing all the
solutions in detail!

## Task1

Solution uses *TreeSet* to create set of sorted and distinct numbers from provided list. *TreeSet* also provides
straightforward methods to extract basic measurement information required by the task instructions.

## Task2

Solution builds *occurences* map of each number of the input (sorted by the values). In the next step occurences map is
being iterated, trying to find corresponding number for each one with which it sums up to value specified by `SUM`. Loop
is terminated when reaching`SUM / 2` value, as all pairs that will be found after that must have been already found
earlier.

#### Remarks

- *Lombok* is used to save few lines of boilerplate code.

## Task3

Solution uses recursive DFS algorithm to traverse the graph several times, incrementing the number of divided networks
each time. Each traverse loop starts with the first unvisited node. Algorithm ends in case there are no more unvisited
nodes in the graph, returning number of divided networks (subgraphs) in the whole graph.

#### Remarks

- Guava *Multimap* is used for easier implementation, to store node neighbors.

## Stack

- Java 15
- JUnit 5
- Maven
- Lombok
- Guava

## Testing & Running

Maven is used to manage project's build. In order to verify the application, you can simply run `mvn test` goal, which
will invoke all the tests with predefined input, providing console output with the results as well.

Each Task can also be run separately, with possibility to provide console input, just in case you would like to test it
with your own input - just use `main` method of the task that you are interested in.
