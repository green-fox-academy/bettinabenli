public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        StringBuilder betweenItandYou = new StringBuilder(quote);

        int index = betweenItandYou.indexOf("you");
        betweenItandYou = betweenItandYou.insert(index, "always takes longer than ");
        quote = betweenItandYou.toString();

        System.out.println(quote);
    }
}