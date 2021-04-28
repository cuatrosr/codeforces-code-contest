import java.util.Scanner;

public class Apo2 {

    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int first = Integer.parseInt(sc.nextLine());
        int aux = 0;
        while (first > 0) {
            String st = sc.nextLine();
            String[] stA = st.split(" ");
            int aus = 0;
            for (int i = 0; i < stA.length; i++) {
                if (Integer.parseInt(stA[i]) == 1) {
                    aus++;
                }
            }
            aux += (aus >= 2) ? 1 : 0;
            first--;
        }
        System.out.println(aux);
    }
}