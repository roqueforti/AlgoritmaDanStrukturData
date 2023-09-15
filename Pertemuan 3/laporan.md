# Laporan Pertemuan 1

- Hilman Zahrawa Budiarto
- 2241760051
- SIB 2C

## Percobaan Faktorial

<img src= "faktorial.png">

Pertanyaan

1. Jelaskan mengenai base line Algoritma Divide Conquer untuk melakukan pencarian nilai
faktorial !

Jawab:
Divide and conquer menggunakan pemilihan if (n==1) return 1, dengan tujuan agar nilai yang
dimasukkan 1 sehingga hasil program main adalah 1 dan menjadi batas perulangan.

2. Pada implementasi Algoritma Divide and Conquer Faktorial apakah lengkap terdiri dari 3
tahapan divide, conquer, combine? Jelaskan masing-masing bagiannya pada kode program!

Jawab:
Divide = memecah masalah ke beberapa bagian lebih kecil
Conquer = Menyelesaikan masalah pada tiap bagian kecil tersebut
Combine = menggabungkan hasil pemecahan masalah pada bagian-bagian kecil tersebut

3. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain
menggunakan for?Buktikan

Jawab:
Bisa, dapat menggunakan perintah while

4. Tambahkan pegecekan waktu eksekusi kedua jenis method tersebut

Jawab

5. Buktikan dengan inputan elemen yang di atas 20 angka, apakah ada perbedaan waktu
eksekusi

Jawab:

## Percobaan Pangkat

<img src= "pangkat.png">

Pertanyaan

1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!

Jawab:
Pada PangkatBF() operasi hitung mencari pangkat yang dilakukan dengan cara operulangan yang
deklarasi nilai awal 1 dan batas berulangan n (pangkat), dengan perintah pada loop yaitu untuk
mengkalikan a dengan a sejumlah n, hingga kurang dari n.
Sedangkan PangkatDC() operasi hitung mencari pangkat dilakukan dengan rekursif.

2. Pada method PangkatDC() terdapat potongan program sebagai berikut: Jelaskan arti potongan kode tersebut

Jawab:
Kode tersebut menentukan bilangan ganjil atau genap. Jika suatu bilangan modulus dibagi 1 ada sisa
1 maka bilangan tersebut ganjil, Sedangakan bila sisa 0 maka bilangan tersebut genap

3. Apakah tahap combine sudah termasuk dalam kode tersebut? Tunjukkan

Jawab:
Tahap combine terdapat pada sintaks return pada setiap method

4. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor.

Jawab:

5. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan!

Jawab:

## Percobaan Sum

<img src= "sum.png">

Pertanyaan

1. Berikan ilustrasi perbedaan perhitungan keuntungan dengan method TotalBF() ataupun TotalDC()

Jawab:
BF() menggunakan algoritma perulangan sedangkan DC() menggunakan algoritma rekursif

2. Perhatikan output dari kedua jenis algoritma tersebut bisa jadi memiliki hasil berbeda di belakang
koma. Bagaimana membatasi output di belakang koma agar menjadi standar untuk kedua jenis
algoritma tersebut.

Jawab:

3. Mengapa terdapat formulasi return value berikut?Jelaskan!

Jawab:
Fungsi return value adalah untuk menemukan keuntungan dari perusahaan dalam rentang waktu bulan
tertentu.

4. Kenapa dibutuhkan variable mid pada method TotalDC()?

Jawab:
Variable mid digunakan untuk perhitungan bagian tengah karena perhitungan keuntungan pada
method totalDC() membagi bagainnya menjadi left dan right

5. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja.
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.(Setiap
perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan program!

Jawab:

## Latihan

<img src= "latihan.png">