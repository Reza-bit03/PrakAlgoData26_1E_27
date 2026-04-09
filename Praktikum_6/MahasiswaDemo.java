package Praktikum_6;
import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner reza = new Scanner(System.in);
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = Integer.parseInt(reza.nextLine());

for (int i = 0; i < jumlah; i++){
        System.out.println("\nData Mahasiswa ke-" + (i+1));
        System.out.print("NIM   : ");
        String nim = reza.nextLine();
        System.out.print("Nama  : ");
        String nama = reza.nextLine();
        System.out.print("Kelas : ");
        String kelas = reza.nextLine();
        System.out.print("IPK   : ");
        double ipk = Double.parseDouble(reza.nextLine());
        Mahasiswa27 m = new Mahasiswa27(nim, nama, kelas, ipk);
        list.tambah(m);
    }

    System.out.println("\nData mahasiswa sebelum sorting:");
    list.tampil();
    list.bubbleSort();

    System.out.println("\nData mahasiswa setelah sorting (IPK DESC):");
    list.tampil();

    System.out.println("\nData sudah urut menggunakan Selection Short:");
    list.selectionShort();
    list.tampil();

    System.out.println("Data menggunakan Insertion Sort (ASC):");
    list.insertionShort();
    list.tampil();
    }
}