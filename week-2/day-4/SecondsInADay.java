public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int remainingSeconds = 86400 - (14*3600+34*60+42);
        System.out.println("The remaining seconds of today from the current time: " + remainingSeconds);
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
    }
}