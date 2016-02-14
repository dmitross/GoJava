package Mod4.SquareOfShapes;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest implements SquareOfShapesApp.FigSquare {
    final double r = 12;

    @Test(timeout = 2000)
    public void testGetSquare() throws Exception {

        final SquareOfShapesApp.Circle circle = new SquareOfShapesApp.Circle();

        final double result = circle.getSquare();

        Assert.assertEquals(Math.PI * r * r, result,0.0);
    }

    @Override
    public double getSquare() {
        return Math.PI * r * r;
    }
}