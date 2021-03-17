package homework2;

/*
 12) Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class Task12 {

    public static void main(String[] args) {

        int number = (int) (Math.random() * 100);
        System.out.println(number);
        int summ = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0) {
                summ += i;
            }
        }
        System.out.println("Сумма чисел = " + summ);
    }
}
