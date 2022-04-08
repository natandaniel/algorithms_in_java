package search.binary;

import org.junit.Assert;
import org.junit.Test;

import common.TestData;

public class BinarySearchTest {

  @Test
  public void Given_InputNumbersInAscendingOrder_When_IterativelySearchingForTheLastValueInTheSequence_Then_ShouldReturnTheLastIndexInTheSequence() {
    Assert.assertEquals(TestData.INPUT_5K_NUMBERS_ASCENDING.length - 1,
        BinarySearch.iterativeSearch(TestData.INPUT_5K_NUMBERS_ASCENDING[TestData.INPUT_5K_NUMBERS_ASCENDING.length - 1], TestData.INPUT_5K_NUMBERS_ASCENDING));
  }

  @Test
  public void Given_InputNumbersInAscendingOrder_When_IterativelySearchingForAValueOutsideOfTheSequence_Then_ShouldReturnNegativeOne() {
    Assert.assertEquals(-1, BinarySearch.iterativeSearch(501, TestData.INPUT_5K_NUMBERS_ASCENDING));
  }

  @Test
  public void Given_InputNumbersInAscendingOrder_When_RecursivelySearchingForTheLastValueInTheSequence_Then_ShouldReturnTheLastIndexInTheSequence() {
    Assert.assertEquals(TestData.INPUT_5K_NUMBERS_ASCENDING.length - 1,
        BinarySearch.iterativeSearch(TestData.INPUT_5K_NUMBERS_ASCENDING[TestData.INPUT_5K_NUMBERS_ASCENDING.length - 1], TestData.INPUT_5K_NUMBERS_ASCENDING));
  }

  @Test
  public void Given_InputNumbersInAscendingOrder_When_RecursivelySearchingForAValueOutsideOfTheSequence_Then_ShouldReturnNegativeOne() {
    Assert.assertEquals(-1, BinarySearch.iterativeSearch(501, TestData.INPUT_5K_NUMBERS_ASCENDING));
  }

}
