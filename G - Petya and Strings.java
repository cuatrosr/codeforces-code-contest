import java.util.Scanner;

public class Apo2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String first = sc.nextLine();
        String second = sc.nextLine();
        if (first.compareToIgnoreCase(second) > 0) {
            System.out.println("1");
        } else if (second.compareToIgnoreCase(first) > 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }
}