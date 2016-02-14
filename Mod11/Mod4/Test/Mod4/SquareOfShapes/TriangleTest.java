package Mod4.SquareOfShapes;

import junit.framework.Assert;
import org.junit.Test;

public class TriangleTest implements SquareOfShapesApp.FigSquare {

    final double a = 12;
    final double b = 7;
    final double c = 9;

    @Test(timeout = 2000)
    public void testGetSquare() throws Exception {

        final SquareOfShapesApp.Triangle triangle = new SquareOfShapesApp.Triangle();

        double result = triangle.getSquare();

        Assert.assertEquals(Math.sqrt((a + b + c) / 2), result, 0.0);

    }

    @Override
    public double getSquare() {
        return Math.sqrt((a + b + c) / 2);
    }


}