// Implementasi kelas untuk masing-masing jenis tiket
class FESTIVAL extends TiketKonser {
    // Konstruktor untuk inisialisasi nama tiket
    public FESTIVAL() {
        this.nama = "FESTIVAL";
    }

    // Implementasi method untuk mendapatkan harga tiket
    @Override
    public double getHarga() {
        return 75; // Harga tiket FESTIVAL
    }
}
 