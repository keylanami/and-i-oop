public class main {
    public static void main(String[] args) {
        Film test = new Film("Test Movie", "Testland", 200, 2025);
        test.addActor("Hola");
        test.addActor("Hi");
        test.displayData();

        Film cihuy = new Film("Keyla Demon Hunter", "Cirebon", 200, 2025);
        cihuy.addActor("Rumi");
        cihuy.addActor("Jinu");
        cihuy.displayData();

        Film hola = new Film("Sousou no Frieren", "Jepang", 200, 2024);
        hola.addActor("Frieren");
        hola.addActor("Himmel");
        hola.addActor("Fern");
        hola.addActor("Stark");
        hola.displayData();
    }
}
