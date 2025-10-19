import java.util.Scanner;

public class CleanCode {
    static int sumEven(int n, Scanner sc) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
        int x = sc.nextInt();
        if (x % 2 == 0) sum += x;
    }
    return sum;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumEven(n, sc));
    }
}
