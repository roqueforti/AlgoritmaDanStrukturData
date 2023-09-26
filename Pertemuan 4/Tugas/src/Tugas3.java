public class Tugas3 {
    public static void main(String[] args) {
        int[] data = {12, 15, 6, 3, 70, 51, 83, 15, 3, 83};

        int nilaiTerbesar = data[0];  
        int[] posisi = new int[data.length];
        int jumlah = 0;

        for (int i = 1; i < data.length; i++) {
            if (data[i] > nilaiTerbesar) {
                nilaiTerbesar = data[i];
                jumlah = 0; 
                posisi[jumlah++] = i;
            } else if (data[i] == nilaiTerbesar) {
                posisi[jumlah++] = i; 
            }
        }

        System.out.println("Nilai terbesar dalam array: " + nilaiTerbesar);

        System.out.print("Posisi nilai terbesar: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(posisi[i] + " ");
        }
    }
}
