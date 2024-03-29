import java.util.Scanner;

public class Nasabah {
    private int id;
    String nama;
    String alamat;
    int noHP;
    int saldo;
    float jmlHutang;
    boolean statusAktif;

    public Nasabah (int id, String nama, String alamat, int noHP, int saldo, float jmlHutang, boolean statusAktif) {
        this.id = id;
        this.nama = nama;
        this.noHP = noHP;
        this.saldo = saldo;
        this.jmlHutang = jmlHutang;
        this.statusAktif = statusAktif;
    }

    public int getIdRekening() {
        return this.id;
    }

    public int tarikTunai(int jmlTarik) {
        System.out.println("Jumlah tarik tunai: ");
        return jmlTarik;
    }

    public int menabung(int deposit) {
        System.out.println("Masukkan jumlah uang: ");
        deposit  = sc.nextInt();
        return deposit;
    }

    void berhutang (Float jmlHutang) {
        System.out.println("Masukkan jumlah hutang: ");
        jmlHutang = sc.nextInt();

        if (jmlHutang <= saldo) {
            System.out.println("Peminjaman ditolak");
        } else if (jmlHutang >= saldo) {
            System.out.println("Jumlah hutang :" + jmlHutang);
            System.out.println();
            System.out.println("Skema pelunasan dalam 6 bulan: Rp" + jmlHutang/6 + "per bulan");
        }
    }

    void bukaRekening() {
        int menu;

        if (statusAktif = "Y") {
            System.out.println("1. Lihat saldo");
            System.out.println("2. Menabung");
            System.out.println("3. Tarik tunai");
            System.out.println("4. Berhutang");
            System.out.println("5. Selesai");
            
            switch (menu) {
                case 1:
                lihatSaldo();
                break;

                case 2:
                menabung();
                break;

                case 3:
                tarikTunai();
                break;

                case 4:
                berhutang();
                break;

                case 5:
                default:
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Punya akun? ");
        
    }
    
}
