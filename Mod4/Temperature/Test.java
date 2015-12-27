public class Test {
    public static void main(String[] args){
        Temperature x = new Temperature();

        CelsiusToFahrenheit cToF = new CelsiusToFahrenheit();
        FahrenheitToCelsius fToC = new FahrenheitToCelsius();

        System.out.println("Celsius to Fahrenheit " + x.temperature(cToF));
        System.out.println("Fahrenheit to Celsius " + x.temperature(fToC));
    }

}
