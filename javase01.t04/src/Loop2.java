import java.util.Scanner;
import static java.lang.System.*;

public class Loop2 {
    public static void main(String... arg)
    {
        Scanner scanner = new Scanner(System.in);
        int valueNumber=0;
        int[] masNumber;
        int maxSum=0;

        out.print("Enter N: ");

        boolean noError = false;
        do {
            try {
                valueNumber = Integer.parseInt(scanner.next());
                noError = true;
            } catch (Exception exeption) {
                out.println("Is not a number, try again: ");
                noError = false;
            }
        } while (!noError);

        if(valueNumber<0) valueNumber = Math.abs(valueNumber);

        masNumber = new int[valueNumber];

        for(int i=0; i<valueNumber; i++)
        {
            masNumber[i] = i+1 + (valueNumber*2-i);
            if(maxSum < masNumber[i])
            {
                maxSum = masNumber[i];
            }
            out.println("Sum A(" + (i + 1) + ") + A(" + (valueNumber * 2 - i) + ") =: " + masNumber[i]);
        }
        out.println("Maximum = " + maxSum);
        scanner.close();
    }
}
