package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }

      String regex = "[^0-9]";
      String phone = input.replaceAll(regex, "");
      int countDigit = 0;
      for (int i = 0; i < input.length(); i++) {
        char symbol = input.charAt(i);
        if (Character.isDigit(symbol)) {
          countDigit++;
        }
        }

        if (countDigit < 10 || countDigit > 11) {
        System.out.println("Неверный формат номера");
        break;
        }

        else if (phone.charAt(0) == '8') {
          String phone2 = phone.replaceFirst("8", "7");
          System.out.println(phone2);
          break;
        }

        else if (countDigit == 10) {
        String phone3 = phone.replaceFirst("", "7");
        System.out.println(phone3);
        break;
        }

        else if (phone.charAt(0) != '7') {
          System.out.println("Неверный формат номера");
          break;
        }

        else {
        System.out.println(phone);
        }
    }
  }
}

