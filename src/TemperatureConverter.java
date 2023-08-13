import java.util.Scanner;

public class TemperatureConverter {
    public void temperature() {
        Scanner scanner = new Scanner(System.in);
        
       
        	 System.out.println("Temperature Converter");
             System.out.println("=====================");
             
             System.out.print("Enter temperature value: ");
             double temperature = scanner.nextDouble();
             System.out.println("===================");
             
             System.out.println("Enter unit of given measurement : ");
             System.out.println("1 for celsius");
             System.out.println("2 for Fahrenheit");
             System.out.println("=================================");
             System.out.println();

        	
        	
        int unit = scanner.nextInt();
        
        double convertedTemp;
        
        if (unit == 1) {
            convertedTemp = (temperature * 9/5) + 32;
            System.out.println(temperature+"c is equals to " + convertedTemp+"F");
            System.out.println("");
            System.out.println("");
        } else if (unit == 2) {
            convertedTemp = (temperature - 32) * 5/9;
            System.out.println(temperature+"F is equals to "+convertedTemp+"C");
            System.out.println("");
            System.out.println("");
        } else {
            System.out.println("Invalid unit. Please enter '1' for Celsius or '2' for Fahrenheit.");
        }
        
        
    }
}
