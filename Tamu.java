public class Tamu {
    private String nama;
    private int durasiMenginap;

    public Tamu(String nama, int durasiMenginap){
        this.durasiMenginap = durasiMenginap;
        this.nama = nama;
    }

    public int getDurasiMenginap() {
        return durasiMenginap;
    }

    public String getNama() {
        return nama;
    }
    

    public void setDurasiMenginap(int durasiMenginap) {
        this.durasiMenginap = durasiMenginap;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    


}
