import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<SegiEmpat> benda = new ArrayList<>();
    private Scanner hi = new Scanner(System.in);

    private void inputSegiEmpat(){
        System.out.println("Input panjang segi empat: ");
        double p = hi.nextDouble();
        System.out.println("Input Lebar segi empat: ");
        double l = hi.nextDouble();
        benda.add(new SegiEmpat(p, l));
    }

    private void inputBalok(){
        System.out.println("Input panjang balok: ");
        double p = hi.nextDouble();
        System.out.println("Input Lebar balok: ");
        double l = hi.nextDouble();
        System.out.println("Input tinggi balok: ");
        double t = hi.nextDouble();
        benda.add(new Balok(t, p, l));
    }

    private void tampilin(){
        for (SegiEmpat segi4 : benda) {
            segi4.display();
            System.out.println("Luas segi empat: " + segi4.getLuas());

            if (segi4 instanceof Balok) {
                Balok b = (Balok) segi4;
                System.out.println("Volume balok: " + b.getVolume());
            }
        }
    }

    private void main(){
        int input = 0;

        while (input != 4) {
            System.out.println("1. Input Segi Empat\n2. Input Balok\n3. Display\n4. Stop");
            input = hi.nextInt();
            
            switch (input) {
                case 1:
                inputSegiEmpat(); 
                System.out.println();
                break;
                
                case 2:
                inputBalok();
                System.out.println();
                break;
            
                case 3:
                tampilin();
                System.out.println();
                break;

                case 4:
                System.out.println("Out.");
                break;

                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {

        // SegiEmpat persegi = new SegiEmpat(20.4, 10.5);
        // persegi.display();
        // System.out.println(persegi.getLuas());

        // Balok cubic = new Balok(10, 20, 5);
        // cubic.display();
        // System.out.println(cubic.getVolume());
        
        new Main().main();


    }
}