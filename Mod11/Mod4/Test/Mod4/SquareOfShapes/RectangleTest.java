package Mod4.SquareOfShapes;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest implements SquareOfShapesApp.FigSquare {
    final double a = 5;
    final double b = 10;

    @Test(timeout = 2000)
    public void testGetSquare() throws Exception {


        final SquareOfShapesApp.Rectangle rectangle = new SquareOfShapesApp.Rectangle();

        final double result = rectangle.getSquare();

        Assert.assertEquals(a * b, result,0.0);

    }

    @Override
    public double getSquare() {
        return a * b;
    }
}