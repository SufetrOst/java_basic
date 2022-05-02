import java.util.Arrays;
import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int x = 5;
        final int y = 7;
        final int z = 10;
        int leng = in.nextInt();
        int[] mass = new int[leng];
        for(int i=0;i<leng;i++){
            mass[i] = in.nextInt();
        }
        for(int i=0;i<leng;i++){
            switch (mass[i]){
                case x:
                case y:
                case z:
                    System.out.println("Данное значение имеется в константах");
                    break;

            }
        }
    }
}
