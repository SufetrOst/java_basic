import java.util.Arrays;
import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leng = in.nextInt();
        double[] mass = new double[leng];
        double summ = 0;
        for (int i = 0; i < leng; i++) {
            mass[i] = in.nextInt();
            summ=summ + mass[i];
        }
        double average = summ / leng;
        for (int i = 0; i < leng; i++) {
            System.out.println(mass[i]*average);
        }
    }
}