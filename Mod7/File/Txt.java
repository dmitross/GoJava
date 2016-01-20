package Mod7File;

import java.util.Scanner;

public class Txt extends File {

    private boolean run;
    private  double size;

    public void Type() {

        System.out.println("Type of file is 'Txt'.");
        System.out.println("Enter size of 'txt' file: ");

        final Scanner scanner = new Scanner(System.in);
        final String userInput = scanner.next();

        try {
            final double size = Double.parseDouble(userInput);
            System.out.println("Size of 'txt' file: " + size);

            if (size < 0) {
                throw new NegativeSizeException(size);
            }

        } catch (NegativeSizeException negEx) {
            negEx.printStackTrace();
        }
    }
}
