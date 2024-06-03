package Homework2;
public class Exercise1 {
    public static void main(String[] args) {
       String cardNumber = "1234 5678 9012 3456";
        // Удаляем пробелы из строки
      String notSpaceCardNumber = cardNumber.replaceAll("\\s", "");

      // Заменяем все символы до последних четырех на звездочки
     String maskedCardNumber = "************" + notSpaceCardNumber.substring(notSpaceCardNumber.length() - 4);

        // Выводим результат
    System.out.println(maskedCardNumber);
   }
}






