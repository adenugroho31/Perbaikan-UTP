// Kelas abstrak untuk mewakili semua jenis tiket
abstract class TiketKonser implements HargaTiket {
    protected String nama;

    // Method untuk mendapatkan nama tiket
    public String getNama() {
        return nama;
    }
}
