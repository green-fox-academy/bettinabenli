import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++)
        {
            for (int j = number; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}
