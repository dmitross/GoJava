package Temprature;

public class CalculatorOfTemperature  {

    public double covertCelsToFahreng (double celsius) {
       return  (celsius * 1.8) + 32;
    }

    public double convertFahrengToCels (double fahrenheit) {
        return (fahrenheit -32) / 1.8;
    }
}


