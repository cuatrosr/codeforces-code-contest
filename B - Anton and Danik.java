import java.util.Scanner;

public class Apo2 {

    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int first = Integer.parseInt(sc.nextLine());
        String second = sc.nextLine();
        int d = 0;
        int a = 0;
        for (int i = 0; i < first; i++) {
            if (second.charAt(i) == 'D') {
                d += 1;
            } else {
                a += 1;
            }
        }
        if (a > d) {
            System.out.println("Anton");
        } else if (d > a) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}