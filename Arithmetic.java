import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextInt();
        float y = in.nextInt();
        String symbol = in.next();
        switch (symbol){
            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            case "/":
                System.out.println(x/y);
                break;
        }
    }
}