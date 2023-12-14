import java.util.Scanner;

public class Task5 {

    //Даны два числа. Если квадратный корень из второго числа меньше первого числа,
    // то увеличить второе число в пять раз.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа, чтобы квадратный корень второго числа был меньше первого:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (Math.sqrt(b) > Math.sqrt(a)) {
            b *= 5;
        }

        System.out.println("второе число - " + b);
    }
}