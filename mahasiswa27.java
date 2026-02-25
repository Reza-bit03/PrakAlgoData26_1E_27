public class mahasiswa27 {    
String nama27;
String nim27;
String kelas27;
double ipk27;

void tampilkan_informasi (){
    System.out.println("Nama: "+nama27);
    System.out.println("Nim: "+nim27);
    System.out.println("IPK: "+ipk27);
    System.out.println("Kelas: "+kelas27);    
}    
void ubah_kelas(String kelas_baru){
    kelas27 = kelas_baru;
}
void update_ipk(double  ip_baru){
    ipk27 = ip_baru;
    if (ipk27 <= 0.0 || ipk27 >= 4.0){
        System.out.println("IPK tidak valid");
    }
}
String nilai_kinerja (){
    if (ipk27 >= 3.5){
        return "kinerja sangat baik";
    }else if(ipk27 >= 3.0){
        return "kinerja baik";
    }else if (ipk27 >= 2.0 ){
        return "kinerja cukup";
    }else{
        return "kinerja kurang";
    }      
}
public mahasiswa27 (){

}
public mahasiswa27 (String nm27,String nim27,double ipk27,String kls27){
        nama27 = nm27;
        this.nim27 = nim27;
        this.ipk27 = ipk27;
        kelas27 = kls27;
    }
}
