package homeWork2;

/*
 11) Имеется целое число, определить является ли это число простым, т.е.
 делится без остатка только на 1 и себя.
 */
public class Task11 {

    public static void main(String[] args) {

        int number = (int) (Math.random() * 200);
        boolean isComposite = false;
        if (number <= 1) {
            System.out.println("Число " + number + " не является простым");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isComposite = true;
                    break;
                }
            }
            if (isComposite) {
                System.out.println("Число " + number + " не является простым");
            } else {
                System.out.println("Число " + number + " является простым");
            }
        }
    }
}
