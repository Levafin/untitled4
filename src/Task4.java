import java.io.PrintStream;
import java.util.Scanner;

public class Task4 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    //Даны три вещественных числа a, b, c. Проверить:
    //1. выполняется ли неравенство a < b < c;
    //2. выполняется ли неравенство b > a > c.
    public static void main(String[] args) {
        System.out.println("Введите 3 числа по увеличению или убыванию друг за другом, для проверки неравенства: ");
        double a;
        double b;
        double c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (a > b && b > c)
            System.out.println("a > b > c");
        else if (a < b && b < c)
            System.out.println("a < b < c");
            
    }

}
