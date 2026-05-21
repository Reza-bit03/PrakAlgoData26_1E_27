package CM2;

class Pesanan27 {
    int kodePesanan;
    String namaPesanan;
    int harga;
    String namaPembeli;
    Pesanan27 prev, next;

    Pesanan27(int kodePesanan, String namaPesanan, int harga, String namaPembeli) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
        this.prev = null;
        this.next = null;
    }
}
