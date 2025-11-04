public class Segitiga extends BangunDatar {

    public static void luas(int a, int t) {
        double hasil = 0.5 * a * t;
        System.out.println("Luas Segitiga Siku-siku: " + hasil);
    }

    public static void luas(int a, double s) {
        double tinggi = Math.sqrt((s * s) - (a * a));
        double hasil = 0.5 * a * tinggi;
        System.out.println("Luas Segitiga Siku-siku (alas & sisi): " + hasil);
    }

    @Override
    public double keliling() {
        return 0;
    }

    public static void keliling(int a, int b, int c) {
        int hasil = a + b + c;
        System.out.println("Keliling Segitiga Siku-siku: " + hasil);
    }
}
