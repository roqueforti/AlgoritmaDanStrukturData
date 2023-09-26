import java.util.Scanner;

public class Tugas4 {
    public static int jumlahPenduduk;
    static final int MAX_nama = 5;
    static String[] nama = new String[MAX_nama];
    static int[] nik = new int[MAX_nama];
    static String[] alamat = new String[MAX_nama];
    static char[] jenisKelamin = new char[MAX_nama];
    static Scanner scan = new Scanner(System.in);

    public void inputData() {
        Scanner SC = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan jumlah penduduk: ");
        jumlahPenduduk = scan.nextInt();
        for (int i = 0; i < jumlahPenduduk; i++) {
            System.out.println("Penduduk ke-" + (i + 1));
            System.out.print("NIK : ");
            nik[i] = SC.nextInt();
            SC.nextLine();
            System.out.print("Nama : ");
            nama[i] = SC.nextLine();
            System.out.print("Alamat : ");
            alamat[i] = SC.nextLine();
            System.out.print("Jenis Kelamin (L/P) : ");
            jenisKelamin[i] = SC.next().charAt(0);
            System.out.println();
        }
    }

    public void tampilPenduduk() {
        System.out.println();
        System.out.println("====== Data penduduk ======");
        System.out.println("NO\tNIK\tNAMA\tALAMAT\tJENIS KELAMIN");
        for (int i = 0; i < jumlahPenduduk; i++) {
            System.out.print((i + 1) + "\t" + nik[i] + "\t" + nama[i] + "\t" + alamat[i] + "\t" + jenisKelamin[i]);
            System.out.println();
        }
    }

    public void cariDataPenduduk() {
        System.out.println();
        System.out.println("====== Cari Data Penduduk ======");
        System.out.println("Masukkan nama penduduk yang ingin di cari");
        scan.nextLine();
        String cariNama = scan.nextLine();
        for (int i = 0; i < jumlahPenduduk; i++) {
            if (cariNama.equalsIgnoreCase(nama[i])) {
                System.out.println("NO\tNIK\tNAMA\tALAMAT\tJENIS KELAMIN");
                System.out.print((i + 1) + "\t" + nik[i] + "\t" + nama[i] + "\t" + alamat[i] + "\t" + jenisKelamin[i]);
            }
        }
    }

}
