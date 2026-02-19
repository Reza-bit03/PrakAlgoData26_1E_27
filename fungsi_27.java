public class fungsi_27 {
     public static int hitung_pendapatan27(int[] stok27, int[] hrg27) {
        int total27 = 0;
        for (int i = 0; i < stok27.length; i++) {
            total27 += stok27[i] * hrg27[i];
        }
        return total27;
    }
    public static String cekStatus(int pendapatan27) {
        if (pendapatan27 > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
    public static void main(String[] args) {
        String[] cabang27 = {
                "RoyalGarden 1",
                "RoyalGarden 2",
                "RoyalGarden 3",
                "RoyalGarden 4"
        };
        String[] bunga27 = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        int[][] stok27 = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };
        int[] hrg27 = { 75000, 50000, 60000, 10000 };
        System.out.println("pendapatan12 RoyalGarden\n");

        for (int i = 0; i < stok27.length; i++) {
            int pendapatan27 = hitung_pendapatan27(stok27[i], hrg27);
            System.out.println(cabang27[i]);
            System.out.println("pendapatan12 : Rp." + pendapatan27);
            System.out.println("Status     : " + cekStatus(pendapatan27));
            System.out.println("----------------------------");
        }
    }
}   

