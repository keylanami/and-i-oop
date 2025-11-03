public class Lingkaran {

    private static double pi = 3.14;

    public static double luas(float r){
        return r * r * pi;
    }

    public static double luas(double d){
        double r = d/2;
        return r * r * pi;
    }

    public static double keliling(float r){
        return r * 2 * pi;
    }

    public static double keliling(double d){
        return d * pi;
    }
}