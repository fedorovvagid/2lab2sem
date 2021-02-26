public class zadanie1_5 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println("r = " + Rek5(i));
        }
    }

    public static int Rek5(int r) {
        if (r == 0) {
            return 0;
        } else if (r == 1) {
            return 1;
        } else {
            return Rek5(r - 2) + Rek5(r - 1);
        }
    }
}