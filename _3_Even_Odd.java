import java.util.Scanner;

public class _3_Even_Odd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number:");

    int num = sc.nextInt();

    if (num % 2 == 0) {
      System.out.println("num is even: " + num);
    } else {
      System.out.println("num is odd:" + num);
    }

  }

}
