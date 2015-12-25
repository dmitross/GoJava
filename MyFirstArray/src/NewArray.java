public class NewArray {

    public static void main(String[] args) {
        int[] array = {10, 0, 9, 1, 8, 2, 7, 3, 6, 4, 5, -1};

        int getMax = array[0] ;
        int getMin = array[0];

        for (int i = 0; i < array.length; i++){
            if (getMax < array[i])
                getMax = array[i];
            if (getMin > array[i])
                getMin = array[i];
        }
        System.out.println("Max value is : " + getMax);
        System.out.println("Min value is : " + getMin);

        }
}
