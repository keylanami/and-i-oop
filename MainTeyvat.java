public class MainTeyvat {
    public static void main(String[] args) {
        Pahlawan hydro = new Pahlawan("Neuvillette", 60000, 90);
        Pahlawan cryo = new Pahlawan("Escoffier", 30000, 89);

        Senjata catalyst = new Senjata("Tome of The Eternal Flow", 300);
        Senjata polearm = new Senjata("Symphonist of Scents", 400);


        hydro.equipWeapon(catalyst);
        hydro.menyerang();

        
        catalyst.upgrade(300);
        catalyst.upgrade(500);
        hydro.menyerang();

        catalyst.upgrade(1000);
        hydro.menyerang();
        

    }
}
