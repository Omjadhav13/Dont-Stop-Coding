package FormulaBasedQuestions;

import java.util.Scanner;

public class FahrenheitToCelsiusConversion {

    static TemperatureConversion fahrenheitToCelsius=temperature->(temperature -32)*5.0/9.0;

    static void main(String[] args) {
        FahrenheitToCelsiusConversion fc=new FahrenheitToCelsiusConversion();
        System.out.println("Enter temperature in Fahrenheit:");
        Scanner sc=new Scanner(System.in);
        int temperature=sc.nextInt();
        System.out.println("Temperature in degree Celsius is: " +fahrenheitToCelsius.convert(temperature));
    }
}
