public class Square {
    public int rectangle(int a, int b) {
        return a * b;
    }

    public double triangle(double a, double b) {
        return 0.5 * a * b;
    }

    public double circle(double a) {
        // S= pi*r2
        double s;
        double pi = 3.14;
        s = pi * (a * a);
        return s;
    }
}