package MusicShop;

public class MusicShop {

    public static void main(String[] args) {

        Guitar g = new Guitar();
        Pianoforte p = new Pianoforte();
        Trumpet t = new Trumpet();

        String modelG = g.model;
        String modelP = p.model;
        String modelT = t.model;

        int costG = g.cost;
        int costP = p.cost;
        int costT = t.cost;


        System.out.println("Model of guitar: '" + g.model + "'; Cost: " + g.cost + "$");
        System.out.println("Model of pianoforte: '" + p.model + "'; Cost: " + p.cost + "$");
        System.out.println("Model of trumpet: '" + t.model + "'; Cost: " + t.cost + "$");


    }
}
