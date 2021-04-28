import java.util.Scanner;

public class Apo2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String txt = sc.nextLine();
        int up = 0;
        int down = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (Character.isUpperCase(txt.charAt(i))) {
                up += 1;
            } else {
                down += 1;
            }
        }
        if (up > down) {
            txt = txt.toUpperCase();
        } else {
            txt = txt.toLowerCase();
        }
        System.out.println(txt);
    }
}