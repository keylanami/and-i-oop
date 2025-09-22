package drill;
import java.util.Scanner;

public class base {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 85, 60};
        
        for (int i : nilai) {
            System.out.print(i + " ");
        }

        int jumlah = 0;
        for(int i = 0; i < nilai.length; i++){
            jumlah += nilai[i];
        }

        System.out.println("\n" + jumlah);


        int avg = jumlah / (nilai.length + 1);
        System.out.println(avg);

        int highest = nilai[0];
        for(int i = 0; i < nilai.length; i++){
            if (nilai[i] > highest) {
                highest = nilai[i];
            }
        }
        System.out.println("highest: " + highest);



        int min = nilai[0];
        for (int tertinggi : nilai) {
            if (tertinggi < min) {
                min = tertinggi;
            }
        }
        System.out.println("lowest: " + min);

        Scanner hi = new Scanner(System.in);
        int search = hi.nextInt();
        int at = 0;
        for(int i = 0; i < nilai.length; i++){
            if (search == nilai[i]) {
                search = nilai[i];
                at = i;
            }
        }

        System.out.println("found " + search + " at index " + at);

        
    }
}
