import java.util.Random;
import java.util.Scanner;
public class Fourteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int[] result = new int[15];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(-20, 20);
            System.out.println(result[i]);
        }

        int maxNum = 0;
        for (int j : result) {
            if (j > maxNum)
                maxNum = j;
        }
        System.out.println("Max number in array: " + maxNum);
        int minNum = 0;
        for (int k : result) {
            if (k < minNum)
                minNum = k;
        }
        System.out.println("Min number in array: " + minNum);
        if (Math.abs(maxNum)>Math.abs(minNum)){
            System.out.println("Max number by abs: " + Math.abs(maxNum));}
        else {
            System.out.println("Max number by abs: " + Math.abs(minNum));}
        }
}


