package homework3;

import java.util.StringTokenizer;

/*
19) Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть,
что слова могут разделяться несколькими пробелами, в начале и конце текста также могут быть
пробелы, но могут и отсутствовать.
 */
public class Task19 {
    public static void main(String[] args) {

        String text = "Программы на Java транслируются в байт - код Java, выполняемый виртуальной машиной Java (JVM)";
        StringTokenizer stringTokenizer = new StringTokenizer(text, " :.?!,;\\-()\"…{}");
        int count = 0;
        while (stringTokenizer.hasMoreTokens()) {
            count++;
            System.out.println(stringTokenizer.nextToken());
        }
        System.out.println("Кол-во слов в тексте: " + count);
    }
}
