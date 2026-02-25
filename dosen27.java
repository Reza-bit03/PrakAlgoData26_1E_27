public class dosen27 {
    String id_dosen27;
    String nama27;
    boolean status_aktif27;
    int tahun_bergabung27;
    String bidang_keahlian27;

    public dosen27() {
    }
    public dosen27(String id_dosen27, String nama27, boolean status_aktif27, 
                 int tahun_bergabung27, String bidang_Keahlian27) {
        this.id_dosen27 = id_dosen27;
        this.nama27 = nama27;
        this.status_aktif27 = status_aktif27;
        this.tahun_bergabung27 = tahun_bergabung27;
        this.bidang_keahlian27 = bidang_Keahlian27;
    }
    void tampil_informasi() {
        System.out.println("ID Dosen        : " + id_dosen27);
        System.out.println("Nama            : " + nama27);
        System.out.println("Status Aktif    : " + (status_aktif27 ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahun_bergabung27);
        System.out.println("Bidang Keahlian : " + bidang_keahlian27);
    }
    void status_aktif(boolean status) {
            status_aktif27 = status;
            System.out.println("Status dosen berhasil diperbarui.");
    }
    int hitung_masa_Kerja(int thn_skrg) {
            return thn_skrg - tahun_bergabung27;
    }
    void ubah_Keahlian(String bidang) {
            bidang_keahlian27 = bidang;
            System.out.println("Bidang keahlian berhasil diubah.");
        }
    }

