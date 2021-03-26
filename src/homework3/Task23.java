package homework3;

/*
23)Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
которых есть параметры, например <p id=”p1”>, и замену их на простые теги абзацев <p>.
 */
public class Task23 {
    public static void main(String[] args) {
        String text = "<p id=”p1”> Сочинитель бедный, это ты ли </p>\n" +
                "</p id=”p22”> Сочиняешь песни о луне? </p>\n" +
                "</p id=”main”> Уж давно глаза мои остыли </p>\n" +
                "</p> На любви, на картах и вине. </p>\n" +
                "<div> Автор: Есенин С. А. <div>";
        System.out.println(text);
        System.out.println(text.replaceAll("</?p( id=”p[1-9]+”)?>|</?div>|</?p( id=”[a-z]+”)?>", "<p>"));
    }
}
