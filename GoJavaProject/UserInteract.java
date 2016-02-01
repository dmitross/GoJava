package CoreProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInteract {
    public ArrayList<Comparable> getEntryData() throws IOException {
        ArrayList<Comparable> entryData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        int dataType = getDataType();

        System.out.println("Just enter your values now:");
        try {
            while(!(input = reader.readLine()).isEmpty()) {
                if(dataType == 1) {
                    entryData.add(Integer.parseInt(input));
                } else if(dataType == 2) {
                    entryData.add(Double.parseDouble(input));
                } else if(dataType == 3){
                    entryData.add(input);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }

        reader.close();
        return  entryData;
    }

    private int getDataType() {
        Scanner input = new Scanner(System.in);
        String type;

        System.out.println("Please, choose which kind of data you want to sort (1,2 or 3)\n" +
                "1. Integer\n" +
                "2. Decimal\n" +
                "3. String\n" +
                "Your choice:");

        type = input.nextLine();

        while(type.isEmpty() || !Character.isDigit(type.charAt(0)) || type.length() > 1 || !isValidInput(type)) {
            System.err.println("[ERROR]: Sorry, your input could not be recognized.\n Please, just type 1,2 or 3.");
            type = input.nextLine();
        }
        return Integer.parseInt(type);
    }

    private boolean isValidInput(String input) {
        boolean result = false;

        if("1".equals(input) || "2".equals(input) || "3".equals(input)) {
            result = true;
        }

        return result;
    }
}