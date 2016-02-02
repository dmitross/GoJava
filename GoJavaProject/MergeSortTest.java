package CoreProject;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    private ArrayList<Comparable> someList;
    private MergeSort mergeSort;

    @Before
    public void setUp() throws Exception {
        someList = new ArrayList<>();
        mergeSort = new MergeSort(someList);
    }

    @Test
    public void testSortInteger() throws Exception {
        someList.add(64);
        someList.add(21);
        someList.add(33);
        someList.add(70);
        someList.add(12);
        someList.add(85);
        someList.add(44);
        someList.add(3);
        someList.add(99);
        someList.add(0);
        someList.add(108);

        ArrayList<Comparable> numList = new ArrayList<>(someList);
        Collections.sort(numList);

        someList = mergeSort.sort(someList);
        assertArrayEquals(someList.toArray(), numList.toArray());

        System.out.println(numList);
        System.out.println(someList);

        System.out.println("\n\\*************************\\\n");
    }

    @Test
    public void testSortDecimal() throws Exception {
        someList.add(-54.9);
        someList.add(21.5);
        someList.add(-3.3);
        someList.add(70.1);
        someList.add(12.4);
        someList.add(85.0);
        someList.add(-4.7);
        someList.add(3.6);
        someList.add(99.2);
        someList.add(0.8);
        someList.add(108.1);

        ArrayList<Comparable> numList = new ArrayList<>(someList);
        Collections.sort(numList);

        someList = mergeSort.sort(someList);
        assertArrayEquals(someList.toArray(), numList.toArray());

        System.out.println(numList);
        System.out.println(someList);

        System.out.println("\n\\*************************\\\n");
    }

    @Test
    public void testSortString() throws Exception {
        someList.add("zippo");
        someList.add("java");
        someList.add("calendar");
        someList.add("universal");
        someList.add("movie");
        someList.add("awesome");
        someList.add("merge");
        someList.add("sorting");

        List<Comparable> stringList = new ArrayList<>(someList);
        Collections.sort(stringList);

        someList = mergeSort.sort(someList);
        assertArrayEquals(stringList.toArray(), someList.toArray());

        System.out.println(stringList);
        System.out.println(someList);

        System.out.println("\n\\*************************\\\n");
    }

    @Test(expected = ClassCastException.class)
    public void testSortIntegerExc() throws Exception {
        someList.add(64);
        someList.add("dsadsa");
        someList.add(21.0);

        someList = mergeSort.sort(someList);
    }

    @Test(expected = ClassCastException.class)
    public void testSortDecimalExc() throws Exception {
        someList.add(64.2);
        someList.add("dsadsa");
        someList.add(21);

        someList = mergeSort.sort(someList);
    }

    @Test(expected = ClassCastException.class)
    public void testSortStringExc() throws Exception {
        someList.add("zippo");
        someList.add(45);
        someList.add(45.2);

        someList = mergeSort.sort(someList);
    }
}