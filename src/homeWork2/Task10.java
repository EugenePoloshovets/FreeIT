package homeWork2;

/*
10) Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */
public class Task10 {

    public static void main(String[] args) {

        int minValue = 10;
        int maxvalue = 15;
        int random = (int) ((Math.random() * ((maxvalue - minValue) + 1)) + minValue);
        int factorial = 1;
        for (int i = 1; i <= random; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + random + "! = " + factorial);
    }
}
