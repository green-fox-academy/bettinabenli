import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        try {
            int result = number / 10;
            if (number != 0) {
                System.out.println(result);
            } else {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }
}
