public class ConstructorTestRun
{
    public static void main(String[] args)
    {      

        int[] sum = {10, 20, 30, 40};

        ConstructorTest myTest = new ConstructorTest(sum);

        System.out.println(myTest.yearModel);
        System.out.println(myTest.make);

    }
}