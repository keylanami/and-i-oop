public class Preorder extends Order{
    private String tanggalKirimm;
    private int dp;

    public Preorder(String id, String namaPembeli, String item, int jumlah, int harga, String tanggalKirim, int dp){
        super(id, namaPembeli, item, jumlah, harga, tanggalKirim);
        // this.tanggalKirim = tanggalKirim;
        this.dp = dp;
    }

    @Override
    public void invoice() {
        System.out.println("INVOICE");
        System.out.println(this.namaPembeli);
        System.out.println("Jumlah: " + this.jumlah );
        System.out.println("DP yang sudah dibayar: " + this.dp);
        sisaBayar();
        System.out.println("Tanggal kirim: " + alamatKirim);
    }


    public void sisaBayar() {
        System.out.println("Sisa harga yang perlu dibayar: " + (harga - dp));
    }


    @Override
    public String getIdOrder() {
        return super.getIdOrder();
    }

    
}
 