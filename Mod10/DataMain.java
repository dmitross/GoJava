package Mod10;

import Mod9.Cesar.Decrypt;
import Mod9.Cesar.Encrypt;

import java.io.*;
import java.util.Scanner;

public class DataMain {

    static final String myData = "Voicedata";

    public static void main(String[] args) throws IOException {

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

        String en = enckr.encrypt(str, key);
        System.out.println("Encrypted: '" + en + "'");

        DataInputStream in = null;

        String desc = "";
        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(myData)));

            out.writeUTF(en);
            out.close();

            in = new DataInputStream(new BufferedInputStream(new FileInputStream(myData)));

            while (!(desc = in.readUTF()).isEmpty()) {

            }

        } catch (EOFException e) {

            desc = deckr.decrypt(desc,key);
            System.out.println("Decrypted: '" + desc + "'");
            System.out.println("Reached end of file.");
        } catch (IOException e) {
            System.out.println("Finish!");
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
