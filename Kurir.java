public class Kurir extends Pegawai {
    private String wilayahAntar;

    public Kurir(String nama, String alamat, String telepon, String wilayahAntar){
        super(nama, alamat, telepon);
        this.wilayahAntar = wilayahAntar;
    }

    @Override
    public void addOrder(String idOrder) {
        super.addOrder(idOrder);
    }

    @Override
    public void displayOrder() {
        super.displayOrder();
    }

    public String getWilayahAntar() {
        return wilayahAntar;
    }

    public String getNamaKurir(){
        return nama;
    }

    
}
