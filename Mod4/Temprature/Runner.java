package Mod4.Temprature;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Hello, this program helps you convert ° C to ° F and vice versa.");
        System.out.println("Enter value in ° C: ");

        final Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();

        System.out.println("Enter value in ° F: ");
        double fahrenheit = scanner.nextDouble();

        CalculatorOfTemperature calc = new CalculatorOfTemperature();

        System.out.println("Convert ° C: " + calc.covertCelsToFahreng(celsius) + " ° F");
        System.out.println("Convert ° F: " + calc.convertFahrengToCels(fahrenheit) + " ° C");
    }
}
