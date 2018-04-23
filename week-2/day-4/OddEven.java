import java.util.*;

public class OddEven
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter any integer to check whether its odd or even!");
        number = scanner.nextInt();
        if(number%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}