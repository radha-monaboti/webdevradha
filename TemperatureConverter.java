import java.util.Scanner;
public class TemperatureConverter{
public static void main(String[]args){
Scanner scanner=new Scanner (System.in);
System.out.println("Enter temperature in Celsius:");
double Celsius=scanner.nextDouble();
double Fahrenheit=(Celsius*9/5)+32;
System.out.println("Temperature in Fahrenheit:"+Fahrenheit);
System.out.println("Enter Temperature in Fahrenheit:");
Fahrenheit=scanner.nextDouble();
Celsius=(Fahrenheit-32)*5/9;
System.out.println("Temperature in Celsius:"+Celsius);
}
}

