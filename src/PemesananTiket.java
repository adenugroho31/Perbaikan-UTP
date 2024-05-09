// Kelas untuk menyimpan detail pesanan tiket
class PemesananTiket {
    private String namaPemesan;
    private TiketKonser tiket;
    private String kodeBooking;
    private String tanggalPesanan;

    // Konstruktor untuk membuat objek PemesananTiket
    public PemesananTiket(String namaPemesan, TiketKonser tiket) {
        this.namaPemesan = namaPemesan;
        this.tiket = tiket;
        this.kodeBooking = Main.generateKodeBooking(); // Memanggil method generateKodeBooking()
        this.tanggalPesanan = Main.getCurrentDate(); // Memanggil method getCurrentDate
    }

    // Menampilkan detail pesanan
    public void tampilkanDetailPesanan() {
        System.out.println("\n----- Detail Pemesanan -----");
        System.out.println("Nama Pemesan: " + namaPemesan);
        System.out.println("Kode Booking: " + kodeBooking);
        System.out.println("Tanggal Pesanan: " + tanggalPesanan);
        System.out.println("Tiket yang dipesan: " + tiket.getNama());
        System.out.println("Total Harga: " + tiket.getHarga() + " USD");
    }
}
