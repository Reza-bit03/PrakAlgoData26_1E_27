package Praktikum_6;
public class sortingmain27 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        sorting27 dataurut1 = new sorting27(a, a.length);

        System.out.println("Data awal:");
        dataurut1.tampil();

        dataurut1.bubblesort();

        System.out.println("Data setelah diurutkan (ASC):");
        dataurut1.tampil();

        int b[] = {30,20,2,8,14};
        sorting27 dataurut2 = new sorting27(b, b.length);

        System.out.println("Data awal 2: ");
        dataurut2.tampil();

        dataurut2.SelectionShort();

        System.out.println("Data sudah di urutkan dengan Selection Short (ASC)");
        dataurut2.tampil();

        int c[] ={40,10,4,9,3};
        sorting27 dataurut3 = new sorting27(c, c.length);
        
        System.out.println("Data awal 3");
        dataurut3.tampil();

        dataurut3.insertionShort();

        System.out.println("Data sudah di uruutkan dengan Insertion Sort (ASC)");
        dataurut3.tampil();
    }
}
