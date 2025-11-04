import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        boolean ho = false;
        
        while (!ho) {
            System.out.println("1. Informasi berupa alas, tinggi, lebar segitiga\n2. Informasi berupa alas dan sisi segitiga\n3. Keluar");
            int menu = hi.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Masukkan alas: ");
                    int alas = hi.nextInt();

                    System.out.print("Masukkan tinggi: ");
                    int tinggi = hi.nextInt();

                    System.out.print("Masukkan sisi miring: ");
                    int sismir = hi.nextInt();


                    Segitiga.keliling(alas, tinggi, sismir);
                    break;
                
                case 2:
                    System.out.print("Masukkan alas: ");
                    int alass = hi.nextInt();

                    System.out.print("Masukkan sisi miring: ");
                    double sisi = hi.nextDouble();

                    
                    Segitiga.luas(alass, sisi);
                    break;
                
                case 3:
                    ho = true;
                break;
            }
        } 
    }
}
