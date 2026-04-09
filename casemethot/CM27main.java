package casemethot;
import java.util.Scanner;
public class CM27main {
    public static void main(String[] args) {
        Scanner reza = new Scanner(System.in);
        
Mahasiswa[] mhs = {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

Buku[] buku = {
    new Buku("B001", "Algoritma", 2020),
    new Buku("B002", "Basis Data", 2019),
    new Buku("B003", "Pemrograman", 2021),
    new Buku("B004", "Fisika", 2024)
    };

Peminjaman[] pinjam = {
    new Peminjaman(mhs[0], buku[0], 7),
    new Peminjaman(mhs[1], buku[1], 3),
    new Peminjaman(mhs[2], buku[2], 10),
    new Peminjaman(mhs[2], buku[3], 6),
    new Peminjaman(mhs[0], buku[1], 4)
    };

int pilih;

do {
    System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
    System.out.println("1. Tampilkan Mahasiswa");
    System.out.println("2. Tampilkan Buku");
    System.out.println("3. Tampilkan Peminjaman");
    System.out.println("4. Urutkan Berdasarkan Denda");
    System.out.println("5. Cari Berdasarkan NIM");
    System.out.println("0. Keluar");
    System.out.print("Pilih: ");
    pilih = reza.nextInt();

switch (pilih) {
    case 1:
        for (Mahasiswa m : mhs) m.tampilMahasiswa();
    break;

    case 2:
        for (Buku b : buku) b.tampilBuku();
    break;

    case 3:
        for (Peminjaman p : pinjam) p.tampilPeminjaman();
    break;

    case 4:
        for (int i = 0; i < pinjam.length - 1; i++) {
                int max = i;
        for (int j = i + 1; j < pinjam.length; j++) {
                if (pinjam[j].denda > pinjam[max].denda) {
                        max = j;
    }
}

Peminjaman temp = pinjam[i];
pinjam[i] = pinjam[max];
pinjam[max] = temp;
    }

System.out.println("Setelah sorting:");
        for (Peminjaman p : pinjam) p.tampilPeminjaman();
break;

    case 5:
        System.out.print("Masukkan NIM: ");
        String cari = reza.next();

        for (Peminjaman p : pinjam) {
                if (p.mhs.nim.equals(cari)) {
                        p.tampilPeminjaman();
    }
}
break;
    }
} while (pilih != 0);

reza.close();
    }
}