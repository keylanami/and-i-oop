public class Manager extends Pegawai {
    private double tunjangan;
    private double bonus;

    public Manager(String nama, double gaji, double lembur, double tunjangan, double bonus){
        super(nama, gaji);
        this.tunjangan = tunjangan + lembur;
        this.bonus = bonus;
    }

    @Override
    public double getGaji() {
        return gaji + this.tunjangan + this.bonus;
    }
}
