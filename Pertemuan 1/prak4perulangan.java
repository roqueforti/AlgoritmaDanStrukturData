public class prak4perulangan {
    public static void main(String[] args) {
        int n = 15;
        
        System.out.println("Deret Fibonacci dengan perulangan:");
        
        int awal = 0;
        int akhir = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print(awal + " ");
            int lanjut = awal + akhir;
            awal = akhir;
            akhir = lanjut;
        }
    }
}
