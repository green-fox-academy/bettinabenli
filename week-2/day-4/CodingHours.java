public class CodingHours {
    public static void main(String[] args) {
        double hours = 6 * 17 * 5;
        double newhours = 52 * 17;
        int percentage = (int) Math.ceil((1 - (hours / newhours)) * 100);

        System.out.println(hours + " many hours is spent with coding in a semester by an attendee");
        System.out.println(percentage + "% of the coding hours in the semester if the average work hours weekly is 52");
    }
}