package practice.regex;

import java.util.Scanner;

public class FullNameFormatterRegex {

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
    String[] words = fullName.split("\\s");
    for (int i = 0; i < words.length; i++) {
      return "Фамилия: " + words[0] + "\n" + "Имя: " + words[1] + "\n" + "Отчество: " + words[2] + "\n";
    }
    return fullName;
  }
}