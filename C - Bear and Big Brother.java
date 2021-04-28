import java.util.Scanner;

public class Apo2 {

    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        String first = sc.nextLine();
        String[] firstA = first.split(" ");
        int lim = Integer.parseInt(firstA[0]);
        int bob = Integer.parseInt(firstA[1]);
        int years = 0;
        while(lim < bob || lim == bob) {
            lim *= 3;
            bob *= 2;
            years++;
        }
        System.out.println(years);
    }
}