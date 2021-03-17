package homework2;

/*
9) Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа.
 */
public class Task9 {

    public static void main(String[] args) {

        double averageFactorial = 1;  // - изменил с 0 на 1
        // double sum = 0; - строка была в примере
        int n = 1;                    // - изменил с 0 на 1
        int x = (int) (Math.random() * 20);
        if (x == 0) {
            averageFactorial = 1;
        } else {
            while (n <= x) {              // - изменил условие
                averageFactorial *= n;
                n++;
                // x = (int) (Math.random() * 20); - строка была в примере
            }
        }
        System.out.println("Факториал числа " + x + " = " + (int) averageFactorial);
    }
}
