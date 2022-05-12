package practice.strings;

public class TotalEarningsCalculator {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    System.out.println(getMoney(text));

    //TODO: напишите ваш код, результат вывести в консоль
  }

  public static String getMoney (String money) {
  String charsetStr1 = "5000";
  int start1 = money.indexOf(charsetStr1);
  int end1 = money.indexOf(" руб",start1);
  String charsetStr2 = "7563";
  int start2 = money.indexOf(charsetStr2);
  int end2 = money.indexOf(" руб",start2);
  String charsetStr3 = "30000";
  int start3 = money.indexOf(charsetStr3);
  int end3 = money.indexOf(" руб",start3);
  String encoding1 = money.substring(start1,end1);
  String encoding2 = money.substring(start2,end2);
  String encoding3 = money.substring(start3,end3);
  int count1 = Integer.parseInt(encoding1);
  int count2 = Integer.parseInt(encoding2);
  int count3 = Integer.parseInt(encoding3);
  int sum = count1 + count2 + count3;
    return String.valueOf(sum);
  }

}