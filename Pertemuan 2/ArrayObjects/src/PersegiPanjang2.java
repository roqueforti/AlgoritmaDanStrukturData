import java.util.Scanner;

public class PersegiPanjang2 {
    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        PersegiPanjang2[] ppArray = new PersegiPanjang2[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; 1 < 3; i++) {
            ppArray[i] = new PersegiPanjang2();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
            System.out.println("Persegi panjang ke-"+ i + ", panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
            System.out.println();
        } 
        
        
    }
}