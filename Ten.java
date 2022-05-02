import java.util.Arrays;
import java.util.Scanner;
public class Ten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leng = in.nextInt();
        int[][] mass = new int[leng][leng];
        for (int i = 0; i < leng; i++) {
            for (int j = 0; j < leng; j++) {
                mass[i][j] = in.nextInt();
            }
        }
        for (int j = 0; j < leng; j++){
            System.out.println(mass[0][j] * 3);
        }
    }
}
