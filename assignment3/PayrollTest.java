import java.util.Scanner;

public class PayrollTest
{
    public static void main(String[] args)
    {
        //instantiate a new payroll object
        Payroll payroll = new Payroll();

        for(int i = 0; i < 7; i++)
        {
            Scanner keyboard = new Scanner(System.in);

            int currentEmployeeId = payroll.getEmployeeId(i);

            System.out.print("Please enter the hours for employee - " + currentEmployeeId + ": ");

            int hours = keyboard.nextInt();

            payroll.setEmployeeHours(i, hours);

            System.out.print("Please enter the pay rate for employee - " + currentEmployeeId + ": ");

            double payRate = keyboard.nextDouble();

            payroll.setEmployeePayRate(i, payRate);

            payroll.setEmployeeWages(i);

        }

        for(int i = 0; i < 7; i++)
        {
            int currentEmployeeId = payroll.getEmployeeId(i);

            double currentEmployeeWages = payroll.getEmployeeWages(i);

            System.out.printf("Employee %d wages are $%.2f\n", currentEmployeeId, currentEmployeeWages);
        }
    }
}