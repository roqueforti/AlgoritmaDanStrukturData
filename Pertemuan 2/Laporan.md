# Laporan Pertemuan 2
## Objek dan Array of Object

- Hilman Zahrawa Budiarto
- 2241760051
- SIB 2C

## 2.2 Deklarasi Class, Atribut, dan Method

<img src= "Deklarasi-Class-,Atribut-dan-Method.png">

Pertanyaan
1. Sebutkan 2 karakteristik class/objek

Jawab:
Terdapat atribut dan method

2. Kata kunci apakah yang digunakan untuk mendeklarasikan class?

Jawab:
class

3. Perhatikan class Film yang ada di Praktikum di atas, ada berapa atribut yang dimiliki oleh class
tersebut? Sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan?

Jawab:
Ada 5 yaitu String judul, genre, rate; int jumlahTiket, hargaTiket.
Deklarasi atribut dilakukan pada baris ke 2 dan 3

4. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan!

Jawab:
Ada 4 yaitu tampilFilm, tambahTiket, kurangTiket, dan totalRevenue

5. Perhatikan method kurangiTiket() yang ada di class Film, modifikasi isi method tersebut sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0)

Jawab:

<img src= "pertanyaan-5-modifikasi-kode.png">

6. Menurut Anda, mengapa method tambahTiket() dibuat dengan memiliki 1 parameter berupa
bilangan int?

Jawab:

Karena parameter tersebut dibuat agar nilai yang diinputkan sesuai dengan tipe nilai yang diinginkan sehingga tidak terjadi kesalahan saat program dijalankan

7. Menurut Anda, mengapa method totalRevenue() memiliki tipe data int?

Jawab: 

Karena bertujuan untuk return nilai int dari totalRevenue()

8. Menurut Anda, mengapa method tambahTiket() memiliki tipe data void?

Jawab:

Karenan method ini bertujuan untuk melakukan suatu fungsi namun tidak mengembalikan nilai tertentu

## 2.3 Instansiasi Objek dan Mengakses Atribut & Method

<img src= "Instansiasi-Objek-dan-Mengakses-Atribut-&-Method.png">

Pertanyaan
1. Pada class FilmMain, pada kode apa yang digunakan untuk proses instansiasi? Apa nama objek
yang dihasilkan?

Jawab:


2. Bagaimana cara mengakses atribut dan method dari suatu objek?

Jawab:



## 2.4 Membuat Konstruktor

<img src= "Membuat-Konstruktor.png">

Pertanyaan
1. Perhatikan class Film yang ada di Praktikum 2.4.1, pada baris berapakah deklarasi
konstruktor berparameter dilakukan?

Jawab: 

<img src= "pertanyaan-1-konstruktor1.png">

Baris ke 16 sampai baris ke 18

2. Perhatikan class FilmMain di Praktikum 2.4.1, apa sebenarnya yang dilakukan pada baris
program dibawah ini?

Jawab: 

Membuat objek baru dari class yang sudah dibuat, kemudian mengisikan seluruh atribut objek tersebut menggunakan konstruktor

3. Coba buat objek dengan nama film3 dengan menggunakan konstruktor berparameter dari
class Barang.

Jawab:


## 2.5 Membuat Array dari Object, Mengisi dan Menampilkan

Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!

Jawab:

Tidak, class yang akan dibuat menjadi array of object bisa disesuaikan dengan kebutuhan program, apakah dapat disertakan atribut saja, method saja, ataupun keduanya, bahkan tidak keduanya.

2. Apakah class PersegiPanjang memiliki konstruktor? Jika tidak, kenapa dilakukan pemanggilan
konstruktur pada baris program berikut!
ppArray[1] = new PersegiPanjang()

Jawab:

Tidak punya konstruktor. Kode itu membuat objek dengan konstruktor default yand dimasukkan ke dalam array of object ppArray

3. Apa yang dimaksud dengan kode berikut ini!
PersegiPanjang[] ppArray = new PersegiPanjang[3]

Jawab:
Kode tersebut adalah deklarasi dan inisialisasi dari array objek PersegiPanjang

4. Apa yang dimaksud dengan kode berikut ini!
ppArray[1] = new PersegiPanjang();
ppArray[1].panjang = 80;
ppArray[1].lebar = 40;

Jawab:
Kode tersebut adalah membuat objek baru pada array index ke 1. Kemudian 2 baris berikutnya melakukan instansiasi nilai atribut pada objek yang baru saja dibuat.

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?

Jawab:

class main dan class PersegiPanjang dipisahkan karena merupakan bentuk umum implementasi OOP

## 2.6 Menerima Input Isian Array Menggunakan Looping

<img src= "Menerima-Input-Isian-Array-Menggunakan-Looping.png">

Pertanyaan
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?

Jawab:

Dapat

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!

Jawab:

ppArray[0][1] = new PersegiPanjang (20, 10);

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa?
persegi[] ppArray = new Persegi[100];
ppArray[5].sisi = 20;

Jawab:
Kode tersebut error karena kode tersebut mencoba untuk menginisialisasi atribut sisi. Sedangkan objek dari persegi belum dibuat. Jadi objek persegi perlu dibuat terlebih dahulu agar atribut sisi dapat diraih.

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!

Jawab:

<img src= "pertanyaan-scanner.png">

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan!

Jawab:

Tidak bisa, karena setiap elemen pada array hanya dapat diisi 1 objek

## 2.7 Operasi Matematika Atribut Object Array

<img src= "Operasi-Matematika-Atribut-Object-Array.png">

Pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!

Jawab:

Bisa

Balok balok1 = new Balok();
Balok balok2 = new Balok("John", 12345);

2. Jika diketahui terdapat class Segitiga seperti berikut ini:

public class Segitiga {
    public int alas;
    public int tinggi;
}

Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.

