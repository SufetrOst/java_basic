import java.util.Scanner;
import java.util.Arrays;
public class Itog3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n = in.nextInt();
        String[] str = new String[n];
        int [] k = new int[n];
        System.out.println("Введите строки: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = in.nextLine();
        }
        for(int i = 0; i < str.length; i++){
            for (int j=0; j<str[i].length();j++){
              String[] arr = str[i].split("");
              if(arr[j]!=arr[j+1]){// тут так и не понял как перебрать элемент с остальными
                  k[i]++;
              }
                Arrays.sort(k);

                System.out.println("intArray after sorting: " + Arrays.toString(k));

                int maxNum = k[k.length - 1];
                System.out.println("Maximum number = " + maxNum);
            }
    }
}
}
