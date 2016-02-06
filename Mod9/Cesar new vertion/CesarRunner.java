package Mod9.Cesar;

import java.util.Scanner;

public class CesarRunner {

    public static void main(String[] args) {

        String str;
        int key;

        System.out.println("Hi, this programme encrypt and automatically decrypt information. \n " +
                "Write something txt: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        System.out.println("Enter key");
        key = scanner.nextInt();

        Encrypt enckr = new Encrypt();
        Decrypt deckr = new Decrypt();

        String en = enckr.encrypt(str,key);
        System.out.println("Encrypted: '" + en + "'");

        String de = deckr.decrypt(en,key);
        System.out.println("Decrypted: '" + de + "'");
    }
}