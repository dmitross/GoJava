package Flowers;

public class BouquetOfFlowers {

    public static void main(String[] args) {

        Aster ast = new Aster();
        Chamomile cham = new Chamomile();
        Rose r = new Rose();
        Tulip t = new Tulip();

        String kindA = ast.name;
        String kindC = cham.name;
        String kindR = r.name;
        String kindT = t.name;

        int costA = ast.cost;
        int costC = cham.cost;
        int costR = r.cost;
        int costT = t.cost;

        System.out.println("Kind of flower: '" + ast.name + "'; Cost:  " + ast.cost + "$");
        System.out.println("Kind of flower: '" + cham.name + "'; Cost:  " + cham.cost + "$");
        System.out.println("Kind of flower: '" + r.name + "'; Cost:  " + r.cost + "$");
        System.out.println("Kind of flower: '" + t.name + "'; Cost:  " + t.cost + "$");

    }
}
