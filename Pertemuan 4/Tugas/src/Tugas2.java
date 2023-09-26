import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        String[][] dataMahasiswa = {
            {"Alfi", "Safira", "Tiara", "Arif", "Erdi"},
            {"Yudha", "Nisa", "Yulia", "Fauzan", "Dwi"},
            {"Dewa", "Ana", "Abdul", "Dani", "Ammar"}
        };

        tampilkanData(dataMahasiswa);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nama mahasiswa yang dicari: ");
        String namaCari = sc.nextLine();

        boolean ditemukan = false;
        int kelompok = -1;
        int urutan = -1;

        for (int i = 0; i < dataMahasiswa.length; i++) {
            for (int j = 0; j < dataMahasiswa[i].length; j++) {
                if (namaCari.equalsIgnoreCase(dataMahasiswa[i][j])) {
                    kelompok = i + 1; 
                    urutan = j + 1; 
                    ditemukan = true;
                    break; 
                }
            }
            if (ditemukan) {
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Mahasiswa " + namaCari + " ditemukan di Kelompok " + kelompok + " Urutan " + urutan);
        } else {
            System.out.println("Mahasiswa " + namaCari + " tidak ditemukan.");
        }
    }

    public static void tampilkanData(String[][] data) {
        System.out.println("Data Mahasiswa dalam Tabel:");

        for (int i = 0; i < data.length; i++) {
            System.out.print("Kelompok " + (i + 1) + " : ");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]);
                if (j < data[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
