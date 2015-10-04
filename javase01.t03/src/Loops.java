import java.util.Scanner;
import static java.lang.System.*;

public class Loops {
    public static void main(String... arg) {
        Scanner scanner = new Scanner(System.in);

        out.print("Введите начало отрезка a: ");
        double pointA = 0;
        boolean noError = false;
        do {
            try {
                pointA = Double.parseDouble(scanner.next());
                noError = true;
            } catch (Exception exeption) {
                out.print("Это не число, попробуйте снова: ");
                noError = false;
            }
        } while (!noError);

        out.println("Введите конец отрезка b: ");
        double pointB = 0;
        do {
            try {
                pointB = Double.parseDouble(scanner.next());
                noError = true;
            } catch (Exception exeption) {
                out.println("Это не число, попробуйте снова: ");
                noError = false;
            }
        } while (!noError);

        out.print("Введите шаг h: ");
        double stepH = 0;
        do {
            try {
                stepH = Double.parseDouble(scanner.next());
                noError = true;
            } catch (Exception exeption) {
                out.println("Это не число, попробуйте снова: ");
                noError = false;
            }
        } while (!noError);

        if (pointA > pointB) {
            double temp = pointA;
            pointA = pointB;
            pointB = temp;
        }

        for (double x = pointA; x <= pointB; x += stepH) {
            out.println(x + " | " + Function(x));
        }
        scanner.close();
    }

    private static double Function(double x) {
        return (Math.tan(2 * x) - 3);
    }
}
