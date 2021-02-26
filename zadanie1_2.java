public class zadanie1_2 {
    public static void rek(int x) {
        if ((2 * x + 1) < 20) {
            rek(2 * x + 1);
        }
        System.out.println("x=" + x);
    }

    public static void main(String[] args) {
        rek(1);
    }
}

