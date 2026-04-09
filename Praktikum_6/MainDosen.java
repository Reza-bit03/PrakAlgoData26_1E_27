package Praktikum_6;
import java.util.Scanner;
public class MainDosen {
public static void main(String[] args) {
    Scanner reza = new Scanner(System.in);
    DataDosen data = new DataDosen();
    int pilih;

    do {
        System.out.println("\nMENU:");
        System.out.println("1. Tambah Data Dosen");
        System.out.println("2. Tampil Data");
        System.out.println("3. Sorting ASC (Usia termuda)");
        System.out.println("4. Sorting DSC (Usia tertua)");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
        pilih = reza.nextInt();
        reza.nextLine();

switch (pilih){
    
    case 1:
        System.out.print("Kode: ");
        String kd = reza.nextLine();
        System.out.print("Nama: ");
        String nama = reza.nextLine();
        System.out.print("Jenis Kelamin (true=L / false=P): ");
        boolean jk = reza.nextBoolean();
        System.out.print("Usia: ");
        int usia = reza.nextInt();

        Dosen d = new Dosen(kd, nama, jk, usia);
            data.tambah(d);
            break;

case 2:
    data.tampil();
    break;

case 3:
    data.SortingASC();
    System.out.println("Data berhasil diurutkan ASC!");
    break;

case 4:
    data.sortingDSC();
    System.out.println("Data berhasil diurutkan DSC!");
    break;

case 5:
    System.out.println("Keluar...");
    break;

    default:
        System.out.println("Pilihan tidak valid!");
        }

        } while (pilih != 5);
    }
}
