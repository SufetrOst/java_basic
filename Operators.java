import java.util.Arrays;
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        float average = (x+y+z)/3;
        int averageInt = (x+y+z)/3;
        System.out.println(averageInt);
        float halfAverage = averageInt/2;
        System.out.println(halfAverage);
        if (halfAverage > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
