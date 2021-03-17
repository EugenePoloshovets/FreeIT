package homeWork2;

/*
7) Имеется прямоугольное отверстие размерами a и b, определить, можно ли
  его полностью закрыть круглой картонкой радиусом r.
 */

public class Task7 {

    public static void main(String[] args) {

        double radius = 2.5;
        double sideA = 3.0;
        double sideB = 4.0;
        double diagonal = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

        if (radius >= diagonal / 2) {
            System.out.println("Круг полностью закрывает прямоугольное отверстие");
        } else {
            System.out.println("Круг не закрывает полностью прямоугольное отверстие");
        }
    }
}
