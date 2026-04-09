package Praktikum_5;
import java.util.Scanner;
public class faktorialmain {
    public static void main(String[] args) {
        Scanner  reza = new Scanner (System.in);
        
        System.out.print("Masukkan nilai: ");
        
        int nilai = reza.nextInt();

        BruteForceDivideConquer fk = new BruteForceDivideConquer();
        
        System.out.println("Nilai faktorial: "+ nilai + "   menggunakan fb: "+fk.faktorialBF(nilai));        
        System.out.println("Nilai Faktorial: "+ nilai +"  menggunakan DC: "+fk.faktorialDC(nilai));
    }
}
