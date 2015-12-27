public class FahrenheitToCelsius implements Temperatureable {
    double f = 75;
    @Override
    public double getResult(){
        return (f-32)/1.8;
    }
}
