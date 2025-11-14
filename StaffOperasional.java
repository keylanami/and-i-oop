public class StaffOperasional extends Pegawai {
    private double lembur;

    public StaffOperasional(String nama, double gaji, double lembur){
        super(nama, gaji);
        this.lembur = lembur;
    }

    @Override
    public double getGaji() {
        double res = gaji += this.lembur;
        return res;
    }
}
