// declare, access, looping array

public class one {
    public static void main(String[] args) {

        int[] nilai = {10, 9, 20, 8, 30, 7, 40, 6, 50, 5};

        System.out.println(nilai[8]);
        nilai[4] = 120;
        System.out.println(nilai[0] + nilai[4]);

        for(int i = 0; i < nilai.length; i++){
            System.out.println("Index: " + i + " = " + nilai[i]);
        }

        for (int i : nilai) {
            System.out.print(i + " ");
        }
    }
}

// Ukuran tetap, ga bisa tambah otomatis.
// no method canggih (add, remove, search mudah).