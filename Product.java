import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    private String id;
    private String nama;
    private String produsen;
    private int berat;
    private String jenis;
    private ArrayList<String> dataProduk;
    private int harga;
    private String lokasiRak;
    private int stok;

    public Product(String id, String nama, String produsen, String jenis, int berat, int harga, String lokasiRak, int stok){
        this.id = id;
        this.nama = nama;
        this.produsen = produsen;
        this.berat = berat;
        this.harga = harga;
        this.lokasiRak = lokasiRak;
        this.stok = stok;
        this.dataProduk = new ArrayList<>();
        this.jenis = jenis;
    }

    
    public void setBerat(int berat) {
        this.berat = berat;
    }


    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void setLokasiRak(String lokasiRak) {
        this.lokasiRak = lokasiRak;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdusen(String produsen) {
        this.produsen = produsen;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getBerat() {
        return berat;
    }

    public int getHarga() {
        return harga;
    }

    public String getId() {
        return id;
    }

    public String getLokasiRak() {
        return lokasiRak;
    }

    public String getNama() {
        return nama;
    }

    public String getProdusen() {
        return produsen;
    }
    public int getStok() {
        return stok;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setDataProduk(ArrayList<String> dataProduk) {
        this.dataProduk = dataProduk;
    }

    public ArrayList<String> getDataProduk() {
        return dataProduk;
    }




    public void displayProduct(){
        System.out.println("ID Produk   : " + id);
        System.out.println("Nama Produk : " + nama);
        System.out.println("Produsen    : " + produsen);
        System.out.println("Jenis       : " + jenis);
        System.out.println("Berat       : " + berat + " gram");
        System.out.println("Harga       : Rp " + harga);
        System.out.println("Lokasi Rak  : " + lokasiRak);
        System.out.println("Stok        : " + stok);
        System.out.println("----------------------------");
    }
}
