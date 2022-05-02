import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        switch (value) {
            case 1:
                System.out.println("Выберите единицу измерения: 1 - килограммы, 2 - тонна, 3 - карат");
                int mass = in.nextInt();
                System.out.println("Введите число:");
                float chislo = in.nextInt();
                switch (mass) {
                    case 1:
                        System.out.println("Килограммы: "+ chislo + "Тонны: "+ chislo/1000 + "Караты: "+ chislo*5000 );
                        break;
                    case 2:
                        System.out.println("Килограммы: "+chislo*1000 + "Тонны: "+ chislo + "Караты: "+ chislo*5000000 );
                        break;
                    case 3:
                        System.out.println("Килограммы: "+chislo/5000 + "Тонны: "+ chislo/5000000 + "Караты: "+ chislo);
                        break;
                }
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - километр, 3 - ярд, 4 - фут");
                int dist = in.nextInt();
                System.out.println("Введите число:");
                chislo = in.nextInt();
                switch (dist) {
                    case 1:
                        System.out.println("Метры: "+ chislo+ "Мили: "+ chislo*0.0006 + "Ярды: " + chislo*1.0936 + "Футы: " + chislo*3.28);
                        break;
                    case 2:
                        System.out.println("Метры: "+ chislo*1609+ "Мили: "+ chislo + "Ярды: " + chislo*1760 + "Футы: " + chislo*5279.9);
                        break;
                    case 3:
                        System.out.println("Метры: "+ chislo*0.914+ "Мили: "+ chislo*0.0005 + "Ярды: " + chislo + "Футы: " + chislo*3);
                        break;
                    case 4:
                        System.out.println("Метры: "+ chislo*0.3048+ "Мили: "+ chislo*0.00018 + "Ярды: " + chislo*0.33 + "Футы: " + chislo);
                        break;
                }

        }
    }
}