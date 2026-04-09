package Praktikum_6;
public class MahasiswaBerprestasi {
    Mahasiswa27[] listMhs = new Mahasiswa27[5];
    int idx;

void tambah(Mahasiswa27 m){
    if (idx < listMhs.length){
        listMhs[idx] = m;
        idx++; 
    } else {
        System.out.println("Data sudah penuh!");
    }
}

void tampil(){
    for (int i = 0; i < idx; i++){
        listMhs[i].tampilInformasi();
        System.out.println("--------------------");
    }
}

void bubbleSort(){
    for (int i = 0; i < idx - 1; i++){
        for (int j = 1; j < idx - i; j++){
            if (listMhs[j].ipk > listMhs[j-1].ipk){
                Mahasiswa27 tmp = listMhs[j];
                listMhs[j] = listMhs[j-1];
                listMhs[j-1] = tmp;
                }
            }
        }
    }
void selectionShort (){
    for (int i = 0; i < listMhs.length-1; i++){
        int idxMin = i;
        for (int j = i +1; j < listMhs.length; j++){
            if (listMhs[j].ipk < listMhs[idxMin].ipk){
                idxMin = j;
            }
        }
    Mahasiswa27 tmp = listMhs[idxMin];
    listMhs[idxMin] = listMhs[i];
    listMhs[i] = tmp;
    }
}
void insertionShort(){
    for (int i = 1; i < idx; i++){
        Mahasiswa27 temp = listMhs[i];
        int j = i - 1;

        while (j >= 0 && listMhs[j].ipk < temp.ipk){
            listMhs[j+1] = listMhs[j];
            j--;
        }
        listMhs[j+1] = temp;
    }
}
}