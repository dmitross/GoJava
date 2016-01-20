package Mod7File;

import java.util.Scanner;

public class Audio extends File {

    private double size;
    private boolean play;

    public void Type() {
        System.out.println("Type of file is 'Audio'");
        System.out.println("Please, enter the size of song:");

        final Scanner scan = new Scanner(System.in);
        double size = scan.nextDouble();

        try {
            size = Double.parseDouble(String.valueOf(size));
            System.out.println("Size is: " + size + " Mb");

            if (size < 0) {
                throw new NegativeSizeException(size);
            }

            if (play) {
                throw new IllegalStateException("Already played");
            }
        } catch (NegativeSizeException exNegativeSize) {
            exNegativeSize.printStackTrace();
        }
    }
}
