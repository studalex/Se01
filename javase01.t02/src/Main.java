import java.text.ParseException;
import java.util.Scanner;
import static java.lang.System.*;

public class Main {

    public static void main(String... arg) {
        Scanner scanner = new Scanner(in);
        int valueN=0;

        out.print("Введите число элементов n: ");
        boolean noError=false;
        do {
            try {
                valueN = Integer.parseInt(scanner.next());
                noError = true;
            } catch (Exception exeption) {
                out.print("Это не число, попробуйте снова: ");
                noError=false;
            }
        }while(!noError);
        out.println("Вы ввели число: " + valueN);

        out.print("Введите ограничение E = : ");
        double Eps =0;
        do {
            try {
                Eps = Double.parseDouble(scanner.next());
                noError = true;
            } catch (Exception exeption) {
                out.println("Это не число, попробуйте снова: ");
                noError=false;
            }
        }while(!noError);
        out.println("Вы ввели ограничение E: " + Eps);

        int minimumNumber = -1;
        for (int i = 1; i < valueN + 1; i++) {
            out.println("Функция при i =  " + i + " возвращает: " + ReturnAn(i));
            if (minimumNumber == -1 && ReturnAn(i) < Eps) minimumNumber = i;
        }

        if (minimumNumber == -1) {
            out.println("Нет элементов, удовлетворяющих ограничению < " + Eps);
        } else {
            out.print("Самый маленький номер последовательности  удовлетворяющий условию < " + Eps);
            out.println(" равен : A(" + minimumNumber + ")= " + ReturnAn(minimumNumber));
        }
        scanner.close();
    }

    private static double ReturnAn(int n) {
        return  (1 / Math.pow((double) (1 + n), 2.0));
    }
}
