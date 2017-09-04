import java.util.Scanner;

/**
 * Created by Artemka on 04.09.2017.
 */
public class RoundNumbers {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double value;
        int decimalSize;

        System.out.println("Введите число для округления");
        value = readDoubleValueFromConsole();
        System.out.println("Введите количество знаков после запятой");
        decimalSize = readIntValueFromConsole();
        System.out.println("Результат округления: " + roundNumber(value, decimalSize));
    }

    //Метод округления числа
    public static double roundNumber(double value, int decimalSize) {
        return Math.round(value * Math.pow(10, decimalSize)) / Math.pow(10, decimalSize);
    }

    // Метод считывания double с консоли
    public static double readDoubleValueFromConsole(){
        while (!scanner.hasNextDouble()){
            System.out.println("Вы неверно ввели число , попробуйте еще раз...");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    // Метод считывания int с консоли
    public static int readIntValueFromConsole(){
        while (!scanner.hasNextInt()){
            System.out.println("Вы неверно ввели число , попробуйте еще раз...");
            scanner.next();
        }
        return scanner.nextInt();
    }


}
