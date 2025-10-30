public class JPesawat extends JKendaraan{
    private int ketinggian;
    private int jumlahPeluru;

    public JPesawat(String nama, int tahunProduksi, JProdusen produsen, int jumlahPeluru){
        super(nama, tahunProduksi, produsen);
        this.ketinggian = 0;
        this.jumlahPeluru = jumlahPeluru;
    }

    public void tembak(int tembak){
        if (this.jumlahPeluru > 0) {
            System.out.println("Pesawat Menembakkan " + tembak + " butir peluru");
            System.out.println("Sisa Peluru: " + (this.jumlahPeluru -= tembak));
        } else {
            System.out.println("Peluru sudah ditembakkan semua");
        }
    }

    public void setKetinggian(int ketinggian){
        this.ketinggian = ketinggian;
        System.out.println("Mengubah ketinggian ke: " + ketinggian + " meter");
    }

    public void tambahPeluru(int jumlahPeluru){
        if (this.ketinggian != 0) {
            System.out.println("Tidak bisa isi peluru, pesawat belum mendarat");
        } else {
            this.jumlahPeluru += jumlahPeluru;
            System.out.println("Menambah peluru sebanyak " + jumlahPeluru + " peluru");
            if (this.jumlahPeluru == 0) {
                System.out.println("Peluru sudah ditembakkan semua");
            }
            System.out.println("Jumlah peluru sekarang: " + this.jumlahPeluru + " buah");
        }
    }

    public void infoPesawat(){
        System.out.println("=== INFO PESAWAT ===");
        System.out.println("Jumlah Peluru: " + this.jumlahPeluru);
        System.out.println("Ketinggian: " + this.ketinggian);
        System.out.println();
    }

}
