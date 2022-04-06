package search.linear;

import org.junit.Assert;
import org.junit.Test;

import common.TestData;

public class LinearSearchTest {

  @Test
  public void Given_InputNumbersInRandomOrder_When_SearchingForTheLastValueInTheSequence_Then_ShouldReturnTheLastIndexInTheSequence() {
    Assert.assertEquals(99999, LinearSearch.search(TestData.INPUT[TestData.INPUT.length - 1], TestData.INPUT));
  }

  @Test
  public void Given_InputNumbersInRandomOrder_When_SearchingForAValueOutsideOfTheSequence_Then_ShouldReturnNegativeOne() {
    Assert.assertEquals(-1, LinearSearch.search(501, TestData.INPUT));
  }

}
