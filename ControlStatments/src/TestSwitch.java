import java.util.Scanner;

public class TestSwitch {
    public static void main (String[] args){
        final Scanner scan = new Scanner(System.in);
        System.out.println("enter command:");
        final String command = scan.nextLine();

        switch (command){
            case "start":
                System.out.println("Server is starting");
                break;
            case "stop":
                System.out.println("Server is going to shutdown");
                break;
            default:
                System.out.println("Unknown command: '" + command + "'");
        }
    }
}
