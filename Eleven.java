import java.util.Scanner;
public class Eleven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        int b = in.nextInt();
        int a1 = Integer.parseInt(a);
        System.out.println(Math.max(a1,b));
        double a2 = a1;
        double b1 = b;
        System.out.println(Math.min(a2,b1));
        }
    }

