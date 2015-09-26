import java.text.ParseException;
import java.util.Scanner;
import static java.lang.System.*;

public class Main {

    public static void main(String... arg) {
        Scanner scanner = new Scanner(in);
        int valueN=0;

        out.print("Enter the number of elements n: ");
        boolean noError=false;
        do {
            try {
                valueN = Integer.parseInt(scanner.next());
                noError = true;
            } catch (Exception exeption) {
                out.print("Is not a number, try again: ");
                noError=false;
            }
        }while(!noError);
        out.print("You have entered a number: " + valueN);

        out.print("Enter limit E = : ");
        double Eps =0;
        do {
            try {
                Eps = Double.parseDouble(scanner.next());
                noError = true;
            } catch (Exception exeption) {
                out.println("Is not a number, try again: ");
                noError=false;
            }
        }while(!noError);
        out.println("You have entered a limit E: " + Eps);

        int minimumNumber = -1;
        for (int i = 1; i < valueN + 1; i++) {
            out.println("Function and when the value =  " + i + " back: " + ReturnAn(i));
            if (minimumNumber == -1 && ReturnAn(i) < Eps) minimumNumber = i;
        }

        if (minimumNumber == -1) {
            out.println("No item meets the criterion < " + Eps);
        } else {
            out.print("The smallest number satisfying criterion < " + Eps);
            out.println(" equal: A(" + minimumNumber + ")= " + ReturnAn(minimumNumber));
        }
        scanner.close();
    }

    private static double ReturnAn(int n) {
        return  (1 / Math.pow((double) (1 + n), 2.0));
    }
}
