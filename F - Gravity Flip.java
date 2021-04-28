import java.util.Scanner;

public class Apo2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int ammount = Integer.parseInt(sc.nextLine());
        String t = sc.nextLine();
        String[] towers = t.split(" ");
        int[] tow = new int[ammount];
        for (int i = 0; i < towers.length; i++) {
            tow[i] = Integer.parseInt(towers[i]);
        }
        tow = bubbleSort(tow);
        String asd = "";
        for (int i = 0; i < tow.length; i++) {
            if ((i + 1) == tow.length) {
                asd += tow[i];
            } else {
                asd += tow[i] + " ";
            }
        }
        System.out.println(asd);
    }

    public static int[] bubbleSort(int[] tow) {
        int auxNum = 0;
        int auxAvr = tow.length - 1;
        boolean changed = true;
        for (int i = 1; i < tow.length && changed; i++) {
            changed = false;
            for (int j = 0; j < tow.length - i; j++) {
                if (tow[j] > tow[j + 1]) {
                    int temp = tow[j];
                    tow[j] = tow[j + 1];
                    tow[j + 1] = temp;
                    changed = true;
                    auxNum++;
                }
            }
        }
        return tow;
    }
}