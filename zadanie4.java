public class zadanie4 {
    public static void main(String[] args) {
        rek(-4, -1, 2, 1, 0.0001);
    }

    public static double f(double x) {
        return Math.pow(x, 3) + 3 * Math.pow(x, 2) - 6 * x - 8;
    }

    public static void rek(double q, double w, double e, int k, double EPS) {
        if ((w - q) > EPS) {
            e = (q + w) / 2;
            if ((f(e) * f(q) < 0) && (f(e) != 0)) {
                System.out.println(k + " итерация");
                System.out.println(" x* = " + (w + q) / 2);
                System.out.println(" f(x) =" + f(e));
                w = e;
                rek(q, e, e, k + 1, EPS);
            } else if (f(e) != 0) {
                System.out.println(" x* = " + (w + q) / 2);
                System.out.println(" f(x) =" + f(e));
                System.out.println(k + " итерация");
                q = e;
                rek(e, w, e, k + 1, EPS);
            } else if (f(e) == 0) {
                System.out.println(" x* = " + (w + q) / 2);
                System.out.println(" f(x) =" + f(e));
                System.out.println(k + " итерация");
            }
        }
    }
}