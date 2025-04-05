package Q1;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter temperature in celsius");
            double celsiusInput=input.nextDouble();
            Q1.Temperature temperature=new Q1.Temperature(celsiusInput);
            System.out.println("temperature in fahrenheit:"+temperature.toFahrenheit());
            System.out.println("Enter temperature in F to convert to c");
            double  fahrenheitInput=input.nextDouble();
            temperature.setFahrenheit(fahrenheitInput);
            System.out.println("convert to c:"+temperature.toCelsius());
            input.close();
        }

}
