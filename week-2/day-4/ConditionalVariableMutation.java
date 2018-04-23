public class ConditionalVariableMutation {
    public static void main(String[] args) {


        double a = 24;
        int out = 0;

        if (a % 2 == 0) {
            out++;
            System.out.println(out);
        }

        int b = 13;
        String out2 = "";

        if (10 < b && b < 20) {
            System.out.println(out2 = "Sweet");
        }

        if (10 > b) {
            System.out.println(out2 = "Less");
        }

        if (20 < b) {
            System.out.println(out2 = "More");
        }

        int c = 123;
        int credits = 100;
        boolean isBonus = false;

        if (credits >= 50 && isBonus == false) {
            c -= 2;
        } else if (credits < 50 && isBonus == false) {
            c--;
        }
        System.out.println(c);

        int d = 8;
        int time = 120;
        String out3 = "";

        if ((d % 4 == 0) && (time <= 200)) {
            out3 = "check";
        } else if (time > 200) {
            out3 = "Time out";
        } else {
            out3 = "Run Forest Run!";
        }

        System.out.println(out3);
    }
}
