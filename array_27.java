import java.util.Scanner;
public class array_27 {
public static void main(String[] args) {
Scanner reza = new Scanner(System.in);

    String[] mata_kuliah27 = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
    int jml_mk27 = 8;
    int[] sks27 = new int[jml_mk27];
    double[] nilai_angka27 = new double[jml_mk27];
    String[] nilai_huruf27 = new String[jml_mk27];
    double[] nilai_setara27 = new double[jml_mk27];
    double total_bobot27 = 0;
    int total_SKS27 = 0;

    System.out.println("Program Menghitung IP Semester");
    System.out.println("===============================");

        for (int i = 0; i < jml_mk27; i++) {

        System.out.print("Masukkan nilai angka untuk MK " + mata_kuliah27[i] + " : ");
        nilai_angka27[i] = reza.nextDouble();

        while (nilai_angka27[i] < 0 || nilai_angka27[i] > 100) {
        System.out.print("Nilai harus 0 - 100. Masukkan ulang: ");
        nilai_angka27[i] = reza.nextDouble();
            
    }

    System.out.print("Bobot SKS : ");
    sks27[i] = reza.nextInt();

    if (nilai_angka27[i] >= 85) {
        nilai_huruf27[i] = "A";
        nilai_setara27[i] = 4.0;
        } else if (nilai_angka27[i] >= 75) {
            nilai_huruf27[i] = "B+";
            nilai_setara27[i] = 3.5;
        } else if (nilai_angka27[i] >= 65) {
            nilai_huruf27[i] = "B";
            nilai_setara27[i] = 3.0;
        } else if (nilai_angka27[i] >= 60) {
            nilai_huruf27[i] = "C+";
            nilai_setara27[i] = 2.5;
        } else if (nilai_angka27[i] >= 50) {
            nilai_huruf27[i] = "C";
            nilai_setara27[i] = 2.0;
        } else if (nilai_angka27[i] >= 40) {
            nilai_huruf27[i] = "D";
            nilai_setara27[i] = 1.0;
        } else {
            nilai_huruf27[i] = "E";
            nilai_setara27[i] = 0.0;            
        }

        total_bobot27 += nilai_setara27[i] * sks27[i];
        total_SKS27 += sks27[i];

        System.out.println("-------------------------------");
            
    }

        double ip27 = total_bobot27 / total_SKS27;

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("==============================================================");

        for (int i = 0; i < jml_mk27; i++) {
            System.out.println("Mata Kuliah  : " + mata_kuliah27[i]);
            System.out.println("Nilai Angka  : " + nilai_angka27[i]);
            System.out.println("Nilai Huruf  : " + nilai_huruf27[i]);
            System.out.println("Bobot Nilai  : " + nilai_setara27[i]);
            System.out.println("--------------------------------------------------");
        }

        System.out.println("IP Semester : " + ip27);
        System.out.println("==============================================================");
    }
}
