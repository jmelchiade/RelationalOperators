public class relational

{
    public static void main (String arg[])
    {
        byte x = 20;
        long y = 20;
        char z = 'y';
        int a = 50;
        float b = 100.0F;
        double c = 100.0;

        String s = String.format("%d > %d %b %n", x, y, (x > y));
        s += String.format("%d != %c %b %n", x, z, (x != z));
        s += String.format("%d >= %5.1f %b %n", a, b, (a > b));
        s += String.format("%d == %d %b %n", x, y, (x == y));
        s += String.format("%5.1f != %5.1f %b %n", b, c, (b != c));
        s += String.format("%d <= %5.1f %b %n", a, c, (a <= c));
        System.out.printf(s);
    }

}