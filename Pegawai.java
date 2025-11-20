import java.util.ArrayList;

public abstract class Pegawai {
    protected String nama;
    protected String alamat;
    protected String telepon;
    protected ArrayList<String> idOrder;

    public Pegawai(String nama, String alamat, String telepon){
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.idOrder = new ArrayList<>();
    }

    public void addOrder(String idOrder){
        this.idOrder.add(idOrder);
    }

    public void displayOrder(){
        for (String i : idOrder) {
            System.out.println("ID order " + i);
        }
    }


}
