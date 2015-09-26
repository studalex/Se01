import java.util.Scanner;
import static java.lang.System.*;

public class Massive2 {

    public static void main(String... arg) {
        Scanner scanner = new Scanner(System.in);
        int sizeMas = 0;
        int[][] xMatrix;

        out.println("Enter matrix size: ");
        boolean noError = false;
        do {
            try {
                sizeMas = Math.abs(Integer.parseInt(scanner.next()));
                noError = true;
            } catch (Exception exeption) {
                out.println("Is not a number, try again: ");
                noError = false;
            }
        } while (!noError);

        xMatrix = new int[sizeMas][sizeMas];

        for (int i = 0; i < sizeMas; i++) {
            for (int j = 0; j < sizeMas; j++) {
                if (i == j || j == sizeMas - i - 1) {
                    xMatrix[i][j] = 1;
                } else {
                    xMatrix[i][j] = 0;
                }
                out.print(xMatrix[i][j] + " ");
            }
            out.println();
        }
    }
}
