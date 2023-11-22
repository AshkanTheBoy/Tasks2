package Tasks2;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String number = scanner.nextLine();
        int sum = 0;
        int num = Integer.parseInt(number);
        /*
        суммируем каждую цифру и убираем ее из начального числа,
        пока это число не станет меньше, чем его частное на 10 в степени длины этого числа
        */
        while (num>num/Math.pow(10,number.length())) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Сумма всех цифр в числе: "+sum);
    }
}
