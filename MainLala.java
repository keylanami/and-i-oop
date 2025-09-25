import java.util.Scanner;

public class MainLala {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        
        System.out.println("1.Hitung Balok\n2. Hitung Bola");
        int pilih = hi.nextInt();
        

       switch (pilih) {
        case 1:
            System.out.println("Input Panjang, Lebar, dan tinggi!");
            int p = hi.nextInt();
            int l = hi.nextInt();
            int t = hi.nextInt();
            
            balok(p, l, t);
            break;
        
            case 2:
    
            System.out.println("Input jari-jari:");
            int radius = hi.nextInt();
           
            bola(radius);

        default:
            break;
       }


    }

    public static void balok(int a, int b, int c){

        int lp = 2 *(a*b + a*c + b*c);
        int vol = a*b*c;
        System.out.println(lp);
        System.out.println(vol);
        
    }

    public static void bola(int a){
        
        int lp = 4 * 22/7 * a * a;
        int vol = 4/3 * 22/7 * a * a* a;

        System.out.println(lp);
        System.out.println(vol);
    }
}
