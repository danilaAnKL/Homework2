package Homework2;
import java.util.Scanner;
public class Exercise1Scanner {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Запрашиваем ввод номера карты
            System.out.print("Введите номер карты: ");
            String cardNumber = scanner.nextLine();

            // Удаляем пробелы из строки
            String notSpaceCardNumber = cardNumber.replaceAll("\\s", "");

            // Заменяем все символы до последних четырех на звездочки
            String maskedCardNumber = "************" + notSpaceCardNumber.substring(notSpaceCardNumber.length() - 4);

            // Выводим результат
            System.out.println(maskedCardNumber);

            // Закрываем сканнер
            scanner.close();
        }
    }

