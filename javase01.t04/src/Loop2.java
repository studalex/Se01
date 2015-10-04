import java.util.Scanner;
import static java.lang.System.*;

public class Loop2 {
    public static void main(String... arg) {
        Scanner scanner = new Scanner(System.in);
        int[] masNumber;
        int[] sumNumber;
        int maxSum = Integer.MIN_VALUE;

        out.print("Введите последовательность действительных чисел через пробел: ");
        String str = "";
        str = scanner.nextLine();

        String[] masStr = str.split(" ");
        masNumber = new int[masStr.length];
        sumNumber = new int[masStr.length];

        for (int i = 0; i < masStr.length; i++) {
            masNumber[i] = Integer.parseInt(masStr[i]);
        }

        for (int i = 0; i < masNumber.length; i++) {
            sumNumber[i] = masNumber[i] + masNumber[masNumber.length - i - 1];
            out.println(masNumber[i] + " + " + masNumber[masNumber.length - i - 1] + " = " + sumNumber[i]);
            if (maxSum < sumNumber[i]) {
                maxSum = sumNumber[i];
            }
        }

        out.println("Максимальная сумма = " + maxSum);
        scanner.close();
    }
}
