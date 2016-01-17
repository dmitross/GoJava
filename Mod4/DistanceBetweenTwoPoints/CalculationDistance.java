package DistanceBetweenTwoPoints;

import static java.lang.Math.*;

public class CalculationDistance {

    public double powX (double x1, double x2) {
        double xx;
        return  xx = pow (x2 - x1, 2);
    }

    public double powY (double y1, double y2) {
        double yy;
        return yy = pow(y2 - y1, 2);
    }

    public double sqrtXY(double x1, double x2, double xx, double yy) {
        return sqrt (xx + yy);
    }
}
