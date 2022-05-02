import java.util.Scanner;
public class Itog1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter course of $: ");
        float kurs = in.nextFloat();
        System.out.println("Enter quantity of RUR: ");
        float ruble = in.nextFloat();
        System.out.printf("%.2f",ruble/kurs);
    }
}
