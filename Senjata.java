public class Senjata {
    private String nama;
    private int power;

    public Senjata(String nama, int power){
        this.nama = nama;
        this.power = power;
    }


    public String getNama() {
        return nama;
    }

    public int getPower() {
        return power;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPower(int power) {
        this.power = power;
    }


    public void upgrade(int power){
        this.power+= power;
        System.out.println(this.nama + " di-upgrade! Power Sekarang: " + this.power);
    }

}

