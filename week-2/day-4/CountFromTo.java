import java.util.*;

class ountFromTo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int number = scanner.nextInt();
        int number1 = scanner.nextInt();

        if (number1 < number) {
            System.out.println("The second number should be bigger than the first!");
        } else {
            for (int i = number; i < number1; i++) {
                System.out.println(i);
            }
        }
    }
}