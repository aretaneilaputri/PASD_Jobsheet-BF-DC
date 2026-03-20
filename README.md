# PASD_Jobsheet-BF-DC

Pertanyaan —— Percobaan 5.2
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan 
perbedaan bagian kode pada penggunaan if dan else!
Jawaban: Pada algoritma Divide and Conquer, if digunakan sebagai base case untuk menghentikan rekursi, misalnya saat n = 1 langsung mengembalikan nilai 1.
Sedangkan else digunakan untuk melanjutkan proses perhitungan dengan memanggil fungsi kembali (n * faktorial(n-1)). Jadi, if itu titik berhenti, else itu prosesnya.
2.  Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan 
for? Buktikan!
Jawaban: Perulangan pada method faktorialBF() tidak harus pakai for, karena pada dasarnya semua perulangan (for, while, do-while) punya fungsi yang sama, yaitu mengulang proses selama kondisi terpenuhi.
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); ! 
Jawaban: fakto *= i;
Kode ini digunakan pada algoritma Brute Force (iteratif).
Artinya: nilai fakto dikalikan dengan i secara berulang dalam perulangan
Prosesnya berjalan step by step (satu per satu) dari 1 sampai n
Biasanya ada di dalam loop (for atau while)
sedangkan int fakto = n * faktorialDC(n-1);
Kode ini digunakan pada algoritma Divide and Conquer (rekursif).
Artinya: nilai n dikalikan dengan hasil dari pemanggilan fungsi yang sama dengan input lebih kecil (n-1)
Fungsi akan memanggil dirinya sendiri sampai mencapai kondisi dasar (base case)
Tidak menggunakan perulangan, tapi rekursi
4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF()  dan faktorialDC()! 
Jawaban: kedua method sama-sama menghitung faktorial, tetapi cara kerjanya berbeda.
Method faktorialBF() menggunakan perulangan (loop) dengan mengalikan angka dari 1 sampai n secara bertahap. Cara ini lebih sederhana dan mudah dipahami karena prosesnya langsung dan berurutan.
Sedangkan faktorialDC() menggunakan rekursi (Divide and Conquer), yaitu memecah perhitungan menjadi masalah yang lebih kecil dengan memanggil fungsi itu sendiri sampai mencapai kondisi dasar. Cara ini lebih efisien dan terstruktur, tetapi membutuhkan pemahaman lebih karena melibatkan pemanggilan fungsi berulang.Jadi, Brute Force lebih simpel, sedangkan Divide and Conquer lebih optimal tetapi lebih kompleks.

Pertanyaan —— Percobaan 5.3
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()! 
Jawaban:Method pangkatBF() menggunakan cara Brute Force, yaitu menghitung hasil pangkat dengan mengalikan angka secara berulang sesuai jumlah pangkat. Prosesnya sederhana karena hanya menggunakan perulangan.Sedangkan pangkatDC() menggunakan Divide and Conquer (rekursi), yaitu memecah perhitungan menjadi bagian yang lebih kecil, misalnya pangkat dibagi dua, lalu hasilnya digabung kembali. Cara ini lebih efisien karena mengurangi jumlah perkalian.
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan! 
Jawaban:Iya, tahap combine sudah ada dalam kode.
Contohnya:
return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
Bagian ini menggabungkan hasil dari dua proses rekursi (kiri dan kanan), sehingga termasuk tahap combine dalam Divide and Conquer.
3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan 
dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, 
apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa 
jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method 
pangkatBF() yang tanpa parameter? 
Jawaban:Sebenarnya parameter tidak wajib, karena di dalam class sudah ada atribut nilai dan pangkat. Method tetap bisa dibuat tanpa parameter dengan langsung menggunakan atribut tersebut. Jadi, method masih relevan pakai parameter (lebih fleksibel), tapi juga bisa tanpa parameter.
Contoh tanpa parameter:
int pangkatBF() {
    int hasil = 1;
    for(int i = 0; i < pangkat; i++) {
        hasil *= nilai;
    }
    return hasil;
}
4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!
Jawaban:Method pangkatBF() bekerja dengan cara mengalikan angka secara berulang dari 1 sampai jumlah pangkat, sehingga prosesnya langsung dan mudah dipahami.Sedangkan pangkatDC() bekerja dengan cara membagi masalah menjadi lebih kecil (rekursi), lalu menggabungkan hasilnya kembali. Cara ini lebih efisien terutama untuk pangkat besar, meskipun lebih kompleks.

Pertanyaan —— Percobaan 5.4
1. Kenapa dibutuhkan variable mid pada method TotalDC()?
Jawaban:Variabel mid digunakan untuk membagi array menjadi dua bagian, yaitu bagian kiri dan kanan. Ini penting karena dalam algoritma Divide and Conquer, masalah harus dipecah menjadi sub-masalah yang lebih kecil. Dengan adanya mid, proses pembagian data bisa dilakukan secara sistematis hingga mencapai bagian terkecil.
2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC?
double lsum totalDC(arr, 1, mid);
double rsum totalDC(arr, mid+1, г),
Jawaban:Statement tersebut digunakan untuk menghitung jumlah nilai pada dua bagian array secara terpisah.
lsum menghitung total bagian kiri
rsum menghitung total bagian kanan
Keduanya dipanggil secara rekursif sampai mencapai base case. Ini merupakan tahap conquer dalam Divide and Conquer.
3. Kenapa diperlukan penjumlahan hasil Isum dan rsum seperti di bawah ini?
return lsumersum;
Jawaban:Karena hasil perhitungan sudah dipisah menjadi dua bagian (kiri dan kanan), maka untuk mendapatkan total keseluruhan harus digabungkan kembali. Penjumlahan lsum + rsum adalah tahap combine, yaitu menggabungkan hasil dari sub-masalah menjadi solusi akhir.
4. Apakah base case dari totalDC()?
Jawaban:Base case terjadi saat:
if(l == r)
Yang artinya hanya ada satu elemen dalam array, sehingga tidak perlu dibagi lagi dan langsung dikembalikan nilainya.
5. Tarik Kesimpulan tentang cara kerja totalDC
Jawaban:Method totalDC() bekerja dengan cara membagi array menjadi dua bagian menggunakan mid, kemudian masing-masing bagian dihitung secara rekursif. Setelah itu, hasil dari kedua bagian dijumlahkan kembali untuk mendapatkan total keseluruhan. Cara ini membuat proses lebih terstruktur dan efisien dibandingkan menghitung secara langsung.