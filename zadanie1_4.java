import java.util.Scanner;


public class zadanie1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n, 2, 1);
    }

    public static void fact(int n, int i, int result) {
        if ((n > 1) && (i <= n)) {
            result = result * i;
            fact(n, i + 1, result);
        } else {
            System.out.println(result);
        }
    }
}