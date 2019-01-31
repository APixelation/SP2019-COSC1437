import java.util.*;

public class Ch2_PrExercise5
{
    static Scanner console = new Scanner(System.in);
    
    public static void main (String[] args)
    {
        int width;
        int length;
        int area;
        int perimeter;

        System.out.print("Enter the length: ");
        width = console.nextInt();
        System.out.println();

        System.out.print("Enter the width: ");
        length = console.nextInt();
        System.out.println();

        area = length * width;
        perimeter = 2 * (length + width);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

    }
}