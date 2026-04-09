package Praktikum_5;
public class nilaimain {
public static void main(String[] args) {
    mahasiswa[] data = {
        new mahasiswa("Ahmad", 220101001, 2022, 78, 82),
        new mahasiswa("Budi", 220101002, 2022, 85, 88),
        new mahasiswa("Cindy", 220101003, 2021, 90, 87),
        new mahasiswa("Dian", 220101004, 2021, 76, 79),
        new mahasiswa("Eko", 220101005, 2023, 92, 95),
        new mahasiswa("Fajar", 220101006, 2020, 88, 85),
        new mahasiswa("Gina", 220101007, 2023, 80, 83),
        new mahasiswa("Hadi", 220101008, 2020, 82, 84)
    };
nilai n = new nilai();
System.out.println("Nilai UTS Tertinggi: " + n.maxUTS(data, 0, data.length-1));
System.out.println("Nilai UTS Terendah: " + n.minUTS(data, 0, data.length-1));
System.out.println("Rata-rata UAS: " + n.rataUAS(data));
    }
}