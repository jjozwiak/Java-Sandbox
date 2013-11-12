
public class Payroll 
{
    private int[] employeeId = new int[7];
    private int[] hours = new int[7];
    private double[] payRate = new double[7];
    private double[] wages = new double[7];

    public Payroll()
    {
        employeeId[0] = 5658845;
        employeeId[1] = 4520125;
        employeeId[2] = 7895122;
        employeeId[3] = 8777541;
        employeeId[4] = 8451277;
        employeeId[5] = 1302850;
        employeeId[6] = 7580489;
    }

    public int getEmployeeId(int index)
    {
        return employeeId[index];
    }
    public void setEmployeeHours(int index, int hoursTotal)
    {
        hours[index] = hoursTotal;
    }
    public void setEmployeePayRate(int index, double employeePayRate)
    {
        payRate[index] = employeePayRate;
    }
    public void setEmployeeWages(int index)
    {
        wages[index] = payRate[index] * hours[index];
    }
    public double getEmployeeWages(int index)
    {
        return wages[index];
    }
}