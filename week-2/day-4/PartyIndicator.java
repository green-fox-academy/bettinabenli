import java.util.Scanner;

public class PartyIndicator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many girls coming to the party? ");
        int numberOfGirlz = in.nextInt();

        System.out.println("How many boys coming to the party? ");
        int numberOfBoyz = in.nextInt();

        if ((numberOfGirlz == numberOfBoyz) && (numberOfGirlz + numberOfBoyz > 20)) {
            System.out.println("The party is exellent");
        }

        if ((numberOfGirlz != numberOfBoyz) && (numberOfGirlz + numberOfBoyz > 20) && (numberOfGirlz!=0)) {
            System.out.println("Quite cool party!");
        }

        if (numberOfGirlz + numberOfBoyz < 20) {
            System.out.println("Average party!");
        }

        if (numberOfGirlz == 0) {
            System.out.println("Sausage party!");
        }

    }
}