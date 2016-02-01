package CoreProject;

import java.io.IOException;
import java.util.ArrayList;

public class MergeSortApp {
    public static void main(String[] args) {
        ArrayList<Comparable> someList =  new ArrayList<>();
        UserInteract interact = new UserInteract();

        try {
            someList = interact.getEntryData();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("[ERROR]: Illegal input data!");
        }

        MergeSort sortUtil = new MergeSort(someList);

        someList =  sortUtil.sort(someList);
        System.out.println(someList);
    }
}