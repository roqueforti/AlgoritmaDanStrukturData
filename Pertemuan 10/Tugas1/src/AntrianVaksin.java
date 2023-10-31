import java.util.Scanner;

class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    public Node head;
    public int size;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        this.size++;
    }

    public int removeFirst() {
        if (this.head == null) {
            return -1;
        }

        int data = this.head.data;
        this.head = this.head.next;
        this.head.prev = null;

        this.size--;
        return data;
    }

    public void print() {
        Node current = this.head;
        System.out.println("|No.|Nama|");
        for (int i = 0; i < this.size; i++) {
            System.out.printf("|%d|%d|", i + 1, current.data);
            current = current.next;
        }
        System.out.println("Sisa Antrian: " + this.size);
    }

    public Node get(int index) {
        if (index < 0 || index >= this.size) {
            return null;
        }

        Node current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }
}

public class AntrianVaksin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DoublyLinkedList queue = new DoublyLinkedList();

        String namaPenerima = "";

        while (true) {
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EKSTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.print("Pilihan: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("++++++++++++++++++++++++++++++");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("++++++++++++++++++++++++++++++");
                    System.out.print("Nomor Antrian: ");
                    int noAntrian = scanner.nextInt();
                    System.out.print("Nama Penerima: ");
                    String namaPenerima = scanner.nextLine();

                    queue.addFirst(noAntrian);

                    System.out.println("Data berhasil ditambahkan!");
                    break;
                case 2:
                    int data = queue.removeFirst();
                    if (data == -1) {
                        System.out.println("Antrian kosong!");
                    } else {
                        System.out.println(namaPenerima + " telah selesai divaksinasi.");
                    }
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}
