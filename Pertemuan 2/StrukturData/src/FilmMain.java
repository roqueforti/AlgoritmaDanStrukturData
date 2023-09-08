public class FilmMain {
    public static void main(String[] args) {
        System.out.println("====================================\n");
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

        System.out.println("====================================\n");

        Film film2 = new Film("The Murder On The Orient Express", "Mystery, Thriller, Drama", "18+", 2000 , 40000);
        film2.tampilFilm();

   
    }
}
