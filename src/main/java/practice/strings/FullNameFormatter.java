package practice.strings;

import java.util.Scanner;

public class FullNameFormatter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }

      int spaceCount = 0;
      for (int i = 0; i < input.length(); i++) {
        char symbol = input.charAt(i);
        if (symbol == ' ') {
          spaceCount++;
        } else if (Character.isDigit(symbol)) {
          break;
        }
      }

      if (spaceCount == 2 || input.equals(Character.UnicodeBlock.CYRILLIC)) {
        System.out.println(getFullName(input));
      } else {
        System.out.println("Введенная строка не является ФИО");
        break;
      }
    }
  }

  public static String getFullName (String fullName) {
    int one = fullName.indexOf(' ');
    int two = fullName.lastIndexOf(' ');
    String familyName = fullName.substring(0, one);
    String name = fullName.substring(one, two).trim();
    String surname = fullName.substring(two).trim();
    return "Фамилия: " + familyName + "\n" + "Имя: " + name + "\n" + "Отчество: " + surname + "\n";
  }
}