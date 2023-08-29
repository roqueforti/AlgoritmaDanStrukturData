import java.util.Scanner;

public class praktikum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilaiTugas, nilaiUTS, nilaiUAS, nilaiMhs;

        System.out.println("==================");
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        System.out.println("==================");

        nilaiMhs = (nilaiTugas * 20 / 100) + (nilaiUTS * 35 / 100) + (nilaiUAS * 45 / 100);

        if (nilaiMhs <= 39) {
            System.out.println("Nilai akhir = " + nilaiMhs);
            System.out.println("Nilai huruf: E");
            System.out.println("---TIDAK LULUS---");
        } else if (nilaiMhs <= 50) {
            System.out.println("Nilai akhir =" + nilaiMhs);
            System.out.println("Nilai huruf: D");
            System.out.println("---TIDAK LULUS---");
        } else if (nilaiMhs <= 60) {
            System.out.println("Nilai akhir =" + nilaiMhs);
            System.out.println("Nilai huruf: C");
            System.out.println("---LULUS---");
        } else if (nilaiMhs <= 65) {
            System.out.println("Nilai akhir =" + nilaiMhs);
            System.out.println("Nilai huruf: C+");
            System.out.println("---LULUS---");
        } else if (nilaiMhs <= 73) {
            System.out.println("Nilai akhir =" + nilaiMhs);
            System.out.println("Nilai huruf: B");
            System.out.println("---LULUS---");
        } else if (nilaiMhs <= 80) {
            System.out.println("Nilai akhir =" + nilaiMhs);
            System.out.println("Nilai huruf: B+");
            System.out.println("---LULUS---");
        } else if (nilaiMhs <= 100) {
            System.out.println("Nilai akhir =" + nilaiMhs);
            System.out.println("Nilai huruf: A");
            System.out.println("---LULUS---");
        } else {
            System.out.println("ERROR");
        }
    }
}