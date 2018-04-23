import java.util.Scanner;

public class PrintBigger
{
    public static void main(String args[])
    {
        int a, b, bigger;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two number: ");
        a = scan.nextInt();
        b = scan.nextInt();

        if (a > b)
        {
            bigger = a;
        }
        else
        {
            bigger = b;
        }

        System.out.print("The bigger you entered is: " + bigger);
    }
}