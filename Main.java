public class Main {
    public static void main(String[] args) {
        RumahSakit rs1 = new RumahSakit("Cahaya Bunda");

        Dokter dr1 = new Dokter("AFD", "AFFANDI", "ANAK DAN KULIT");
        
        Pasien pa1 = new Pasien("KYL", "Keyla Johan", "PARU PARU BASAH");
        Pasien pa2 = new Pasien("KAJ", "Kenan Johan", "ALERGI AIR");

        dr1.tambahPasien(pa1.getNama());
        dr1.tambahPasien(pa2.getNama());

        rs1.tambahDokter(dr1);

        Dokter dr2 = new Dokter("KNA", "KEYLA NA", "KARDIOVASKULAR");
        
        Pasien pa3 = new Pasien("KRO", "KERO", "MAU WETFOOD");
        Pasien pa4 = new Pasien("KIO", "KIRO", "BUTUH WETFOOD");
        Pasien pa5 = new Pasien("KOI", "KOI", "WETFOOD");
        dr2.tambahPasien(pa3.getNama());
        dr2.tambahPasien(pa4.getNama());
        dr2.tambahPasien(pa5.getNama());

        rs1.tambahDokter(dr2);

        System.out.println("Daftar Pasien untuk setiap Dokter: ");
        for (int i = 0; i < rs1.getJumlahDokter(); i++) {
            Dokter dokter = rs1.getDokter(i);
            System.out.println("Pasien Dr. " + dokter.getNama());
            for (int j = 0; j < dokter.getJumlahPasien(); j++) {
                System.out.println("- " + dokter.getIdPasien(i));
            }
            System.out.println();
        }

        pa1.setKondisi("Sudah sigma");
        pa2.setKondisi("Genshin sigma");
    }

   
}
