import java.util.ArrayList;
import java.util.List;

class BarangTransaksi {
    private String namaBarang;
    private int jumlah;
    private double hargaPerBarang;

    public BarangTransaksi(String namaBarang, int jumlah, double hargaPerBarang) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.hargaPerBarang = hargaPerBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHargaPerBarang() {
        return hargaPerBarang;
    }

    public void setHargaPerBarang(double hargaPerBarang) {
        this.hargaPerBarang = hargaPerBarang;
    }

    public double getTotalHarga() {
        return jumlah * hargaPerBarang;
    }
}

class Transaksi {
    private List<BarangTransaksi> daftarBarang = new ArrayList<>();

    public void tambahBarang(String namaBarang, int jumlah, double hargaPerBarang) {
        BarangTransaksi barang = new BarangTransaksi(namaBarang, jumlah, hargaPerBarang);
        daftarBarang.add(barang);
    }

    public void ubahNamaBarang(String namaLama, String namaBaru) {
        for (BarangTransaksi barang : daftarBarang) {
            if (barang.getNamaBarang().equals(namaLama)) {
                barang.setNamaBarang(namaBaru);
            }
        }
    }

    public void ubahJumlahBarang(String namaBarang, int jumlahBaru) {
        for (BarangTransaksi barang : daftarBarang) {
            if (barang.getNamaBarang().equals(namaBarang)) {
                barang.setJumlah(jumlahBaru);
            }
        }
    }

    public void ubahHargaBarang(String namaBarang, double hargaBaru) {
        for (BarangTransaksi barang : daftarBarang) {
            if (barang.getNamaBarang().equals(namaBarang)) {
                barang.setHargaPerBarang(hargaBaru);
            }
        }
    }

    public void hapusBarang(String namaBarang) {
        daftarBarang.removeIf(barang -> barang.getNamaBarang().equals(namaBarang));
    }

    public void resetTransaksi() {
        daftarBarang.clear();
    }

    public void cekPesanan() {
        boolean adaKesalahan = false;
        for (BarangTransaksi barang : daftarBarang) {
            if (barang.getNamaBarang() == null || barang.getJumlah() <= 0 || barang.getHargaPerBarang() <= 0) {
                adaKesalahan = true;
                break;
            }
        }

        if (adaKesalahan) {
            System.out.println("Terdapat kesalahan input data");
        } else {
            System.out.println("Pemesanan sudah benar");
        }

        System.out.println("Transaksi:");
        System.out.println("| No | Nama Barang | Jumlah Barang | Harga/Barang | Total Harga |");
        for (int i = 0; i < daftarBarang.size(); i++) {
            BarangTransaksi barang = daftarBarang.get(i);
            System.out.println("| " + (i + 1) + " | " + barang.getNamaBarang() + " | " + barang.getJumlah() + " | " + barang.getHargaPerBarang() + " | " + barang.getTotalHarga() + " |");
        }
    }

    public double totalHarga() {
        double total = 0;
        for (BarangTransaksi barang : daftarBarang) {
            total += barang.getTotalHarga();
        }
        return total;
    }

    public double hitungDiskon() {
        double total = totalHarga();
        if (total > 500000) {
            return total * 0.9; // Diskon 10%
        } else if (total > 300000) {
            return total * 0.92; // Diskon 8%
        } else if (total > 200000) {
            return total * 0.95; // Diskon 5%
        } else {
            return total;
        }
    }
}

public class AplikasiSupermarket {
    public static void main(String[] args) {
        Transaksi transaksi = new Transaksi();

        // Menambahkan barang
        transaksi.tambahBarang("Mobil", 2, 100000);
        transaksi.tambahBarang("Tempe", 3, 3000);

        // Mengubah nama barang
        transaksi.ubahNamaBarang("Mobil", "Sepeda");

        // Mengubah jumlah barang
        transaksi.ubahJumlahBarang("Sepeda", 1);

        // Mengubah harga barang
        transaksi.ubahHargaBarang("Sepeda", 150000);

        // Menghapus barang
        transaksi.hapusBarang("Tempe");

        // Reset transaksi
        transaksi.resetTransaksi();

        // Menambahkan barang baru
        transaksi.tambahBarang("Mie", 5, 5000);
        transaksi.tambahBarang("Roti", 3, 3000);
        transaksi.tambahBarang("Bakpao", 7, 3500);
        transaksi.tambahBarang("Teh", 10, 6000);
        transaksi.tambahBarang("Tepung", 2, 14000);

        // Cek pesanan
        transaksi.cekPesanan();

        // Menghitung total harga
        double total = transaksi.totalHarga();
        System.out.println("Total Harga: " + total);

        // Menghitung total harga dengan diskon
        double totalDenganDiskon = transaksi.hitungDiskon();
        System.out.println("Total Harga dengan Diskon: " + totalDenganDiskon);
    }
}
