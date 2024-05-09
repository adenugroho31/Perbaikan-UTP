// Implementasi kelas untuk masing-masing jenis tiket
public class CAT8 extends TiketKonser {
    // Konstruktor untuk inisialisasi nama tiket
    public CAT8() {
        this.nama = "CAT 8";
    }

    // Implementasi method untuk mendapatkan harga tiket
    @Override
    public double getHarga() {
        return 50; // Harga tiket CAT 8
    }
}
