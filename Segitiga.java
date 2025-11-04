public class Segitiga extends BangunDatar { // segitiga is the childclass of the previous bangundatar and it's inheriting the upper's method & structure

    // these two methods below is not a form of overriding, it's overloading as i elaborated at latsol 1
    public static void luas(int a, int t) { // hehe i pake void bcs males ngotak ngatik main and yeah it's seen that i catch 2 condi
        double hasil = 0.5 * a * t; // the both are made to count luas but with different formula so it requires diff variables too
        System.out.println("Luas Segitiga Siku-siku: " + hasil); 
    }

    public static void luas(int a, double s) {
        double tinggi = Math.sqrt((s * s) - (a * a)); // this is when tinggi is not the given info to count luas so it requires pythogoras init
        double hasil = 0.5 * a * tinggi;
        System.out.println("Luas Segitiga Siku-siku (alas & sisi): " + hasil);
    }

    @Override // nahhh ini. basically dia nimpa method di superclass. biar pas dipanggil keliling tuh yang jalan yang ini. java kegocek lah, "kalo nimpa dipikir mas" cenah (maaf bu rizza, ini meme ya..)
    public double keliling() {
        return 0;
    }

    public static void keliling(int a, int b, int c) { // nah ini ya biasa, overload
        int hasil = a + b + c;
        System.out.println("Keliling Segitiga Siku-siku: " + hasil);
    }
}


// sooo @override replaces the parent method's version with a new one
// so that even if called through a bangundatar reference, 
// segitiga's version will execute (runtime polymorphism)

