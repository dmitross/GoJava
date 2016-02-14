package Mod4.DistanceBetweenTwoPoints;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationDistanceTest {

    CalculationDistance calculationDistance;
    @Before
    public void setUp() throws Exception {
        calculationDistance = new CalculationDistance();

    }

    @Test(timeout = 2000)
    public void testPowX() throws Exception {
        final double x1 = 2;
        final double x2 = 4;

        final double result = calculationDistance.powX(x1, x2);

        assertEquals(Math.pow(x2 - x1, 2), result, 0.01);
    }

    @Test(timeout = 2000)
    public void testPowY() throws Exception {
        final double y1 = 3;
        final double y2 = 7;

        final double result = calculationDistance.powY(y1, y2);

        assertEquals(Math.pow(y2-y1, 2), result, 0.01);
    }

    @Test(timeout = 2000)
    public void testSqrtXY()throws Exception {

        double x1 = 2;
        double x2 = 4;
        final double xx = 5;
        final double yy = 7;

        final double result = calculationDistance.sqrtXY(xx,yy);

        assertEquals(Math.sqrt(xx+yy), result, 0.01);
    }

}