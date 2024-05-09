// Implementasi kelas untuk masing-masing jenis tiket
class VVIP extends TiketKonser {
    // Konstruktor untuk inisialisasi nama tiket
    public VVIP() {
        this.nama = "UNLIMITED EXPERIENCE";
    }

    // Implementasi method untuk mendapatkan harga tiket
    @Override
    public double getHarga() {
        return 500; // Harga tiket UNLIMITED EXPERIENCE
    }
}