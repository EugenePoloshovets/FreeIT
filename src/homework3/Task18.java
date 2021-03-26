package homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
18) Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
 */
public class Task18 {
    public static void main(String[] args) {

        String text = "Знаки препинания : точка. вопросительный знак? восклицательный знак! многоточие… запятая, точка с запятой; двоеточие: тире\\- круглые скобки() двойные кавычки \"\"";
        System.out.println(text);
        Pattern pattern = Pattern.compile("[:.?!,;\\-()\"…]");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("В строке " + count + " знаков препинания ");
    }
}
