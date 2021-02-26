import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Длина массива: ");
        int i = sc.nextInt();
        Rek2(0, new int[i], 0);
    }

    public static void Rek2(int x, int[] array, int y) {
        if (x < array.length) {
            System.out.println("Значение " + x + " элемента: ");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            array[x] = data;
            Rek2(x + 1, array, 0);
        } else if (y < array.length) {
            System.out.print("[" + array[y] + "] ");
            Rek2(x, array, y + 1);
        }
    }
}
