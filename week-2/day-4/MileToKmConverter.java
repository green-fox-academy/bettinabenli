import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        System.out.println("Please enter the number of km you would like to convert!");
        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();

        System.out.println("The distence you entered in miles: " + km*0.621371);

    }
}