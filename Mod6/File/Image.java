import java.util.Scanner;

public class Image extends File {

    private boolean run;
    private  double size;

    public void Type() {

        System.out.println("Type of file is 'Image'");
        System.out.println("Please, enter the size of image:");

        final Scanner scan = new Scanner(System.in);
        final String userInput = scan.next();

        try {
            final double size = Double.parseDouble(userInput);
            System.out.println("Size is: " + size + " Mb");
            System.out.println();
            if (size < 0) {
                throw new NegativeSizeException(size);
            }

            if (run) {
                throw new IllegalStateException("Already run");
            }
        } catch (NegativeSizeException exNegativeSize) {
            exNegativeSize.printStackTrace();
        }
    }
}


