import java.util.Scanner;
class Cuboid
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 15;
        int c = 12;

        double volume = a * b * c;
        double surface = (2*((a*b)+(b*c)+(c*a)));

        System.out.println("The volume is: " + volume);
        System.out.println("The surface is: " + surface);

    }
}