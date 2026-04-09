package Praktikum_5;
import java.util.Scanner;
public class mainsum {
    public static void main(String[] args) {
        Scanner reza = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = reza.nextInt();

            Sum27 sm = new Sum27(elemen);
                for (int i = 0; i < elemen; i++){
                    System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
                    sm.keuntungan[i] = reza.nextDouble();
                }
            System.out.println("Total menggunakan Brutforce: " + sm.totalBF());
            System.out.println("Total menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen- 1)); 
    }
}
