import java.util.ArrayList;

public class MainKarakter {

    public static void main(String[] args) {
        ArrayList<Karakter> daftar = new ArrayList<>();

        Karakter char1 = new Karakter("Nevan", 20, 300);

        Pejuang warrior1 = new Pejuang("Agatha", 50, 100);
        Pejuang warrior2 = new Pejuang("Furina", 20, 80);

        daftar.add(warrior1);
        daftar.add(warrior2);

        System.out.println("Daftar Karakter");
        for (Karakter kar : daftar) {
            kar.displayInfo();
            System.out.println();
        }

        System.out.println("Aksi Karakter");
        char1.serang();
        char1.bertahan();
        char1.regenerasiNyawa();

        warrior1.setEnergi(0);
        warrior1.serang();
        warrior1.skillSerang();
        warrior1.regenerasiEnergi();
        warrior1.skillSerang();
        warrior1.regenerasiEnergi();
        warrior1.skillSerang();
        warrior1.bertahan();

        warrior2.terkenaSerangan(warrior2.getNyawa());
        warrior2.serang();

        System.out.println("Upgrade Level");
        char1.upgradeLevel();
        warrior1.upgradeLevel();


        System.out.println("Terkena Serangan");
        char1.terkenaSerangan(30);
        warrior1.terkenaSerangan(30);
        
        System.out.println("Regenerasii");
        char1.regenerasiNyawa();
        warrior1.regenerasiNyawa();
        warrior1.regenerasiEnergi();
    }
}