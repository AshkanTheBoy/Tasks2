package Tasks2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // общее кол-во секунд
        int inputSeconds = Integer.parseInt(scanner.nextLine());
        // кол-во секунд
        int seconds = inputSeconds-inputSeconds/60*60;
        // общее кол-во минут
        int minutes = (inputSeconds-seconds)/60;
        // общее кол-во часов
        int hours = minutes/60;
        // нормализуем минуты
        minutes -= hours*60;
        //общее кол-во дней
        int days = hours/24;
        //нормализуем часы
        hours -= days*24;
        System.out.println(days+" days "+hours+" hours "+minutes+" minutes "+seconds+" seconds");

    }
}
