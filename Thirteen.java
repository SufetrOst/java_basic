import java.util.Scanner;
public class Thirteen {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String a = "I love java 8 Я люблю java 14 core1"; //in.nextLine()
        //1. Выведите слова, состоящие только из латиницы.
            String[] result = a.split(" ");
            int j = 0;//кол-во англ. слов
            for(int i=0;i<result.length;i++){
                if (result[i].matches("[a-zA-Z]+")){
                    j++;
                }
            }
        System.out.println(j);
    }

}
