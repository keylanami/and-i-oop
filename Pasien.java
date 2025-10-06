public class Pasien {
    private String id;
    private String nama;
    private String kondisi;

    public Pasien(String id, String nama, String kondisi){
        this.id = id;
        this.nama = nama;
        this.kondisi = kondisi;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getKondisi() {
        return kondisi;
    }
    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
    

}
