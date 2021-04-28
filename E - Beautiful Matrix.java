import java.util.Scanner;

public class Apo2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            String auxi = sc.nextLine();
            String[] aux = auxi.split(" ");
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(aux[j]);
            }
        }
        int x = 0;
        int z = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 1) {
                    x = i;
                    z = j;
                }
            }
        }
        int moves = 0;
        while (x != 2 || z != 2) {            
            if (x != 2) {
                if (x > 2) {
                    x--;
                } else {
                    x++;
                }
                moves++;
            } else {
                if (z > 2) {
                    z--;
                } else {
                    z++;
                }
                moves++;
            }
        }
        System.out.println(moves);
    }
}