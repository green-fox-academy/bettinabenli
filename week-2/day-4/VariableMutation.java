public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *=2 ;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e*=e*e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean bigger = f1 > f2;
        System.out.println(bigger);

        int g1 = 350;
        int g2 = 200;
        boolean doublebigger = g1 < (g2 * 2);
        System.out.println(doublebigger);


        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        boolean elevenisdivisor = ((h % 11) == 0);
        System.out.println(elevenisdivisor);

        int i1 = 10;
        int i2 = 3;
        boolean ishigher = (i1 > i2 * i2) && (i1 < i2 * i2 * i2);
        System.out.println(ishigher);
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)


        int j = 1521;
        boolean isdividable = (j % 3 == 0) || (j % 5 == 0);
        System.out.println(isdividable);
        // tell if j is dividable by 3 or 5 (print as a boolean)




        String k = "Apple";
        k = k + k + k + k;
        System.out.println(k);
    }
}