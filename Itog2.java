import java.util.Scanner;
public class Itog2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "x-5=3"; //in.nextLine()
        String[] mass = a.split("");
        // если вычитание
        if(mass[1] == "-") {
            if (mass[0] == "x") {
                System.out.println(Integer.parseInt(mass[2]) + Integer.parseInt(mass[4]));
            }
            else if (mass[2] == "x") {
                System.out.println(Integer.parseInt(mass[0]) - Integer.parseInt(mass[4]));
            }
            else if (mass[4] == "x"){
                System.out.println(Integer.parseInt(mass[0]) - Integer.parseInt(mass[2]));
            }
        }
        //если сложение
            else if(mass[1] == "+") {
            if (mass[0] == "x") {
                System.out.println(Integer.parseInt(mass[4]) - Integer.parseInt(mass[2]));
            }
            else if (mass[2] == "x") {
                System.out.println(Integer.parseInt(mass[4]) - Integer.parseInt(mass[0]));
            }
            else if (mass[4] == "x"){
                System.out.println(Integer.parseInt(mass[0]) + Integer.parseInt(mass[2]));
            }
        }
        }
    }