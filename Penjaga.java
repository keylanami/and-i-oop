public class Penjaga extends Pegawai{
    private String sesiMasuk;

    public Penjaga(String nama, String alamat, String telepon, String sesiMasuk){
        super(nama, alamat, telepon);
        this.sesiMasuk = sesiMasuk;
    }

    @Override
    public void addOrder(String idOrder) {
        super.addOrder(idOrder);
    }

    @Override
    public void displayOrder() {
        System.out.println("Data order yang diterima Penjaga");
        super.displayOrder();
    }

    public String getSesiMasuk() {
        return sesiMasuk;
    }

    public String getNamaPenjaga(){
        return nama;
    }
}
