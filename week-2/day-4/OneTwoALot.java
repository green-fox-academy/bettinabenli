import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter any integer to check whether its odd or even!");
        number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Not enough!");
        }

        if (number == 1) {
            System.out.println("One");
        }

        if (number == 2) {
            System.out.println("Two");
        }

        if (number > 2) {
            System.out.println("A lot");
        }
    }
}
