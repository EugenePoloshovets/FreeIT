package HomeWork1;

/*
Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n.
 */

public class Task4 {
    public static void main(String[] args) {
        int number = 9501;
        int reverseNumber = 0;

        while (number != 0){
            reverseNumber += number % 10;
            number /= 10;
                if (number != 0) {
                    reverseNumber *= 10;
                }
        }
        System.out.println(reverseNumber);
    }
}
