public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        double bmi = massInKg/heightInM;
        System.out.format("%.3f%n", bmi);
    }
}