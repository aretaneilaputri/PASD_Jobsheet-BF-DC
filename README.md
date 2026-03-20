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