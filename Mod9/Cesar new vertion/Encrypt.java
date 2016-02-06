package Mod9.Cesar;

public class Encrypt {

    String encrypt(String str, int key) {

        String encrypted = "";

        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c = c + (key % 26);
                if (c > 'Z')
                    c = c - 26;
            } else if (Character.isLowerCase(c)) {
                c = c + (key % 26);
                if (c > 'z')
                    c = c - 26;
            }

            encrypted += (char) c;
        }
        return encrypted;
    }


}