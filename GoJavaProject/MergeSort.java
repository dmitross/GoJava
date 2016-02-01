package CoreProject;

import java.util.*;

public class MergeSort {

    private ArrayList<Comparable> someList;

    public MergeSort(ArrayList<Comparable> someList) {
        this.someList = someList;
    }

    public ArrayList<Comparable> sort(ArrayList<Comparable> list) {
        ArrayList<Comparable> temp = new ArrayList<>(list);
        mergeSort(temp, 0, temp.size() - 1);

        return temp;
    }

    private void mergeSort(ArrayList<Comparable> temp, int low, int high) {
        if(low == high) {
            return;
        } else {
            int mid = (low + high) / 2;

            mergeSort(temp, low, mid);
            mergeSort(temp, mid + 1, high);
            merge(temp, low, mid, high);
        }
    }

    private void merge(ArrayList<Comparable> temp, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        int ptr = 0;
        int elems = high - low + 1;

        while(left <= mid && right <= high) {
            if( (someList.get(left)).compareTo(someList.get(right)) < 1 ) {
                temp.set(ptr, someList.get(left));
                ptr++;
                left++;
            } else {
                temp.set(ptr, someList.get(right));
                ptr++;
                right++;
            }
        }

        while (left <= mid) {
            temp.set(ptr, someList.get(left));
            ptr++;
            left++;
        }

        while (right <= high) {
            temp.set(ptr, someList.get(right));
            ptr++;
            right++;
        }

        for(int i = 0; i < elems; i++) {
            someList.set(low + i, temp.get(i));
        }
    }
}