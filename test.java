import java.util.Scanner;

public class test {

    public static void nambah(int a){
        int apel = 1000 * a;
        System.out.println(apel);
    }

    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        // int angka = hi.nextInt();
        
        int pembeliApel = 0;
        int inputan;
        
        do {

            inputan = hi.nextInt();
            nambah(inputan);
            pembeliApel++;
            
        } while (inputan != -1);
        
        System.out.println("Berapa pembeli apel hari ini?");
        System.out.println(pembeliApel - 1);
    

        // if (angka > 10) {
        //     apel = 20;
        //     apel++;
        //     int kali = apel * 10;
        // }

        
    }
}
