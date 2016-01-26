package Mod5BubbleSort;

public class BubbleSort {

    public static void main(String[] args) {

        int[] messOfNumbers = {0, 9, 3, 7, 1, 8, 2, 4, 6, 5};

        System.out.println("The original sequence: ");
        for (int q = 0; q < messOfNumbers.length; q++) {
            System.out.print(messOfNumbers[q] + ",");
        }
        System.out.println();

        SortThem(messOfNumbers);
    }

    private static void SortThem(int[] ar) {
        int temp;
        for (int i = ar.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        System.out.print("The sorted sequence: \n ");
        for (int x = 0; x < ar.length; x++) {
            System.out.print(ar[x] + ",");
        }
    }
}

