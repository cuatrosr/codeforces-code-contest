import java.util.Scanner;

public class Apo2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        int m = 1;

        String txt = sc.nextLine();
        for(int i = 1; i < n; i++){
            String txt2 = sc.nextLine();
            if(!txt.equals(txt2)){
                m += 1;
            }
            txt = txt2;
        }
        System.out.println(m);
    }
}