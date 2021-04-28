import java.util.Scanner;

public class Apo2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        String txt = sc.nextLine();
        String[] txtA = txt.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(txtA[i]);
        }
        int police = 0;
        int crimes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1 && police == 0) {
                crimes++;
            } else if (arr[i] == -1 && police > 0) {
                police--;
            } else {
                police += arr[i];
            }
        }
        System.out.println(crimes);
    }
}