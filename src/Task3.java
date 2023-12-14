import java.util.Scanner;

public class Task3 {

    //Дано двузначное число. Определить: остаток от деления десятков на единицы,
    //результат деления единиц на десятки.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int m = number / 10; //кол-во десятков
        int c = number - m * 10; //количество единиц

        System.out.println("Количество десятков: " + m);
        System.out.println("Количество единиц: " + c);
    }
}
