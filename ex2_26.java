import java.util.*;

public class ex2_26
{
    static final int NUMBER = 12;

    static Scanner console = new Scanner(System.in);
    public static void main(String[] args)
    {
        int firstNum;
        int secondNum;

        firstNum = 18;
        System.out.println("Line 11: firstNum = " 
                        + firstNum);
        System.out.print("Line 12: Enter an integer: ");
        secondNum = console.nextInt();
        System.out.println();

        System.out.println("Line 15: secondNum = "
                        + secondNum);
        
        firstNum = firstNum + NUMBER + 2 * secondNum;

        System.out.println("Line 17: The new value of " +
                            "firstNumb = " + firstNum);
    }
}