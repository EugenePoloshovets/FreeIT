package homeWork2;
/*
Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.
 */

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = in.nextInt();
        if (number <= 999 && number >= 100) {
            System.out.println("Вы ввели трёхзначное число");
        } else {
            System.out.println("Вы ввели не трёхзначное число");
        }
        if (number % 10 == 7) {
            System.out.println("Число оканчивается на цифру 7");
        } else {
            System.out.println("Число не оканчивается на цифру 7");
        }
        if (number % 2 == 0) {
            System.out.println("Вы ввели чётное число");
        } else {
            System.out.println("Вы ввели нечётное число");
        }
    }
}
