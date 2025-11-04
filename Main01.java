public class Main01 {

    public static void main(String[] args) {
        System.out.println("Lingkaran dengan jejari 7\nLuas & Keliling\n" + Lingkaran.luas(7) + " | " + Lingkaran.keliling(7));
        System.out.println("Lingkaran dengan jejari 5.5\nLuas & Keliling\n" + Lingkaran.luas(5.5) + " | " + Lingkaran.keliling(5.5));
        System.out.println("Lingkaran dengan jejari 20.4\nLuas & Keliling\n" + Lingkaran.luas(20.4) + " | " + Lingkaran.keliling(20.4));

        // argument yg dilempar ke parameter ini tipe datanya beda-beda as in ada yang angka satuan dan decimal.
        // but however, nama methodnya sama. it's called overloading. Load. ngisi. 
        // so ofc it's chosen at compile time. 
        // how does it go? of course we are nawt gonna do an if-else here but we let Java itself handles by this so called overloading

    }
}
