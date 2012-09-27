package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {

    def recursivePascal(c: Int, r: Int): Int = {
      if (!validInput(c, r)) {
        throw new IllegalArgumentException("Input is invalid")
      }

      if (isEdge(c, r)) {
        1
      } else {
        // (1,2) -> (0, 1) + (1, 1)
        // (1,3) -> (0, 2) + (1, 2)
        recursivePascal(c - 1, r - 1) + recursivePascal(c, r - 1)
      }
    }

    def validInput(c: Int, r: Int): Boolean = {
      if (c <= r) {
        true
      } else {
        false
      }
    }

    def isEdge(c: Int, r: Int): Boolean = {
      // 1 (0, 0)
      // 2 (0, 1) (1,1)
      // 3 (0, 2) (2,2)
      // 4 (0, 3) (3, 3)

      if (c == 0 || c == r) {
        true
      } else {
        false
      }

    }

    recursivePascal(c, r)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = ???

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
