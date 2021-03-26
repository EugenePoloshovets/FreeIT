package homework3;

/*
21)Напишите три цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
 другой с помощью StringBuilder и метода append, а также аналогино для StringBuffer.
 Сравните скорость их выполнения.
 */
public class Task21 {
    public static void main(String[] args) {

        int iter = 40000;
        String string = "";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iter; i++) {
            string += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения через оператор сложения: " + (endTime - startTime) + " ms");

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < iter; i++) {
            stringBuilder.append(i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Время выполнения через StringBuilder: " + (endTime1 - startTime1) + " ms");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < iter; i++) {
            stringBuffer.append(i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Время выполнения через StringBuffer: " + (endTime2 - startTime2) + " ms");
    }
}
