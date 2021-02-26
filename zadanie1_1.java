public class zadanie1_1 {
    public static void main(String[] args) {
        Rek(1);
    }

    public static void Rek(int x) {
        System.out.println("x =" + x);
        if ((2 * x + 1) < 20) {
            Rek(2 * x + 1);
        }
    }
}
