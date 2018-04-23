import java.util.Scanner;

public class AvarageOfInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type in the first number: ");
        int num1 = in.nextInt();

        System.out.println("Type in the second number: ");
        int num2 = in.nextInt();

        System.out.println("Type in the third number: ");
        int num3 = in.nextInt();

        System.out.println("Type in the fourth number: ");
        int num4 = in.nextInt();

        System.out.println("Type in the fifth number: ");
        int num5 = in.nextInt();

        System.out.println("The sum of these numbers is: " + (num1 + num2 + num3 + num4 + num5));
        System.out.println("Average of five numbers is: " + (num1 + num2 + num3 + num4 + num5) / 5);

    }
}