package homework2;

import java.util.Random;

/*
8) Имеется цело число (задать с помощью Random rand = new Random();int x =rand.nextInt()  ).
Это число – количесво денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.
 */
public class Task8 {

    public static void main(String[] args) {

        Random random = new Random();
        int rubles = random.nextInt(999);

        if (rubles / 10 % 10 == 1) {
            System.out.println(rubles + " рублей");
        } else if (rubles % 10 == 1) {
            System.out.println(rubles + " рубль");
        } else if (rubles % 10 == 2 || rubles % 10 == 3 || rubles % 10 == 4) {
            System.out.println(rubles + " рубля");
        } else {
            System.out.println(rubles + " рублей");
        }
    }
}

