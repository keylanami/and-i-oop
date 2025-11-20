public class Order implements Pembayaran {
    protected String id;
    protected String namaPembeli;
    protected String item;
    protected int jumlah;
    protected int harga;
    protected String alamatKirim;

    public Order(String id, String namaPembeli, String item, int jumlah, int harga, String alamat){
        this.id = id;
        this.namaPembeli = namaPembeli;
        this.item = item;
        this.jumlah = jumlah;
        this.harga = harga;
        this.alamatKirim = alamat;
    }

    @Override
    public void invoice() {
        System.out.println("INVOICE");
        System.out.println(namaPembeli);
        System.out.println("Pembelian Barang " + this.item);
        System.out.println("Jumlah " + this.jumlah);
        System.out.println("Total Harga " + totalBayaran(jumlah, harga));
    }

    @Override
    public int totalBayaran(int jumlah, int harga) {
        return this.jumlah * this.harga;
    }
    
    public String getIdOrder() {
        return id;
    }


}