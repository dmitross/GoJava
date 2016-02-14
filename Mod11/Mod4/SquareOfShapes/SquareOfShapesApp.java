package Mod4.SquareOfShapes;

public class SquareOfShapesApp {

    public static void main(String[] args) {

        SquareOfShapes x = new SquareOfShapes();

        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        System.out.println(" SquareOfShapesApp.Triangle " + x.squareOfFigure(t));
        System.out.println(" SquareOfShapesApp.Rectangle " + x.squareOfFigure(r));
        System.out.println(" SquareOfShapesApp.Circle " + x.squareOfFigure(c));
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
        double a = 12;
        double b = 7;
        double c = 9;

        @Override
        public double getSquare() {
            return Math.sqrt((a + b + c) / 2);
        }
    }

    public static class Rectangle implements FigSquare {

        double a = 5;
        double b = 10;

        @Override
        public double getSquare() {
            return a * b;
        }
    }

    public static class Circle implements FigSquare {
        double r = 12;

        @Override
        public double getSquare() {
            return Math.PI * r * r;
        }
    }
}
