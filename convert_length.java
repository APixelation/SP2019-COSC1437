import java.util.*;

public class convert_length
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        final double CENTIMETERS_PER_INCH = 2.54;
        final int INCHES_PER_FOOT = 12;
        int feet;
        int inches;
        int totalInches;
        double centimeters;

        System.out.print("Please enter a measurement in feet: ");
        feet = console.nextInt();

        System.out.print("Please enter a measurement in inches: ");
        inches = console.nextInt();

        System.out.println("Converting..");
        totalInches = inches + (feet / INCHES_PER_FOOT);
        centimeters = totalInches *CENTIMETERS_PER_INCH;

        System.out.print("Your input was: " + feet + " feet and " + inches + " inches. " +
        "That converts to " + centimeters + " centimeters.");

    }
}