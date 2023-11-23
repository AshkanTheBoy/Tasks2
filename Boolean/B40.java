package Boolean;

import java.util.Arrays;
import java.util.Scanner;

public class B40 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            //Строим "доску"
            String[][] X = new String[8][8];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    X[i][j] = "|_|";
                }
                System.out.println(Arrays.toString(X[i]));
            }
            //Вводим начальные координаты фигуры
            boolean turn;
            int positionX1, positionY1, positionX2, positionY2 = 0;
            do {
                System.out.println("Введите X начальной позиции");
                positionX1 = Integer.parseInt(scanner.nextLine());
            } while (positionX1 < 1 && positionX1 > 8);
            do {
                System.out.println("Введите Y начальной позиции");
                positionY1 = Integer.parseInt(scanner.nextLine());
            } while (positionY1 < 1 && positionY1 > 8);

            //Помечаем фигуру на доске
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    X[i][j] = "|_|";
                }
                X[8-positionY1][positionX1-1] = "|K|";
                System.out.println(Arrays.toString(X[i]));
            }

            //Вводим конечные координаты фигуры
            do {
                System.out.println("Введите X конечной позиции");
                positionX2 = Integer.parseInt(scanner.nextLine());
            } while (positionX2 < 1 && positionX2 > 8);
            do {
                System.out.println("Введите Y конечной позиции");
                positionY2 = Integer.parseInt(scanner.nextLine());
            } while (positionY2 < 1 && positionY2 > 8);


            //Помечаем фигуру на доске
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    X[i][j] = "|_|";
                }
                X[8-positionY2][positionX2-1] = "|K|";
                System.out.println(Arrays.toString(X[i]));
            }

            //Конь 1/2 2/1
            //Проверяем корректность хода
            turn = Math.abs(positionX2-positionX1) == 2 && Math.abs(positionY2-positionY1) == 1 || Math.abs(positionX2-positionX1) == 1 && Math.abs(positionY2-positionY1) == 2;
            if (turn) {
                System.out.println("Ход корректный");
            } else {
                System.out.println("Невозможный ход");
            }

            //Предлагаем переиграть
            System.out.println("Продолжить? (y,Y/n,N)");
            String doWeQuit = scanner.nextLine();
            while (!doWeQuit.equals("n")  && !doWeQuit.equals("N") && !doWeQuit.equals("y") && !doWeQuit.equals("Y")) {
                System.out.println("Неверная команда\nВведите 'y' или 'Y', если хотите продолжить игру\nВведите 'n' или 'N', если хотите выйти");
                doWeQuit = scanner.nextLine();
            }
            if (doWeQuit.equals("n")||doWeQuit.equals("N")) {
                break;
            }
        }






    }
}
