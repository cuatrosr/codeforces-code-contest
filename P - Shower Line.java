import java.util.Scanner;

public class Apo2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String txt = sc.nextLine();
        String txt2 = sc.nextLine();
        String txt3 = sc.nextLine();
        String txt4 = sc.nextLine();
        String txt5=  sc.nextLine();

        String[][] matrix = new String[5][5];
        matrix[0] = txt.split(" ");
        matrix[1] = txt2.split(" ");
        matrix[2] = txt3.split(" ");
        matrix[3] = txt4.split(" ");
        matrix[4] = txt5.split(" ");

        int maxSum = 0;

        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 5; b++) {
                for (int c = 0; c < 5; c++) {
                    for (int d = 0; d < 5; d++) {
                        for (int e = 0; e < 5; e++) {
                            int efiencicy = getEficiency(matrix, a, b, c, d, e);
                            if (efiencicy > maxSum && (a != b && a != c && a != d && a != e) && (b != c && b != d && b != e) && (c != d && c != e) && (d != e)) {
                                maxSum = efiencicy;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(maxSum);
    }

    public static int getEficiency(String[][] matrix, int first, int second, int third, int fourt, int fifth) {
        int eficiency = 0;
        eficiency += Integer.parseInt(matrix[first][second])
                + Integer.parseInt(matrix[second][first]) + Integer.parseInt(matrix[third][fourt]) + Integer.parseInt(matrix[fourt][third])
                + Integer.parseInt(matrix[second][third]) + Integer.parseInt(matrix[third][second]) + Integer.parseInt(matrix[fourt][fifth]) + Integer.parseInt(matrix[fifth][fourt])
                + Integer.parseInt(matrix[third][fourt]) + Integer.parseInt(matrix[fourt][third]) + Integer.parseInt(matrix[fourt][fifth]) + Integer.parseInt(matrix[fifth][fourt]);
        return eficiency;
    }
}