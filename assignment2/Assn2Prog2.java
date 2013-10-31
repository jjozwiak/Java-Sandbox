import java.util.Scanner;

public class Assn2Prog2
{
    public static void main(String[] args)
    {      

        int numberOfStockSales;
        double profitLoss = 0;

        Scanner keyboard =  new Scanner(System.in);

        System.out.print("How many stock sales would you like to calculate? Please enter a number greater than 0: ");

        numberOfStockSales = keyboard.nextInt();

        while(numberOfStockSales <= 0)
        {
            System.out.println("Sorry, " + numberOfStockSales + " is not a valid number.");
            System.out.print("Please enter a number greater than 0:");

            numberOfStockSales = keyboard.nextInt();
        }

        for(int i = 1; i <= numberOfStockSales; ++i)
        {
            double numberOfShares = 0;
            double purchasePricePerShare = 0;
            double purchaseCommissionPaid = 0;
            double salePricePerShare = 0;
            double saleCommissionPaid = 0;

            System.out.print("Please enter the number of shares: ");
            numberOfShares = keyboard.nextDouble();

            System.out.print("Please enter the purchase price per share: ");
            purchasePricePerShare = keyboard.nextDouble();

            System.out.print("Please enter the purchase commission paid: ");
            purchaseCommissionPaid = keyboard.nextDouble();

            System.out.print("Please enter the sale price per share: ");
            salePricePerShare = keyboard.nextDouble();

            System.out.print("Please enter the sale commission paid: ");
            saleCommissionPaid = keyboard.nextDouble();

            double result = profitOrLoss(numberOfShares, purchasePricePerShare, purchaseCommissionPaid, salePricePerShare, saleCommissionPaid);

            profitLoss += result;

        }

        if(profitLoss >= 0)
        {
            System.out.println("You had a profit of " + profitLoss + " dollars.");
        }
        else
        {
            System.out.println("You had a loss of " + profitLoss + " dollars.");
        }

    }
    public static double profitOrLoss(double numberOfShares, double purchasePricePerShare, double purchaseCommissionPaid, double salePricePerShare, double saleCommissionPaid)
    {
        return ((numberOfShares * salePricePerShare) - saleCommissionPaid) - ((numberOfShares * purchasePricePerShare) + purchaseCommissionPaid);
    }
}