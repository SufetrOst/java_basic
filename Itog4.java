import java.util.Scanner;
public class Itog4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите ответ: ");
            String result = in.nextLine();
            if (result.contains("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            }
            else if (result.contains("Подсказка") & i == 0) {
                    System.out.println("Что-то про вирус");
                    System.out.println("Введите ответ: ");
                    result = in.nextLine();
                    i++;
                    if (result.contains("Заархивированный вирус")) {
                        System.out.println("Правильно!");
                        break;
                    } else {
                        System.out.println("Попробуй еще");
                    }
                } else if (result.contains("Подсказка") & i > 0) {
                    System.out.println("Подсказок больше нет");
                    System.out.println("Введите ответ: ");
                    result = in.nextLine();
                } else {
                    System.out.println("Попробуй еще");
                }
            }
        }
    }
