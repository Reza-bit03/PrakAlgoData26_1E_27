package Praktikum_5;
import java.util.Scanner;
public class pangkatmain {
public static void main(String[] args) {    
Scanner  reza = new Scanner (System.in);    
System.out.print("Masukkan jumlah elemen: ");
int elemen = reza.nextInt();       
pangkat [] png = new pangkat [elemen];
for (int i=0; i<elemen; i++){
    System.out.print("Masukkan nilai basis elemen ke-" + (i+1)+": ");
    int basis = reza.nextInt();
        System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1)+": ");
            int pangkat = reza.nextInt();
                png [i] = new pangkat (basis,pangkat);
        }
System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (pangkat p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
        }
System.out.println("HASIL PANGKAT DIVIDE AND COQUER:");
        for(pangkat p : png){
           System.out.println(p.nilai + "^" + p.pangkat +": " + p.pangkatDC(p.nilai, p.pangkat)); 
        }        
    }
}
