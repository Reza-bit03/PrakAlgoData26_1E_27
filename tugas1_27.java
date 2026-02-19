import java.util.Scanner;
public class tugas1_27 {
public static void main(String[] args) {
Scanner reza = new Scanner(System.in);
    char[] kode27 = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
    String[] kota27 = {
                "Banten","Jakarta","Bandung",
                "Cirebon","Bogor","Pekalongan",
                "Semarang","Surabaya","Malang",
                "Tegal"
        };

    System.out.print("Masukkan kode plat: ");
    char cari27 = Character.toUpperCase(reza.next().charAt(0));
    boolean ditemukan27 = false;
    for (int i = 0; i < kode27.length; i++) {
        if (cari27 == kode27[i]) {
            System.out.println("Kota: " + kota27[i]);
            ditemukan27 = true;
            break;
        }
    }

    if (!ditemukan27) {
        System.out.println("Kode tidak ditemukan.");
        }
    
    }
}

