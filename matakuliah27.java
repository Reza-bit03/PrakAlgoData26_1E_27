public class matakuliah27 {
    String kode_mk27;
    String nama27;
    int sks27;
    int jml_jam27;

    public matakuliah27 (){

    }
    public matakuliah27 (String kode_mk27,String nama27,int sks27,int jml_jam27){
        this.kode_mk27 = kode_mk27;
        this.nama27 = nama27;
        this.sks27 = sks27;
        this.jml_jam27 = jml_jam27;
    }
    void tampilkan_informasi(){
        System.out.println("kode mk: "+kode_mk27);
        System.out.println("nama mk: "+nama27);
        System.out.println("SKS: "+sks27);
        System.out.println("jumlah jam: "+jml_jam27);
    }
    void ubah_sks(int sks_baru){
        sks27 = sks_baru;
        System.out.println("SKS di ubah: "+sks27);
    }
    void tambah_jam(int jam){
        jml_jam27 +=jam;
        System.out.println("Tambahan jam: "+jml_jam27);
    }
    void kurangi_jam(int jam){
        if (jml_jam27 >=jam){
        jml_jam27 -=jam;
        System.out.println("Pengurangan jam: "+jml_jam27);
    }else{
        System.out.println("Tidak dapat di kurangi");
        }
    }
}

