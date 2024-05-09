// Implementasi kelas untuk masing-masing jenis tiket
class CAT1 extends TiketKonser {
    // Konstruktor untuk inisialisasi nama tiket
    public CAT1() {
        this.nama = "CAT 1";
    }

    // Implementasi method untuk mendapatkan harga tiket
    @Override
    public double getHarga() {
        return 100; // Harga tiket CAT 1
    }
}