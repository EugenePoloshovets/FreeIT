package homework2;

/*
 14) Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера.
 */
public class Task14 {

    public static void main(String[] args) {

        int size = (int) (Math.random() * 20);
        System.out.println("Длина массива: " + size);
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200);
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
    }
}
