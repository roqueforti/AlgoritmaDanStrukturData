public class praktikum3 {
    public static void main(String[] args) {
        int[][] stokBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        
        int[] stokPerBunga = new int[4];
        
        for (int i = 0; i < stokBunga.length; i++) {
            for (int j = 0; j < stokBunga[i].length; j++) {
                stokPerBunga[j] += stokBunga[i][j];
            }
        }
        
        System.out.println("Jumlah stok di seluruh cabang:");
        System.out.println("Aglonema: " + stokPerBunga[0]);
        System.out.println("Keladi: " + stokPerBunga[1]);
        System.out.println("Alocasia: " + stokPerBunga[2]);
        System.out.println("Mawar: " + stokPerBunga[3]);
        
        int[] penguranganStok = {-1, -2, 0, -5};
        int totalPendapatan = 0;
        
        for (int i = 0; i < stokBunga[0].length; i++) {
            totalPendapatan += (hargaBunga[i] * (stokBunga[0][i] + penguranganStok[i]));
        }
        
        System.out.println("Total Pendapatan RoyalGarden 1 jika Bunga Terjual Habis: " + totalPendapatan);
    }
}