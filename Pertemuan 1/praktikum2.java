import java.util.Scanner;

public class praktikum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hari[] = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu" };
        long n;

        System.out.print("Masukkan NIM: ");
        long nim = sc.nextLong();
        
        n = nim % 100;

        System.out.println("n : " + n);
        System.out.println("=============================");

        for (int i = 0; i < n; i++) {
            System.out.print(hari[i % 7] + " ");
        }
    }
}
