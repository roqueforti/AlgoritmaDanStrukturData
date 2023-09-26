import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[10];
        mhs[0] = new Mahasiswa("2241760051", "Hilman", 3.9);
        mhs[1] = new Mahasiswa("2241760052", "Zahrawa", 3.9);
        mhs[2] = new Mahasiswa("2241760053", "Budiarto", 3.75);
        mhs[3] = new Mahasiswa("2241760054", "Adristhi", 3.5);
        mhs[4] = new Mahasiswa("2241760055", "Maheswari", 3.92);
        mhs[5] = new Mahasiswa("2241760056", "Putri", 3.6);
        mhs[6] = new Mahasiswa("2241760057", "Doni", 3.7);
        mhs[7] = new Mahasiswa("2241760058", "Pramana", 3.3);
        mhs[8] = new Mahasiswa("2241760059", "Putra", 3.55);
        mhs[9] = new Mahasiswa("2241760060", "Wiesye", 3.65);

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama mahasiswa yang dicari: ");
        String cari = sc.next();
        int salah = 0;
        
        
        for (int i=0; i<mhs.length; i++) {
            if (cari.equalsIgnoreCase(mhs[i].namaMahasiswa)) {
                System.out.println("Nama " + mhs[i].namaMahasiswa);
                System.out.println("NIM " + mhs[i].nim);
                System.out.println("IPK " + mhs[i].ipk);
            } else {
                salah += 1;
                System.out.println("Data tidak ditemukan!");
            }
        }
    }
}
