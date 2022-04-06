package common;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import addition.binary.BinaryAdditionTest;
import search.binary.BinarySearchTest;
import search.linear.LinearSearchTest;
import sort.insertion.InsertionIncrementalSortTest;
import sort.insertion.InsertionRecursiveSortTest;
import sort.merge.MergeSort1Test;
import sort.merge.MergeSort2Test;
import sort.selection.SelectionSortTest;

@RunWith(Suite.class)
@SuiteClasses({ BinaryAdditionTest.class, LinearSearchTest.class, BinarySearchTest.class, SelectionSortTest.class, InsertionIncrementalSortTest.class, InsertionRecursiveSortTest.class,
    MergeSort1Test.class, MergeSort2Test.class })
public class TestSuite {

}
