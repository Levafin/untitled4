import java.util.Scanner;

public class Task1 {

    //1. В чемпионате по футболу команде за выигрыш дается 3 очка, за проигрыш — 0,
    //заничью — 1. Известно количество очков, полученных командой за игру.
    //Определить словесный результат игры (выигрыш, проигрыш или ничья).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите результат 0, 1 и 3");
        int point = sc.nextInt();
        sc.close();

        switch(point) {
            case 0: //point == 0
                System.out.println("проигрыш");
                break;
            case 1:
                System.out.println("ничья");
                break;
            case 3:
                System.out.println("выигрыш");
                break;
            default:
                System.out.println("Введен несуществующий порядковый номер");
                break;
        }
    }
}
