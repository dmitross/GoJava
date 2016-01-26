package Mod9.Cesar;

import java.util.Scanner;

public class CesarsAlgoritm {

    public static void main(String[] args) {

        final char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        enCoding(abc);
        deCoding(abc);
    }

    private static void enCoding(char[] abc) {

        System.out.println("Enter word: ");
        final Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Enter key: ");
        int key = scanner.nextInt();

        String result = "";

        for (int i = 0; i < userInput.length(); i++) {

            final char c = userInput.charAt(i);
            //пробегаемся по массиву алфовита
            for (int x = 0; x < abc.length; x++) {
                // сравниваем индеекс массива с введенным элементом
                if (abc[x] == c) {

                    if (x + key > abc.length - 1) {

                        int index = (x + key) - (abc.length - 1);

                        result = result + abc[index];
                    } else
                        result = result + abc[x + key];
                }
            }
        }
        System.out.print("EnCode: ");
        System.out.println(result);

    }

    private static void deCoding(char[] abc) {
        String result = "";
        System.out.println("Enter word: ");
        final Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Enter key: ");
        int key = scanner.nextInt();

        for (int i = 0; i < userInput.length(); i++) {
            final char c = userInput.charAt(i);
            for (int x = 0; x < abc.length; x++) {
                if (abc[x] == c) {
                    if (x - key > abc.length - 1) {
                        int index = (x - key) - (abc.length - 1);

                        result = result + abc[index];
                    } else
                        result = result + abc[x - key];
                }
            }
        }

        System.out.print("DeCode: ");
        System.out.println(result);

    }
}
