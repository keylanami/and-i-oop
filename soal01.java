import java.util.InputMismatchException;
import java.util.Scanner;

public class soal01 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        try {
            System.out.println("Berapa banyak nilai yang mau dimasukkan?");
            int input = hi.nextInt();
            int nilai = 0;
            int amount = 0;

            for(int i = 0; i < input; i++){
                System.out.println("Masukkan nilai ke-" + (i + 1));
                
                try {
                    int wadah = hi.nextInt();
                    nilai += wadah;
                    amount = (i+1);

                } catch (InputMismatchException e) {
                   System.out.println("Input bukan angka!");
                   break;
                }
            }

            double avg = countAVG(nilai, amount);
            System.out.printf("%.2f", avg);
            
        } catch (InputMismatchException e) {
            System.out.println("input tipe data integer woy");
        } catch (Exception e) {
            System.out.println("Tidak ada nilai masukan");
        }

    }

    public static double countAVG(int nilai, int jumlah) {
        int result = nilai/jumlah;
        double finals = (double) result;
        return finals;
    }

}
