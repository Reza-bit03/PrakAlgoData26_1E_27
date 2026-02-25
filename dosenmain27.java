public class dosenmain27 {
    public static void main(String[] args) {
        dosen27 ds1 = new dosen27();
            ds1.id_dosen27 = "DS001";
            ds1.nama27 = "Dr. Ahmad";
            ds1.status_aktif27 = true;
            ds1.tahun_bergabung27 = 2015;
            ds1.bidang_keahlian27 = "Algoritma";

        ds1.tampil_informasi();
            ds1.status_aktif(false);
            System.out.println("Masa Kerja: " + ds1.hitung_masa_Kerja(2026) + " tahun");
            ds1.ubah_Keahlian("Machine Learning");
            ds1.tampil_informasi();
    }
}