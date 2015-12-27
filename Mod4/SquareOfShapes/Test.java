public class Test {
    public static void main(String[] args) {

        SquareOfShapes x = new SquareOfShapes();

        Triangle t = new Triangle();
        Rectungle r = new Rectungle();
        Citrkle c = new Citrkle();

        System.out.println(" Test.Triangle " + x.squareOfFigure(t));
        System.out.println(" Test.Rectungle " + x.squareOfFigure(r));
        System.out.println(" Test.Citrkle " + x.squareOfFigure(c));
    }

    public static class SquareOfShapes {
        public double squareOfFigure(FigSquare figure) {
            return figure.getSquare();
        }
    }

    public static interface FigSquare {
        double getSquare();
    }

    public static class Triangle implements FigSquare {
        int a = 5;
        int b = 6;
        int c = 7;

        @Override
        public double getSquare() {
            return Math.sqrt((a + b + c) / 2);
        }
    }

    public static class Rectungle implements FigSquare {

        int a = 5;
        int b = 10;

        @Override
        public double getSquare() {
            return a * b;
        }
    }

    public static class Citrkle implements FigSquare {
        double r = 7;

        @Override
        public double getSquare() {
            return Math.PI * r * r;
        }
    }
}
