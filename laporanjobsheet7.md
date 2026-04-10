6.2. Searching/ Pencarian Menggunakan Algoritma Sequential Search:

<img width="854" height="626" alt="image" src="https://github.com/user-attachments/assets/effbc2d5-a0b3-4880-a928-1d736e039a3a" />

<img width="642" height="634" alt="image" src="https://github.com/user-attachments/assets/6af2bad4-5aa6-4183-a2f4-11ab8def7675" />

<img width="577" height="994" alt="image" src="https://github.com/user-attachments/assets/7ca2bbe7-ba99-4062-8f40-f3474ce23a88" />

Pertanyaan:
1.tampilPosisi menampilkan posisi/index data yang ditemukan.
tampilDataSearch menampilkan detail lengkap data mahasiswa.

2.Fungsi break pada potongan kode tersebut adalah untuk menghentikan perulangan (loop) saat kondisi sudah terpenuhi.

3.berfungsi untuk menyimpan lokasi (index) data yang ditemukan dalam array/list

4.Jika terdapat lebih dari satu data dengan nilai yang sama, maka program sequential search tersebut akan menampilkan data yang pertama kali ditemukan saja.
Hal ini terjadi karena saat data yang dicari sudah ditemukan, program langsung menjalankan break sehingga perulangan berhenti. Akibatnya, data berikutnya yang memiliki nilai sama tidak akan diperiksa lagi.

5.Program akan tetap melanjutkan pencarian hingga ke akhir array/list.

6.3. Searching/ Pencarian Menggunakan Algoritma Binary Search:

<img width="820" height="416" alt="image" src="https://github.com/user-attachments/assets/cf779254-b8ca-43e4-b7ea-1d275e581215" />

<img width="871" height="425" alt="image" src="https://github.com/user-attachments/assets/41eb8c46-dfdd-4d75-a6f6-0e201c6998cd" />

<img width="773" height="815" alt="image" src="https://github.com/user-attachments/assets/37faff0a-b544-4c42-8317-18abba19e2a0" />

pertanyaan:
1.mid = (left + right) / 2

2.return -1;

3.left berfungsi sebagai batas kiri (awal) dari area pencarian dan menunjukkan indeks paling kiri.
right berfungsi sebagai batas kanan (akhir) dari area pencarian dan menunjukkan indeks paling kanan.
mid berfungsi sebagai titik tengah dari area pencarian.

4.Tidak akan bekerja dengan benar karena Binary search harus menggunakan data yang sudah terurut
dan prosesnya membagi data berdasarkan nilai tengah.

5.<img width="740" height="400" alt="image" src="https://github.com/user-attachments/assets/ecdeea0e-0622-4cb0-b3bf-a02189715a79" />

<img width="781" height="837" alt="image" src="https://github.com/user-attachments/assets/6a36a17c-73c3-4a1e-9dc1-577503a3bbbd" />

6.Binary search menyatakan data tidak ditemukan ketika left sudah melewati right sehingga tidak ada lagi bagian array yang bisa diperiksa dan hasilnya 
mengembalikan nilai -1 sebagai indikator gagal.

7.<img width="919" height="601" alt="image" src="https://github.com/user-attachments/assets/10b52691-0e7d-41bf-b0f5-54287149b98e" />

<img width="533" height="256" alt="image" src="https://github.com/user-attachments/assets/05bf4e60-5a8e-414f-9001-d9e0d444e8c3" />

