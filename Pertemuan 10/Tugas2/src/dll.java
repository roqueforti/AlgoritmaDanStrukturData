public class dll {
    apotek head, tail;
    int size;

    public dll() {
        head = null;
        size = 0;
    }

    public boolean kosong() {
        return head == null;
    }

    public void daftar(int antrian, String nama) {
        if (!kosong()) {
            tail = head = new apotek(null, antrian, nama, null);
        } else {
            apotek tiket = new apotek(null, antrian, nama, head);
            head.prev = tiket;
            head.prev.next = head;
            head = tiket;
        }
        size++;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void print() {
        if (!kosong()) {
            apotek tmp = head;
            System.out.println("|No.\t|Nama\t|");
            while (tmp != tail) {
                System.out.println("|" + tmp.tiket + "\t|" + tmp.nama);
                tmp = tmp.next;
            }
            if (tmp == tail) {
                System.out.println("|" + tmp.tiket + "\t|" + tmp.nama + "\t|");
            }
            System.out.println("Sisa Antrian : " + size);
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void hapus() throws Exception {
        if (kosong()) {
            throw new Exception("Linked List masih kosong, tidak dapat menghapus");
        } else if (size == 1) {
            hapusterakhir();
        } else {
            System.out.println(head.nama + " Telah divaksin");
            head = head.next;
            head.prev = null;
            size--;
        }
        print();
    }

    public void hapusterakhir() throws Exception {
        if (kosong()) {
            throw new Exception("Linked List masih Kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        apotek current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
        System.out.println(head.nama + "Telah divaksin");
    }
}
