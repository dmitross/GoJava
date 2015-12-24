import java.util.Scanner;

public class ControlStatments {
    public static final double PI = 3.14;
    public static void main (String[] args){
        final Scanner scanner = new Scanner(System.in);

       System.out.println("Please, enter first circle radius:");
       double radius1 = scanner.nextDouble();

        System.out.println("Please, enter second circle radius:");
        double radius2 = scanner.nextDouble();

     double area1 = PI * radius1*radius1;
     double area2 = PI * radius2*radius2;

        System.out.println("First circle's area : " + area1);
        System.out.println("Second circle's area : " + area2);

        if (area1 < area2){
            System.out.println("First circle is smaller");
        } else if (area1 > area2) {
            System.out.println("Second circle is smaller");
        }else {
            System.out.println("Circles are equal");
        }


        // Define if number even or odd
        System.out.println("Please, enter number:");
        final int number = scanner.nextInt();
        if (number %2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }


    }
}
