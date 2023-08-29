public class tugas1 {
    public static void main(String[] args) {
        int totalPendapatan = 0;

        String[] customers = { "Ani", "Budi", "Bina", "Cita" };
        int[] kg = { 4, 15, 6, 11 };

        for (int i = 0; i < customers.length; i++) {
            int biaya = kg[i] * 4500;

            if (kg[i] > 10) {
                biaya -= biaya * 0.05;
            }

            totalPendapatan += biaya;

            System.out.println("Customer: " + customers[i]);
            System.out.println("Berat Pakaian: " + kg[i] + " kg");
            System.out.println("Biaya: Rp. " + biaya);
            System.out.println("======================");
        }

        System.out.println("Total Pendapatan: Rp. " + totalPendapatan);
    }
}
