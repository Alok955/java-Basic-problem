import java.util.Scanner;
public class _4_largest_Of_Three_Number {
  public static void main(String args[]) {
    while (true) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter three number");
      System.out.print("num1:");
      int num1 = input.nextInt();
      System.out.print("num2:");
      int num2 = input.nextInt();
      System.out.print("num3:");
      int num3 = input.nextInt();
      System.out.println("num1:" + num1 + "  " + "num2:" + num2 + "  " + "num3:" + num3);
      if (num1 > num2 && num1 > num3) {
        System.out.println("Largest Number:" + num1);
      } else if (num2 > num1 && num2 > num3) {
        System.out.println("Largest Number:" + num2);
      } else {
        System.out.println("Largest Number:" + num3);
      }
      System.out.println();
    }
  }
}
