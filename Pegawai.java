public abstract class Pegawai {
    protected String nama;
    protected double gaji;

    public Pegawai(String nama, double gaji){
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public abstract double getGaji();
}
