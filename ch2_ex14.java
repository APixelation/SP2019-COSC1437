import java.util.*;

public class ch2_ex14
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        // Volume is in liters
        final double VOLUME_OF_MILK_CARTON = 3.78;
        // Cost is per 1 liter
        final double COST_OF_MILK_PRODUCTION = .38;
        // Revenue is per carton sold
        final double PROFIT_FROM_MILK = .27;

        double milk_production, cost, profit;
        int total_milk_cartons;

        System.out.print("How much milk was made this morning (liters)? ");
        milk_production = console.nextInt();
        total_milk_cartons = (int) (milk_production / VOLUME_OF_MILK_CARTON);
        cost = COST_OF_MILK_PRODUCTION * milk_production;
        profit = PROFIT_FROM_MILK * total_milk_cartons;
        
        System.out.println("The number of cartons needed to hold the milk produced is " + total_milk_cartons + ".");
        System.out.println("The cost of production is $" + cost + ".");
        System.out.print("The total profit is $" + profit + ".");
    }
}
