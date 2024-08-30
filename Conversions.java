import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell & Kyan Canazares
 * @version 8/23/2024
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
while(true){
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Miles to Kilometers");
        System.out.println("8. Kilometers to Miles");
        System.out.println("9. Inches to Centimeters");
        System.out.println("10. Centimeters to Inches");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        else if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit - 32) / 2;
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");
        }
        else if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet * 0.3048;
            System.out.println(feet + " feet is equivalent to " + meters + " meters");
        }
        else if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters * 3.28084;
            System.out.println(meters + " meters is equivalent to " + feet + " feet");
        }
        else if (selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces * 29.5735;
            System.out.println(ounces + " ounces is equivalent to " + milliliters + " milliliters");
        }
        else if (selection == 6)
        {
            System.out.println("Enter Milliliters: ");
            double milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = milliliters * 0.033814;
            System.out.println(milliliters + " milliliters is equivalent to " + ounces + " ounces");
        }
        else if (selection == 7)
        {
            System.out.println("Enter Miles: ");
            double miles = keyboard.nextDouble();
            keyboard.nextLine();
            double kilometers = miles * 1.60934;
            System.out.println(miles + " miles is equal to " + kilometers + " kilometers");
        }
        else if (selection == 8)
        {
            System.out.println("Enter Kilometers: ");
            double kilometers = keyboard.nextDouble();
            keyboard.nextLine();
            double miles = kilometers * 0.621371;
            System.out.println(kilometers + " kilometers is equal to " + miles + " miles");
        }
        else if (selection == 9)
        {
            System.out.println("Enter Inches: ");
            double inches = keyboard.nextDouble();
            keyboard.nextLine();
            double centimeters = inches * 2.54;
            System.out.println(inches + " inches is the same as " + centimeters + " centimeters");
        }
        else if (selection == 10)
        {
            System.out.println("Enter Centimeters: ");
            double centimeters = keyboard.nextDouble();
            keyboard.nextLine();
            double inches = centimeters * 0.393701;
            System.out.println(centimeters + " centimeters is the same as " + inches + " inches");
        }
    else {break;}
    }
}

}