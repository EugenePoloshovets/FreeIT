package homework1;
/*
Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?
 */

public class Task5 {
    public static void main(String[] args) {
        int number = 1234;
        int a = number / 1000 % 10;
        int b = number / 100 % 10;
        int c = number /10 % 10;
        int d = number % 10;
        if ( a != b && a != c && a != d && b != c && b != d && c != d){
            System.out.println("Все числа различны");
        } else {
            System.out.println("Есть одинаковые числа");
        }
    }
}
