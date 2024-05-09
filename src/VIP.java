// Implementasi kelas untuk masing-masing jenis tiket
class VIP extends TiketKonser {
    // Konstruktor untuk inisialisasi nama tiket
    public VIP() {
        this.nama = "VIP";
    }

    // Implementasi method untuk mendapatkan harga tiket
    @Override
    public double getHarga() {
        return 200; // Harga tiket VIP
    }
}
