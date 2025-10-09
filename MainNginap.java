public class MainNginap {
    public static void main(String[] args) {
        Penginapan inn = new Penginapan("Nod Krai", "Gang Demang 1");

        Tamu tm = new Tamu("Ken", 10);
        Tamu tm1 = new Tamu("Eskopi", 03);
        Tamu tm2 = new Tamu("Furina", 14);
        Tamu tm3 = new Tamu("Epal", 05);


        inn.catatMasuk(tm);
        inn.catatMasuk(tm1);
        inn.catatMasuk(tm2);
        inn.catatMasuk(tm3);
        
        inn.tampilkanDaftarTamu();

        inn.catatKeluar(tm3);
        inn.catatKeluar(tm);

        inn.tampilkanDaftarTamu();

    }
}
