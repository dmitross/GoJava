public class CelsiusToFahrenheit implements Temperatureable {
    double c = 22;
    @Override
    public double getResult () {
        return (c*1.8)+32;
    }



}
