import java.util.Arrays;
import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int summ = 0;
        for (int i = 1; i <= n; i=i+2) {
            summ=summ+i;
        }
        System.out.println(summ);
    }
}