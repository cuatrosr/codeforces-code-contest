import java.util.Scanner;

public class Apo2 {

    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        String first = sc.nextLine();
        String second = sc.nextLine();
        String[] firstA = first.split(" ");
        String[] secondA = second.split(" ");
        int aux = 0;
        for (int i = 0; i < Integer.parseInt(firstA[0]); i++) {
            if (Integer.parseInt(secondA[i]) <= Integer.parseInt(firstA[1])) {
                aux += 1;
            } else {
                aux += 2;
            }
        }
        System.out.println(aux);
    }
}