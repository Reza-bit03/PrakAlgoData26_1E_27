import java.util.Scanner;
public class tugas2_27 {
    public static void input_jadwal27(String[][] jadwal27, Scanner reza) {
        for (int i = 0; i < jadwal27.length; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal27[i][0] = reza.nextLine();

            System.out.print("Ruang            : ");
            jadwal27[i][1] = reza.nextLine();

            System.out.print("Hari             : ");
            jadwal27[i][2] = reza.nextLine();

            System.out.print("Jam              : ");
            jadwal27[i][3] = reza.nextLine();
        }
    }
    
public static void tampil_Semua27(String[][] jadwal27) {
    System.out.println("\n=== Semua Jadwal Kuliah ===");
        for (int i = 0; i < jadwal27.length; i++) {
            System.out.println("Mata Kuliah : " + jadwal27[i][0]);
            System.out.println("Ruang       : " + jadwal27[i][1]);
            System.out.println("Hari        : " + jadwal27[i][2]);
            System.out.println("Jam         : " + jadwal27[i][3]);
            System.out.println("-----------------------------");
        }
    }

public static void tampil_Hari27(String[][] jadwal27, String hari_Cari27) {
    System.out.println("\nJadwal pada hari " + hari_Cari27 + ":");
        for (int i = 0; i < jadwal27.length; i++) {
            if (jadwal27[i][2].equalsIgnoreCase(hari_Cari27)) {
                System.out.println(jadwal27[i][0] + " | " +
                                   jadwal27[i][1] + " | " +
                                   jadwal27[i][3]);
            }
        }
    }

public static void tampil_MK27(String[][] jadwal27, String mk_cari27) {
    System.out.println("\nJadwal untuk Mata Kuliah " + mk_cari27 + ":");
        for (int i = 0; i < jadwal27.length; i++) {
            if (jadwal27[i][0].equalsIgnoreCase(mk_cari27)) {
                System.out.println("Ruang : " + jadwal27[i][1]);
                System.out.println("Hari  : " + jadwal27[i][2]);
                System.out.println("Jam   : " + jadwal27[i][3]);
            }
        }
    }

public static void main(String[] args) {
    Scanner reza = new Scanner(System.in);

    System.out.print("Masukkan jumlah jadwal: ");
    int jumlah27 = Integer.parseInt(reza.nextLine());

    String[][] jadwal27 = new String[jumlah27][4];

    input_jadwal27(jadwal27, reza);
    tampil_Semua27(jadwal27);

    System.out.print("\nCari jadwal berdasarkan hari: ");
    String hari27 = reza.nextLine();
    tampil_Hari27(jadwal27, hari27);

    System.out.print("\nCari jadwal berdasarkan nama MK: ");
    String mk27 = reza.nextLine();
    tampil_MK27(jadwal27, mk27);

    }
}

