import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pembeli {
    String namaPembeli;
    String noHp;

    public Pembeli(String namaPembeli, String noHp) {
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }
}

class Pesanan {
    int kodePesanan;
    String namaPesanan;;
    int harga;

    public Pesanan(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }
}

public class UTSMain {
    public static void main(String[] args) {
        Queue<Pembeli> antrian = new LinkedList<>();
        Queue<Pesanan> pesananQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Informasi pembuat program
        System.out.println("Dibuat oleh: Hilman Zahrawa Budiarto");
        System.out.println("NIM: 2241760051");
        System.out.println("Absen: 12");
        System.out.println("===============================");
        System.out.println("Sistem Antrian Resto Royal Delish");

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan Pesanan by Nama");
            System.out.println("5. Hitung Total Pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih (1-6): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Tambah Antrian
                    System.out.println("------------------------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("------------------------------------");
                    System.out.print("Nomor Antrian: ");
                    int nomorAntrian = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Nama Customer: ");
                    String namaCustomer = scanner.nextLine();
                    System.out.print("Nomor HP: ");
                    String nomorHp = scanner.next();
                    Pembeli pembeli = new Pembeli(namaCustomer, nomorHp);
                    antrian.add(pembeli);
                    System.out.println("Pembeli ditambahkan ke antrian.");
                    break;

                case 2:
                    // Cetak Antrian
                    System.out.println("+++++++++++++++++++++++++++++");
                    System.out.println("Daftar Antrian Resto Royal Delish");
                    System.out.println("+++++++++++++++++++++++++++++");
                    int counter = 1;
                    for (Pembeli p : antrian) {
                        System.out.println("| " + counter + "\t\t| " + p.namaPembeli + "\t\t\t| " + p.noHp);
                        counter++;
                    }
                    System.out.println("Total Antrian: " + antrian.size());
                    break;

                case 3:
                    // Hapus Antrian
                    System.out.println("Pilih nomor antrian yang akan dihapus: ");
                    int nomorAntrianHapus = scanner.nextInt();
                    int i = 1;
                    boolean found = false;
                    for (Pembeli p : antrian) {
                        if (i == nomorAntrianHapus) {
                            System.out.println(p.namaPembeli + " telah memesan Menu");
                            System.out.println("--------------------------------------------------");
                            System.out.println("Transaksi Input Pesanan");
                            System.out.println("--------------------------------------------------");
                            System.out.print("Nomor pesanan: ");
                            int nomorPesanan = scanner.nextInt();
                            scanner.nextLine(); // Consume newline character
                            System.out.print("Pesanan: ");
                            String namaPesanan = scanner.nextLine();
                            System.out.print("Harga: ");
                            int harga = scanner.nextInt();
                            Pesanan pesanan = new Pesanan(nomorPesanan, namaPesanan, harga);
                            pesananQueue.add(pesanan);
                            System.out.println("++++++++++++++++++++++++++++++");
                            System.out.println("Daftar Pesanan Masuk Resto Royal Delish");
                            System.out.println("++++++++++++++++++++++++++++++");
                            for (Pesanan ps : pesananQueue) {
                                System.out.println("| " + ps.kodePesanan + "\t\t| " + ps.namaPesanan + "\t\t\t| " + ps.harga);
                            }
                            System.out.println("Semua Pesanan Berhasil Dicetak");
                            antrian.remove(p);
                            found = true;
                            break;
                        }
                        i++;
                    }
                    if (!found) {
                        System.out.println("Nomor antrian tidak valid.");
                    }
                    break;

                case 4:
                    // Pengurutan Pesanan by Nama (Bubble Sort)
                    Pesanan[] pesananArray = pesananQueue.toArray(new Pesanan[0]);
                    int n = pesananArray.length;
                    for (int x = 0; x < n - 1; x++) {
                        for (int y = 0; y < n - x - 1; y++) {
                            if (pesananArray[y].namaPesanan.compareTo(pesananArray[y + 1].namaPesanan) > 0) {
                                Pesanan temp = pesananArray[y];
                                pesananArray[y] = pesananArray[y + 1];
                                pesananArray[y + 1] = temp;
                            }
                        }
                    }
                    System.out.println("++++++++++++++++++++++++++++++");
                    System.out.println("Daftar Pesanan Terurut Resto Royal Delish");
                    System.out.println("++++++++++++++++++++++++++++++");
                    for (Pesanan ps : pesananArray) {
                        System.out.println("| " + ps.kodePesanan + "\t\t| " + ps.namaPesanan + "\t\t\t| " + ps.harga);
                    }
                    break;

                case 5:
                    // Hitung Total Pendapatan
                    int totalPendapatan = 0;
                    for (Pesanan ps : pesananQueue) {
                        totalPendapatan += ps.harga;
                    }
                    System.out.println("++++++++++++++++++++++++++++++");
                    System.out.println("TOTAL PENDAPATAN");
                    System.out.println("++++++++++++++++++++++++++++++");
                    System.out.println("Pendapatan hari ini: " + totalPendapatan);
                    break;

                case 6:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (choice != 6);
    }
}
