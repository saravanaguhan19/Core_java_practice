public class OpEquals {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;

        int x, y;

        x = 42;
        y = x++;

        System.out.println(x + " " + y);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }

}
