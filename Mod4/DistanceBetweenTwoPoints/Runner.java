package DistanceBetweenTwoPoints;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Hello, this program help you calculate distance between two points.");
        System.out.println("Enter coordinate x1: ");
        final Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        System.out.println("Enter coordinate x2: ");
        double x2 = scanner.nextDouble();
        System.out.println("Enter coordinate y1: ");
        double y1 = scanner.nextDouble();
        System.out.println("Enter coordinae y2: ");
        double y2 = scanner.nextDouble();

        CalculationDistance calcDist = new CalculationDistance();

        System.out.println("Distance between x & y: " + calcDist.sqrtXY(x1, x2, y1, y2));
    }
}
