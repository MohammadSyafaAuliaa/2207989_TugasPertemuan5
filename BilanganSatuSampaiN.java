import java.util.Scanner;

public class BilanganSatuSampaiN {
    
    static void cetakBilangan(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int batas;

        // Menginput nilai batas
        System.out.println("Masukkan Bilangan Batas : ");
        batas = scanner.nextInt();
        
        cetakBilangan(batas);
    }
}
