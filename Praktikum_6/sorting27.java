package Praktikum_6;
public class sorting27 {
    int[] data;
    int jumdata;

    sorting27(int[] data, int jmldat){
        jumdata = jmldat;
        this.data = new int[jmldat];
        for (int i = 0; i < jumdata; i++){
            this.data[i] = data[i];
        }
    }
void bubblesort(){
    int temp;
    for (int i = 0; i < jumdata - 1; i++) {
        for (int j = 1; j < jumdata - i; j++) {
            if (data[j-1] > data[j]){
                temp = data[j];
                data[j] = data[j-1];
                data[j-1] = temp;
                }
            }
        }
    }
void SelectionShort(){
    for (int i =0; i < jumdata-1; i++){
        int min = i;
        for (int j = i+1; j < jumdata; j++){
            if (data[j] < data[min]){
                min = j;
            }
        }
        int temp = data[i];
        data[i] = data[min];
        data[min] = temp; 
    } 
}
void insertionShort(){
    for (int i = 0; i <= data.length-1; i++ ){
        int temp = data[i];
        int j = i-1;
        while (j >= 0 && data[j] >temp){
            data[j+1] = data[j];
            j--; 
        }
        data [j+1] = temp;
    }
}
void tampil(){
    for (int i = 0; i < jumdata; i++){
        System.out.print(data[i] + " ");
    }
    System.out.println();
    }
}