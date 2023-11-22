package Tasks2;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // цикл для повторения программы
        while (true) {
            System.out.println("Введите число для проверки (введите \"q\", \"quit\" или \"end\" для завершения)");
            String input = scanner.nextLine();
            // команды для завершения программы
            if (input.equals("q") || input.equals("quit") || input.equals("end")) {
                break;
            } else {
                /*
                если команды для завершения не было, то тип команды преобразовывается в
                вещественное число и проверяется
                */

                double number = Double.parseDouble(input);
                if (number%1 == 0) {
                    System.out.println(input+" - целое число\n");
                } else {
                    System.out.println(input+" - вещественное число\n");
                }
            }
        }
    }
}