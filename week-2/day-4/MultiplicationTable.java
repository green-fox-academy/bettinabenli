import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type in a number, please!");
        int number = in.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + number + " = " + (i * number));
        }
    }
}