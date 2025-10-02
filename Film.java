import java.util.ArrayList;

public class Film {
    private String nama;
    private String negara;
    private ArrayList<String> daftarAktor;
    private int durasi;
    private int tahunRilis;

    public Film(String nama, String negara, int durasi, int tahunRilis){
        this.nama = nama;
        this.negara = negara;
        this.durasi = durasi;
        this.tahunRilis = tahunRilis;
        this.daftarAktor = new ArrayList<>();
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getNegara() {
        return negara;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setDaftarAktor(ArrayList<String> daftarAktor) {
        this.daftarAktor = daftarAktor;
    }

    public ArrayList<String> getDaftarAktor() {
        return daftarAktor;
    }

    public void displayData() {
        System.out.println("Judul Film   : " + nama);
        System.out.println("Asal Negara  : " + negara);
        System.out.println("Durasi       : " + durasi + " menit");
        System.out.println("Tahun Rilis  : " + tahunRilis);
        System.out.println("Daftar Aktor : " + daftarAktor);
        System.out.println("----------------------------\n");
    }

    public void addActor(String nama){
        daftarAktor.add(nama);
    }

    public void hapusActor(String nama){
        daftarAktor.remove(nama);
    }
}