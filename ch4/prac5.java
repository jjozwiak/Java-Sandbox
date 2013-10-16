public class Prac5 {
    public static void main(String[] args) {

    	double numerator = 1;
    	double denominator = 30;
        double total = 0;

    	for(int i = 1; i <=30; i++ )
    	{

            total += numerator/denominator;

            System.out.println("The current total is " + total);

            --denominator;
            ++numerator;

    	}

    	System.out.println("The FINAL total is " + total);
        
    }
}