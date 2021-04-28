import java.util.Scanner;

public class Apo2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String txt = sc.nextLine();
        String[] txtA = txt.split(" ");
        int[] arr = new int[txtA.length];
        for (int i = 0; i < txtA.length; i++) {
            arr[i] = Integer.parseInt(txtA[i]);
        }
        String trip = sc.nextLine();
        int msg = 0;
        for (int i = 0; i < trip.length(); i++) {
            if (trip.charAt(i) == '1') {
                msg += arr[0];
            } else if (trip.charAt(i) == '2') {
                msg += arr[1];
            } else if (trip.charAt(i) == '3') {
                msg += arr[2];
            } else {
                msg += arr[3];
            }
        }
        System.out.println(msg);
    }
}