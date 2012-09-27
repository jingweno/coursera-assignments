package example

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * This class implements a ScalaTest test suite for the methods in object
 * `Lists` that need to be implemented as part of this assignment. A test
 * suite is simply a collection of individual tests for some specific
 * component of a program.
 *
 * A test suite is created by defining a class which extends the type
 * `org.scalatest.FunSuite`. When running ScalaTest, it will automatically
 * find this class and execute all of its tests.
 *
 * Adding the `@RunWith` annotation enables the test suite to be executed
 * inside eclipse using the built-in JUnit test runner.
 *
 * You have two options for running this test suite:
 *
 * - Start the sbt console and run the "test" command
 * - Right-click this file in eclipse and chose "Run As" - "JUnit Test"
 */
@RunWith(classOf[JUnitRunner])
class ListsSuite extends FunSuite {
  import Lists._

  /**
   * We only provide two very basic tests for you. Write more tests to make
   * sure your `sum` and `max` methods work as expected.
   *
   * In particular, write tests for corner cases: negative numbers, zeros,
   * empty lists, lists with repeated elements, etc.
   *
   * It is allowed to have multiple `assert` statements inside one test,
   * however it is recommended to write an individual `test` statement for
   * every tested aspect of a method.
   */
  test("sum of a few numbers") {
    assert(sum(List(1, 2, 0)) === 3)
    assert(sum(List(-1, 2, 0)) === 1)
    assert(sum(List(0, 0)) === 0)
    assert(sum(List(1, 1, 1)) === 3)
    assert(sum(Nil) === 0)
  }

  test("max of a few numbers") {
    assert(max(List(3, 7, 2)) === 7)
    intercept[NoSuchElementException] {
      max(Nil)
    }
    assert(max(List(-1, -2, -2)) === -1)
    assert(max(List(-1)) === -1)
  }
}
