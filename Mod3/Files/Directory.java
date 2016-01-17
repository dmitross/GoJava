package Files;

public class Directory {

    public static void main(String[] args) {

        Txt t = new Txt();
        Audio a = new Audio();
        Image i = new Image();

        String typeT = t.type;
        String typeA = a.type;
        String typeI = i.type;

        String nameT = t.name;
        String nameA = a.name;
        String nameI = i.name;

        double sizeT = t.size;
        double sizeA = a.size;
        double sizeI = i.size;

        System.out.println("Type of file: '" + t.type + "'; Name: '" + t.name + "'; Size: " + t.size + "Mb.");
        System.out.println("Type of file: '" + a.type + "'; Name: '" + a.name + "';  Size: " + a.size + "Mb.");
        System.out.println("Type of file: '" + i.type + "'; Name: '" + i.name + "'; Size: " + i.size + "Mb.");

    }
}
