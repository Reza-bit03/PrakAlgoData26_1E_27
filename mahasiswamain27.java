public class mahasiswamain27 {
public static void main(String[] args) {
    mahasiswa27 mhs1 = new mahasiswa27 ();
        mhs1.nama27 = "muhammad ali farhan";
        mhs1.nim27 = "2241720171";
        mhs1.kelas27 = "SI 2J";
        mhs1.ipk27 = 3.55;

    mhs1.tampilkan_informasi ();
        mhs1.ubah_kelas ("SI 2K");
        mhs1.update_ipk(3.60);
        mhs1.tampilkan_informasi();
    mahasiswa27 mhs2 = new mahasiswa27("Annisa Nabila","2141720160",3.25,"TI 2L");
    mhs2.update_ipk(3.30);
    mhs2.tampilkan_informasi();     
    
    mahasiswa27 mhsreza = new mahasiswa27("Reza Surya Pratama","254107020046",3.5,"TI 1E");
        mhsreza.tampilkan_informasi();
    }
}
