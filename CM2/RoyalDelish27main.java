package CM2;
import java.util.Scanner;
public class RoyalDelish27main {
    public static void main(String[] args) {
        Scanner reza = new Scanner(System.in);
        antrianDLL27 antrian = new antrianDLL27();
        pesananDLL27 pesanan = new pesananDLL27();

        antrian.tambahAntrian("Ainra", "08224500000");
        antrian.tambahAntrian("Danra", "08224511111");
        antrian.tambahAntrian("Sanri", "08224522222");

        int pilihan;
        do {
            System.out.println("\n==============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = reza.nextInt();
            reza.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = reza.nextLine();
                    System.out.print("No HP        : ");
                    String hp = reza.nextLine();
                    antrian.tambahAntrian(nama, hp);
                    break;

                case 2:
                    antrian.cetakAntrian();
                    break;

                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong!");
                        break;
                    }
                    System.out.println("Pembeli berikutnya: " + antrian.head.namaPembeli);
                    System.out.print("Kode Pesanan  : ");
                    int kode = reza.nextInt();
                    reza.nextLine();
                    System.out.print("Nama Pesanan  : ");
                    String namaMakanan = reza.nextLine();
                    System.out.print("Harga         : ");
                    int harga = reza.nextInt();
                    reza.nextLine();

                    Pembeli27 dilayani = antrian.hapusAntrian();
                    pesanan.tambahPesanan(kode, namaMakanan, harga, dilayani.namaPembeli);
                    System.out.println(dilayani.namaPembeli + " telah memesan " + namaMakanan);
                    break;

                case 4:
                    pesanan.laporanPesanan();
                    break;

                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);

        reza.close();
    }
}

