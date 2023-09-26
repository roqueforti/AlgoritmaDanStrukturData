import java.util.Scanner;

public class Tugas1 {
    static Scanner input = new Scanner(System.in);

    static int search(int[] arr, int num){
        for (int i=0; i<arr.length; i++){
            if (arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arrInt= {17,20,26,33,37,41,53,65, 73, 83};
        
        System.out.print("Masukkan data yang ingin dicari: ");
        int cari = input.nextInt();
        int hasil = search(arrInt, cari);
        if (hasil ==-1) {
            System.out.println("Elemen "+cari+" tidak ditemukan");
        } else {
            System.out.println("Elemen "+cari+" ditemukan pada posisi ke-"+hasil);

        }    
    }
}
