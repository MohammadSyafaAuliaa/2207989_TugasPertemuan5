import java.util.Scanner;

public class Segitiga {
    static Scanner scanner = new Scanner(System.in);

    static void tipe(int a, int b, int c) {
        if (a + b > c) {
            if (a * a + b * b == c * c) {
                System.out.println("Segitiga Siku-siku");
            } else if (a * a + b * b < c * c) {
                System.out.println("Segitiga Tumpul");
            } else {
                System.out.println("Segitiga Lancip");
            }
        } else {
            System.out.println("Tidak membentuk segitiga");
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan panjang sisi a: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan panjang sisi b: ");
        int b = scanner.nextInt();

        System.out.print("Masukkan panjang sisi c: ");
        int c = scanner.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        tipe(a, b, c);
    }
}
