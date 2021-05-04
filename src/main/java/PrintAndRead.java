import java.util.Scanner;

public class PrintAndRead {
    public static void main(String[] args) {
        int number1 = printAndRead("Введите число 1:");
        int number2 = printAndRead("Введите число 2:");
        int number3 = printAndRead("Введите число 3:");
        int number4 = printAndRead("Введите число 4:");

        Scanner scanner = new Scanner(System.in);

        int number5 = printAndRead("Введите число 5:", scanner);

        String name = printAndRead(scanner);

        String message = "Вы вводили : " + number1 + ", " + number2 + ", " +
                number3 + ", " + number4 + ", " + number5 + ", " + name + ".";
        System.out.println(message);
    }

    private static String printAndRead(Scanner scanner) {
        System.out.println("Введите ваше имя:");
        return scanner.next();
    }

    private static int printAndRead(String inputMessage, Scanner scanner) {
        System.out.println(inputMessage);
        return scanner.nextInt();
    }

    private static int printAndRead(String inputMessage) {
        System.out.println(inputMessage);

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}