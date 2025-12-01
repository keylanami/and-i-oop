import java.util.Scanner;

public class lagi {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

		int ordo = hi.nextInt();
		int[][] matrixA = new int[ordo][ordo];
		int[][] matrixB = new int[ordo][ordo];

		for(int i = 0; i < ordo; i++){
			for(int j = 0; j < ordo; j++){
				matrixA[i][j] = hi.nextInt();
			}
		}

		for(int i = ordo - 1; i >= 0; i--){
			for(int j = 0; j < ordo; j++){
				matrixB[i][j] = matrixA[i][j];
				System.out.print(matrixB[i][j]);
				if (j < ordo - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
}
