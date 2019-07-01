/* Write a class that contains the following methods.

 */

public class ConversionCelsiusFahrenheit {
    public static void main(String[] args){



        System.out.printf("%s  %10s | %15s %15s","Celsius","Fahrenheit", "Fahrenheit", "Celsius \n");

        for(double celsius = 40,fahrenheit = 120; celsius >= 31 && fahrenheit <516; celsius--,fahrenheit-=10)
            {
                System.out.printf("%.1f %10.1f     |  %10.1f %15.1f \n", celsius,celsiusToFahrenheit(celsius),
                        fahrenheit ,fahrenheitToCelsius(fahrenheit)
                       );
            }
    }

    public static double celsiusToFahrenheit(double celsius){
        return(9.0/5) * celsius +32.0;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0/9)*(fahrenheit-32.0);
    }
}
