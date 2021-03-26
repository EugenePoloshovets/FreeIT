package homework3;

import java.util.StringTokenizer;

/*
20)Имеется строка с текстом.Вывести текст,составленный из последних букв всех слов.
 */
public class Task20 {
    public static void main(String[] args) {

        String text = "Конструктор - это специальный метод, который обязательно вызывается при создании нового объекта.";
        System.out.println(text);
        StringTokenizer stringTokenizer = new StringTokenizer(text, " :.?!,;\\-()\"…{}");
        StringBuilder result = new StringBuilder();
        while (stringTokenizer.hasMoreTokens()) {
            String word = stringTokenizer.nextToken();
            char charLast = word.charAt(word.length() - 1);
            result.append(charLast);
        }
        System.out.println(result);
    }
}
