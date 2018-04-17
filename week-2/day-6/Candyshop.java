import java.util.*;

public class Candyshop {
    public static void main(String... args) {
        ArrayList<Object> sweets = new ArrayList<Object>();
        sweets.add("Cupcake");
        sweets.add(2);
        sweets.add("Brownie");
        sweets.add(false);
        sweets.remove(1);
        sweets.add(1, "Croissant");
        sweets.remove(3);
        sweets.add(3, "Ice cream");

        System.out.println(sweets);
    }
}