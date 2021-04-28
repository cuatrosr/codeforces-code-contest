import java.util.ArrayList;
import java.util.Scanner;

public class Apo2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        int turn = 1;
        int izq = 0;
        int der = 0;
        String txt = sc.nextLine();
        String[] txtA = txt.split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(txtA[i]));
        }
        for (int i = 0; i < n; i++) {
            if (turn == 1) {
                if (arr.get(0) > arr.get(arr.size() - 1)) {
                    izq += arr.get(0);
                    arr.remove(0);
                } else {
                    izq += arr.get(arr.size() - 1);
                    arr.remove(arr.size() - 1);
                }
                turn++;
            } else if (turn % 2 == 0) {
                if (arr.get(0) > arr.get(arr.size() - 1)) {
                    der += arr.get(0);
                    arr.remove(0);
                } else {
                    der += arr.get(arr.size() - 1);
                    arr.remove(arr.size() - 1);
                }
                turn++;
            } else {
                if (arr.get(0) > arr.get(arr.size() - 1)) {
                    izq += arr.get(0);
                    arr.remove(0);
                } else {
                    izq += arr.get(arr.size() - 1);
                    arr.remove(arr.size() - 1);
                }
                turn++;
            }
        }
        System.out.println(izq + " " + der);
    }
}