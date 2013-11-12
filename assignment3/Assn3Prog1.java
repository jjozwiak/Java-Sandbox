public class Assn3Prog1
{
	private double day1Total = 0;
    private double day2Total = 0;
    private double day3Total = 0;
    private double day4Total = 0;
    private double day5Total = 0;
    private double day6Total = 0;
    private double day7Total = 0;

    public Assn3Prog1(double[] dailyValues)
    {
    	day1Total = dailyValues[0];
    	day2Total = dailyValues[1];
    	day3Total = dailyValues[2];
    	day4Total = dailyValues[3];
    	day5Total = dailyValues[4];
    	day6Total = dailyValues[5];
    	day7Total = dailyValues[6];

    }

    public double getDay1Total()
    {
    	return day1Total;
    }
    public double getDay2Total()
    {
    	return day2Total;
    }
    public double getDay3Total()
    {
    	return day3Total;
    }
    public double getDay4Total()
    {
    	return day4Total;
    }
    public double getDay5Total()
    {
    	return day5Total;
    }
    public double getDay6Total()
    {
    	return day6Total;
    }
    public double getDay7Total()
    {
    	return day7Total;
    }
    public double getWeekTotal()
    {
    	double total = day1Total + day2Total + day3Total + day4Total + day5Total + day6Total + day7Total;
    	return total;
    }
    public double getWeekAverage()
    {
    	double total = getWeekTotal();
    	double average = total/7;
    	return average;
    }

}