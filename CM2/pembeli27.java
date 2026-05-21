package CM2;
class Pembeli27 {
    int noAntrian;
    String namaPembeli;
    String noHp;
    Pembeli27 prev, next;

Pembeli27(int noAntrian, String namaPembeli, String noHp) {
    this.noAntrian = noAntrian;
    this.namaPembeli = namaPembeli;
    this.noHp = noHp;
    this.prev = null;
    this.next = null;
  }
}
