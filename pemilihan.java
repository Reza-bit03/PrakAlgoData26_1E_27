
import java.util.Scanner;
public class pemilihan {
    public static void main(String[] args) {
    Scanner reza = new Scanner(System.in);
        
    System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("==============================");
        System.out.print("Masukkan nilai tugas: ");
        double tugas27 = reza.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis27 = reza.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts27 = reza.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas27 = reza.nextDouble();
        System.out.println("==============================");
        System.out.println("==============================");
        double nilai_akhir27 = (tugas27 * 0.20)+(kuis27 * 0.20)+(uts27 * 0.30)+(uas27 * 0.40);
        
        if (tugas27 > 100 || kuis27 > 100 || uts27 > 100 || uas27 > 100){
            System.out.println("Nilai tidak valid");
            System.out.println("=================");
        }else{
            System.out.println("Nilai akhir: "+nilai_akhir27);
        }    
        
        String nilai_huruf27;
        String lulus27;

        if (nilai_akhir27 >= 80 && nilai_akhir27 > 100){
            nilai_huruf27 = "A";
            lulus27 = "LULUS";
        }else if (nilai_akhir27 >= 73 && nilai_akhir27 > 80){
            nilai_huruf27 = "B+";
            lulus27 = "LULUS";
        }else if (nilai_akhir27 >= 65 && nilai_akhir27 > 73){
            nilai_huruf27 = "B";
            lulus27 = "LULUS";
        }else if (nilai_akhir27 >=60 && nilai_akhir27 > 65){
            nilai_huruf27 = "C+";
            lulus27 = "LULUS";
        }else if (nilai_akhir27 >= 50 && nilai_akhir27 > 60){
            nilai_huruf27 = "C";
            lulus27 = "LULUS";
        }else if (nilai_akhir27 >= 39 && nilai_akhir27 > 50){
            nilai_huruf27 = "D";
            lulus27 = "TIDAK LULUS!!!";
        }else{
            nilai_huruf27 = "E";
            lulus27 = "TIDAK LULUS!!!";
        }
        System.out.println("Nilai huruf: "+nilai_huruf27);
        System.out.println("=================");
        System.out.println(lulus27);
    }   
}
