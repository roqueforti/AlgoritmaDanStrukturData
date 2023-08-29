public class tugas2 {
    public static void main(String[] args) {
        double saldo = 1000000;
        double saldoHarapan = 1500000;
        double bunga = 0.02;

        int bulan = countBulan(saldo, saldoHarapan, bunga);

        System.out.println("Jumlah bulan yang dibutuhkan: " + bulan);
    }

    public static int countBulan(double saldo, double saldoHarapan, double bunga) {
        int bulan = 0;

        while (saldo < saldoHarapan) {
            saldo += saldo * bunga;
            bulan++;
        }

        return bulan;
    }
}
