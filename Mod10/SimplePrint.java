package Mod10;

public class SimplePrint {

    public static void main(String[] args) {

        int i = 2;
        double r = Math.sqrt(i);

        System.out.print("The square root of ");
        System.out.print(i);
        System.out.print(" is ");
        System.out.print(r);
        System.out.print(".\n");  // '\n' - переход на новую строку

        i=5;
        r=Math.sqrt(i);

        /*System.out.println("The squre root of " + i + " is " + r + ".");*/

        // замена конкотинации строк с помощю  StringBuilder

        final StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("The squre root of ");
        stringBuilder.append(i);
        stringBuilder.append(" is ");
        stringBuilder.append(r);
        stringBuilder.append(".");

        // or like this:

        /*

        final StringBuilder stringBuilder = new StringBuilder("The squre root of");
        stringBuilder.append(i)
                     .append(" is ")
                     .append(r)
                     .append(".");
         */


        final String outputMessage = stringBuilder.toString();
        System.out.println( outputMessage);


    }
}
