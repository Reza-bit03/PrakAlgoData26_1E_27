## PRAKTIKUM 1
- Kode program

<img width="940" height="651" alt="image" src="https://github.com/user-attachments/assets/8cf1654a-0339-421c-bc92-2634f6df0aab" />

<img width="631" height="378" alt="image" src="https://github.com/user-attachments/assets/e689ef63-2590-4fb5-8a71-54d56a5ae337" />

<img width="679" height="705" alt="image" src="https://github.com/user-attachments/assets/365a72fd-4aaf-4d63-937c-8def0d9c62a5" />

<img width="662" height="594" alt="image" src="https://github.com/user-attachments/assets/a2515fc4-3624-43c7-847b-33ac9282ebb2" />

- Output

<img width="444" height="884" alt="image" src="https://github.com/user-attachments/assets/e0c590f5-e15f-404e-99bf-c29065465502" />


## PERTANYAAN
1.Struktur: Single Linked List hanya memiliki satu pointer (next) yang menunjuk ke node berikutnya.
Sedangkan Double Linked List memiliki dua pointer, yaitu next (menunjuk ke node selanjutnya) dan prev (menunjuk ke node sebelumnya).
Mekanisme Traversal: Karena strukturnya, penelusuran (traversal) pada Single Linked List hanya bisa dilakukan satu arah (dari head ke belakang). 
Pada Double Linked List, penelusuran bisa dilakukan dua arah, baik maju dari head ke tail maupun mundur dari tail ke head.

2.next: Berfungsi untuk melangkah ke node berikutnya saat penelusuran (traversal maju).
Saat manipulasi (seperti menambah atau menghapus node), next digunakan untuk merangkai node asal ke node tujuan di depannya.
prev: Berfungsi untuk melangkah mundur ke node sebelumnya (traversal mundur).
Dalam manipulasi, prev sangat memudahkan penyisipan atau penghapusan di tengah rantai karena kita bisa langsung mengakses node sebelumnya tanpa harus melakukan iterasi pencarian ulang dari head.

3.Fungsi konstruktor tersebut adalah untuk menginisialisasi nilai head dan tail menjadi null.
Ini secara logis mengondisikan bahwa saat objek Double Linked List pertama kali dibuat, linked list tersebut dalam keadaan kosong (belum ada node satupun).

4.Ketika linked list masih kosong dan diisi oleh satu node baru (kondisi isEmpty() == true), maka node baru tersebut merupakan satu-satunya elemen di dalam list.
Oleh karena itu, ia berkedudukan sebagai elemen pertama sekaligus elemen terakhir, sehingga pointer head dan tail wajib menunjuk ke alamat node yang sama.

5.<img width="620" height="289" alt="image" src="https://github.com/user-attachments/assets/eb565f6a-44ca-4a82-9d6d-1821a0605785" />

6.<img width="633" height="284" alt="image" src="https://github.com/user-attachments/assets/f2dccd6a-5f23-4667-b131-0af6cae949d5" />

## PERCOBAAN 2
