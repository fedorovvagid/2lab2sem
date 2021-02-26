import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Rek2(x);
    }

    public static void Rek2(int x) {
        if (x != 1) {
            Rek2(x / 2);
        }
        System.out.print(x % 2);
    }

}