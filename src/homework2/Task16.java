package homework2;

/*
 16) * Определите сумму элементов одномерного массива, расположенных между
 минимальным и максимальным значениями.
 */
public class Task16 {

    public static void main(String[] args) {

        int array[] = new int[(int) (Math.random() * 10 + 1)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        int maxValue = array[0];
        int minValue = array[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxValue) {
                maxValue = array[i];
                indexMax = i;
            }
            if (array[i] <= minValue) {
                minValue = array[i];
                indexMin = i;
            }
        }
        System.out.println("Максисальное число: " + maxValue + " и его индекс " + indexMax);
        System.out.println("Минимальное число: " + minValue + " и его индекс " + indexMin);
        int summa = 0;
        if (indexMax == indexMin) {
            summa = 0;
        } else if (indexMax > indexMin) {
            for (int i = indexMin + 1; i < indexMax; i++) {
                summa += array[i];
            }
        } else {
            for (int i = indexMax + 1; i < indexMin; i++) {
                summa += array[i];
            }
        }
        System.out.println("Сумма элементов между max и min значениями = " + summa);
    }
}
