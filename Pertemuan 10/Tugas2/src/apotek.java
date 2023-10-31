public class apotek {
    int tiket;
    String nama;
    apotek prev;
    apotek next;

    public apotek(apotek prev, int tiket, String nama, apotek next) {
        this.prev = prev;
        this.tiket = tiket;
        this.nama = nama;
        this.next = next;
    }
}