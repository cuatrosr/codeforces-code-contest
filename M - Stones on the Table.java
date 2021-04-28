import java.util.Scanner;

public class Apo2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        String txt = sc.nextLine();
        int moves = 0;
        if (n != 1) {
            for (int i = 1; i < n; i++) {
                if (txt.charAt(i) == txt.charAt(i-1)) {
                    moves++;
                }
            }
        }
        System.out.println(moves);
    }
}