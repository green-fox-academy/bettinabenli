import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        System.out.println("Please enter the number of chicken you have!");
        Scanner scanner = new Scanner(System.in);
        int chicken = scanner.nextInt();
        System.out.println("Please enter the number of pigs you have!");
        int pig = scanner.nextInt();

        System.out.println("Total number of legs of the animals: " + (chicken * 2 + pig * 4));
    }
}
