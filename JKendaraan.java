public class JKendaraan {
    private String nama;
    private int tahunProduksi;
    private JProdusen produsen;

    public JKendaraan(String nama, int tahunProduksi, JProdusen produsen){
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
        this.produsen = produsen;
    }

    public void infoDasar(){
        System.out.println("== INFO DASAR KENDARAAN ==");
        System.out.println("Nama Produsen: " + this.nama);
        System.out.println("Tahun Produksi " + this.tahunProduksi + "\n");
    }

    public JProdusen getProdusen() {
        return produsen;
    }
}
