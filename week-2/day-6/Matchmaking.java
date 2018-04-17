import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
        ArrayList<String> makingMatches = new ArrayList<String>(Arrays.asList());

        int i = 0;
        while (i <girls.size() && i < boys.size()){
            makingMatches.add(girls.get(i));
            makingMatches.add(boys.get(i));
            i++;
        }
        for (int j = 0; j < makingMatches.size(); j++) {
            System.out.print(makingMatches.get(j) + " , ");
        }
    }
}