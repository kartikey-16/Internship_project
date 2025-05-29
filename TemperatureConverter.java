package converter;
import java.util.*;
public class TemperatureConverter {

	
	public static void main(String[] args) {
		
		int choice;
		double inputTemp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the temperature value : ");
		inputTemp = sc.nextDouble();
		
		System.out.println("Select the scale of input temperature :");
		  System.out.println("1. Celsius");
	       System.out.println("2. Fahrenheit");
	        System.out.println("3. Kelvin");
	        
	        choice = sc.nextInt();
	        
	        switch(choice)
	        {
	        case 1 : 
	        	convertFromCelsius(inputTemp);
	        	break;
	        case 2 : 
	        	convertFromFahrenheit(inputTemp);
	        	break;
	        case 3 : 
	        	convertFromKelvin(inputTemp);
	        	break;
	        default:
	        	System.out.println("Invalid choice : ");
	        	
	        }
	        sc.close();
	}
	
	
	 // Celsius to Fahrenheit and Kelvin
    public static void convertFromCelsius(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }

    // Fahrenheit to Celsius and Kelvin
    public static void convertFromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        double kelvin = celsius + 273.15;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + celsius);
        System.out.println("Kelvin: " + kelvin);
    }

    // Kelvin to Celsius and Fahrenheit
    public static void convertFromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Kelvin: " + kelvin);
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
