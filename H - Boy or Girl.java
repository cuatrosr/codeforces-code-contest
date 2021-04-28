import java.util.ArrayList;
import java.util.Scanner;

public class Apo2 {

    private static Scanner sc = new Scanner(System.in);
    private int aux = 0;
    private static ArrayList<Character> test = new ArrayList<Character>();

    public static void main(String[] args) {
        String msg = sc.nextLine();
        for (int i = 0; i < msg.length(); i++) {
            compareChar(msg.charAt(i));
        }
        if (test.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }

    public static void compareChar(char ch) {
        if (test.size() == 0) {
            test.add(ch);
        } else {
            boolean add = true;
            for (int i = 0; i < test.size(); i++) {
                if (test.get(i).equals(ch)) {
                    add = false;
                }
            }
            if (add) {
                test.add(ch);
            }
        }
    }
}