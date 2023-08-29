import java.util.Scanner;

public class tugas3 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan n: ");
        int n = sc.nextInt();
        
        System.out.print("Hasil: ");
        int count = 0;
        for (int i = 2; count < n; i += 2) {
            if (i % 4 != 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        
        sc.close();
    }
}
