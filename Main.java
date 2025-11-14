public class Main {
    public static void main(String[] args) {
        Pegawai p1 = new Manager("Muti", 1000, 5000, 6000, 4000);
        System.out.println("Gaji " + p1.getNama() + ": ");
        System.out.printf("%.1f", p1.getGaji());
        System.out.println();


        Pegawai p2 = new StaffOperasional("Kei", 20000, 90000);
        System.out.println("Gaji " + p2.getNama() + ": ");
        System.out.printf("%.1f", p2.getGaji());
        System.out.println();
   
    }
}
