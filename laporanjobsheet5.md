Praktikum 5.2:

<img width="621" height="482" alt="image" src="https://github.com/user-attachments/assets/6d0c4b77-c335-41d8-90b0-590e428fb943" />

<img width="1100" height="465" alt="image" src="https://github.com/user-attachments/assets/24ba83d3-efb1-4977-bb24-47b8214902c0" />

<img width="675" height="131" alt="image" src="https://github.com/user-attachments/assets/ceeccb45-2d59-4689-9fe0-f62995027780" />

Pertanyaan:
1.Bagian if → Base Case (kondisi dasar):
Menghentikan proses rekursi.
Menentukan nilai faktorial paling dasar.
Tanpa ini, program akan loop terus (infinite recursion).
Bagian else → Recursive Case (pemecahan masalah):
Memecah masalah menjadi lebih kecil.
Memanggil fungsi itu sendiri dengan nilai lebih kecil (n-1).

2.Ya, bisa karena perulangan pada method faktorialBF() tidak harus menggunakan for, bisa diganti dengan bentuk lain seperti while atau do-while.
Bukti:

<img width="487" height="289" alt="image" src="https://github.com/user-attachments/assets/e2e21bd1-c61d-4ddf-8ea0-9d6ddb3ab20e" />

<img width="437" height="338" alt="image" src="https://github.com/user-attachments/assets/efb70fbf-2ee4-4716-993e-40c630727c73" />

3.fakto *= i; → Iteratif (Brute Force):
Digunakan di dalam loop (for / while).
Nilai fakto diperbarui secara bertahap.
int fakto = n * faktorialDC(n-1); → Rekursif (Divide & Conquer):
Mengalikan n dengan hasil pemanggilan fungsi itu sendiri.
Digunakan dalam rekursi.

4.faktorialBF():
Menggunakan perulangan seperti for atau while.
Perhitungan dilakukan bertahap dari 1 sampai n.
Menggunakan satu variabel yang terus diperbarui.
Alur proses langsung dari awal ke akhir.

faktorialDC():
Menggunakan rekursi (fungsi memanggil dirinya sendiri).
Masalah dipecah menjadi sub-masalah lebih kecil (n-1).
if untuk berhenti.
Proses berjalan turun (pemanggilan) lalu naik (pengembalian hasil).

Praktikum 5.3:

<img width="674" height="556" alt="image" src="https://github.com/user-attachments/assets/c2e21880-1f10-4ce8-addf-617c339bd923" />

<img width="956" height="531" alt="image" src="https://github.com/user-attachments/assets/783486e1-23cc-4e03-bc22-95e23b09d622" />

<img width="608" height="340" alt="image" src="https://github.com/user-attachments/assets/b1651eff-def8-4a10-b8a6-8fc7885083eb" />

Pertanyaan:
1.pangkatBF() menggunakan perulangan untuk mengalikan nilai secara bertahap dari awal sampai pangkat, sehingga prosesnya sederhana tetapi membutuhkan banyak langkah.
Sedangkan pangkatDC() menggunakan rekursi dengan membagi masalah menjadi lebih kecil, sehingga jumlah langkah lebih sedikit dan lebih efisien.

2.Ya, tahap combine sudah termasuk dalam kode pangkatDC() ada di code:

<img width="535" height="247" alt="image" src="https://github.com/user-attachments/assets/d45a6e9a-ecd3-4115-aeb1-efd1d4a82f02" />

3.Method pangkatBF() sebenarnya tidak harus memiliki parameter, karena nilai yang dibutuhkan sudah tersedia dalam atribut class yaitu nilai dan pangkat.
Penggunaan parameter membuat method lebih fleksibel karena bisa menerima input dari luar, tetapi dalam konteks ini menjadi kurang efisien karena data sudah disimpan dalam objek.
Oleh karena itu, method tersebut tetap relevan menggunakan parameter, namun juga bisa dibuat tanpa parameter dengan langsung memanfaatkan atribut yang ada pada class.

4.Cara kerja method pangkatBF() dan pangkatDC() berbeda pada pendekatan yang digunakan.
Method pangkatBF() bekerja secara iteratif, yaitu dengan mengalikan nilai secara berulang sebanyak pangkat yang diberikan hingga mencapai hasil akhir.
Proses ini dilakukan secara berurutan dari awal sampai selesai.

Sedangkan method pangkatDC() bekerja secara rekursif dengan pendekatan divide and conquer, yaitu dengan membagi masalah menjadi bagian yang lebih kecil (setengah pangkat), kemudian hasilnya digabungkan kembali.
Proses ini membuat perhitungan menjadi lebih efisien karena tidak dilakukan secara berulang satu per satu.

Praktikum 5.4:

<img width="566" height="526" alt="image" src="https://github.com/user-attachments/assets/798f682f-2150-40d8-85b8-e50303ca3902" />

<img width="1039" height="454" alt="image" src="https://github.com/user-attachments/assets/d066d413-d623-445d-9742-b9cf55da3bb7" />

<img width="612" height="263" alt="image" src="https://github.com/user-attachments/assets/59b0f3cc-5727-4a5d-8473-09dc4cff573d" />

Pertanyaan:
1.Variabel mid diperlukan untuk menentukan titik tengah array agar proses pembagian data dalam algoritma Divide & Conquer dapat berjalan dengan benar dan seimbang,
sehingga semua elemen dapat diproses secara efisien

2.Statement tersebut digunakan untuk memanggil rekursi pada dua bagian array (kiri dan kanan) agar setiap bagian dapat dihitung, sebelum akhirnya digabungkan menjadi total keseluruhan.

3.Penjumlahan lsum dan rsum diperlukan untuk menggabungkan hasil dari dua sub-masalah agar muncul total elemen array.

4.Base case pada totalDC() adalah saat l == r, yaitu ketika array hanya memiliki satu elemen. Pada kondisi ini, rekursi berhenti dan langsung mengembalikan nilai elemen tersebut.

5.Method totalDC() bekerja dengan Divide & Conquer yaitu membagi array menjadi dua bagian kecil kiri dan kanan kemudian menghitung masing masiing
bagian secara tekursif hingga mencapai kondisi dasar etelah itu, hasil dari kedua bagian tersebut digabungkan dengan penjumlahan untuk mendapatkan total keseluruhan.Dengan cara ini
proses perhitungan menjadi lebih rapi dan cepat di banding menghitung secara langsung.

Latihan Praktikum 4.5:

<img width="617" height="377" alt="image" src="https://github.com/user-attachments/assets/40f3cb64-b365-4667-9305-7f9c6b29e2ff" />

<img width="608" height="601" alt="image" src="https://github.com/user-attachments/assets/f43a75b5-3a68-4471-b974-84d35606059b" />

<img width="875" height="474" alt="image" src="https://github.com/user-attachments/assets/1f696322-b3dd-4422-8379-eaca22d11c3e" />

<img width="672" height="147" alt="image" src="https://github.com/user-attachments/assets/cc8541bc-428a-4c43-99a4-f5e8fe3173f6" />
