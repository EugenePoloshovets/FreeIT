package homeWork2;

/*
 15) Создать массив, заполнить его случайными элементами, распечатать, перевернуть,
 и снова распечатать (при переворачивании нежелательно создавать еще один массив)
 */
public class Task15 {

    public static void main(String[] args) {
        int size = (int) (Math.random() * 10);
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = (array.length - 1); i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
