public class Film {
    String judul, genre, rate;
    int jumlahTiket, hargaTiket;

    Film(){
    }

    Film(String jd, String gr, String rt, int jt, int ht) {
        this.judul = jd;
        this.genre = gr;
        this.rate = rt;
        this.jumlahTiket = jt;
        this.hargaTiket = ht;
    }

    void tampilFilm() {
        System.out.println("Judul: " + judul);
        System.out.println("Genre: " + genre);
        System.out.println("Rate: " + rate);
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Harga Tiket: " + hargaTiket);
    }

    void tambahTiket (int n) {
        jumlahTiket += n;
    }

    void kurangTiket (int n) {
        if (jumlahTiket>0){
            jumlahTiket -= n;   
        }
    }

    int totalRevenue(int jumlah) {
        return jumlah*hargaTiket;
    }

    public static void main(String[] args) {
        Film film1 = new Film();

        film1.judul = "Sherlock Holmes: A Game of Shadows";
        film1.genre = "Mystery, Adventure, Drama";
        film1.rate = "13+";
        film1.jumlahTiket = 3000; 
        film1.hargaTiket = 40000;

        film1.tambahTiket(1);
        film1.kurangTiket(3);
        film1.tampilFilm();
        
        int income = film1.totalRevenue(4);

        System.out.println("total jual 4 tiket = "+income);
    }
}