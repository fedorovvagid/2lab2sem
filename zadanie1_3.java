public class zadanie1_3 {
    private static int step = 0;

    public static void rek(int x) {
        space();
        System.out.println("" + x + "-> ");
        step++;
        if ((2 * x + 1) < 20) {
            rek(2 * x + 1);
        }
        step--;
        space();
        System.out.println("" + x + " <-");
    }

    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        rek(1);
    }


}
