package homework2;

/*
 13) Создать последовательность случайных чисел, найти и вывести наибольшее из них.
 */
public class Task13 {

    public static void main(String[] args) {

        int array[] = {42, 0, 8, 7, 24, 47, 35};
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("Максимальное число: " + maxValue);
    }
}
