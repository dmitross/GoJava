package Mod8;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionExample {

    public static void main(String[] args) {

        Integer[] firstCollectin = {1, 2, 3};
        Integer[] secondCollectin = {4, 5, 6};
        Integer[] thirdCollectin = {7, 8, 9};

        ArrayList<Integer> oneCollectin = new ArrayList<Integer>(Arrays.asList(firstCollectin));
        ArrayList<Integer>twoCollection = new ArrayList<Integer>(Arrays.asList(secondCollectin));
        ArrayList<Integer>threeColection = new ArrayList<Integer>(Arrays.asList(thirdCollectin));

        System.out.print("Fir. collection elements: ");
        for (Integer a : oneCollectin) {
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("Sec. collection elements: ");
        for (Integer b : twoCollection) {
            System.out.print(b);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("Thi. collection elements: ");
        for (Integer c : threeColection) {
            System.out.print(c);
            System.out.print(" ");
        }

    }
}
