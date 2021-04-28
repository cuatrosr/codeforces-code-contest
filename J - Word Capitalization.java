import java.util.Scanner;

public class Apo2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String txt = sc.nextLine();
        txt = Character.toUpperCase(txt.charAt(0)) + txt.substring(1);
        System.out.println(txt);
    }
}