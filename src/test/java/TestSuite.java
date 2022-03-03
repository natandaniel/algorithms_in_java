import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import search.linear.LinearSearchTest;
import sort.insertion.InsertionSortTest;
import sort.merge.MergeSortTest;
import sort.selection.SelectionSortTest;

@RunWith(Suite.class)
@SuiteClasses({ LinearSearchTest.class, SelectionSortTest.class, InsertionSortTest.class, MergeSortTest.class })
public class TestSuite {

}
