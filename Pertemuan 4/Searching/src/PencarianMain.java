import java.util.Scanner;

public class PencarianMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] data = {2.7, 2.9, 3.04, 3.12, 2.54, 2.87, 3.9};
        OrderedSearch os = new OrderedSearch(data);
        System.out.println("Isi elemen array: ");
        os.tampilkan();
        
        System.out.println();

        System.out.println("Masukkan elemen: ");
        double key = sc.nextDouble();
        
        int index = os.cari(key);
        if (index!=-1) {
            System.out.println("data " + key + " pada index " + index);
        } else {
            System.out.println("Data " + key + " tidak ditemukan");
        }
    }
}
