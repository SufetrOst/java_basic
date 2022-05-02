import java.util.Locale;
import java.util.Scanner;
public class Twelve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "I like Java!!!"; //in.nextLine()
        //1. Проверить, содержит ли строка подстроку “Java”
        boolean result1 = a.contains("Java");
        //1. Проверить, содержит ли строка подстроку “Java”
        System.out.println(result1);
        //2. Проверить, начинается ли строка с подстроки “I like”
        boolean result2 = a.startsWith("I like");
        System.out.println(result2);
        //3. Проверить, заканчивается ли строка с подставки “!!!”
        boolean result3 = a.endsWith("!!!");
        System.out.println(result3);
        //4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        if (result1 & result2 & result3){
            System.out.println(a.toUpperCase());
        }
        //5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
        String result5 = a.replace("a","o");
        System.out.println(result5.substring(7,11));
    }

}
