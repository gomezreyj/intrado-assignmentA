package assignmentA.main;

public class Divisible {

    public boolean divisibleBy(int theNumber, int divisibleBy)
    {
        return ( theNumber % divisibleBy == 0 ? true : false);
    }

    public static void main(String[] args)
    {
        Divisible div = new Divisible();
        boolean divBy5;
        boolean divBy3;

        for ( int i = 1; i <= 1000; i++)
        {
            divBy5 = div.divisibleBy(i,5);
            divBy3 = div.divisibleBy(i,3);

            System.out.print(i + " ");

            if ( divBy3 && divBy5 )
                System.out.println("Teamwork");
            else
            if ( divBy3 )
                System.out.println("Team");
            else
            if ( divBy5 )
                System.out.println("work");
            else
                System.out.println("noise");
        }
    }
}
