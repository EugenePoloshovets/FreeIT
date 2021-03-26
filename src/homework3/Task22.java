package homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
22)Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записаных по правилам Java, с помощью регулярных выражений и вывести их на страницу
 */
public class Task22 {
    public static void main(String[] args) {
        String str = "Поиск чисел 0x1B 0xA59B в тексте 0x5F3, и тут 0xFF!";
        Pattern pattern = Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher matcher = pattern.matcher(str);
        System.out.println(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
