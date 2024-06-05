import java.util.Scanner;

public class _6_prime_number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a  number: ");
    int num = sc.nextInt();
    int count=0;
    for (int i = 2; i <= num; i++) {
      if (num % i == 0) {
        count=count + 1 ;
      }
    }
    if(count==2){
      System.out.println("Prime Number");
    }
    else{
      System.out.println(" Not prime number");
    }
    System.out.println(count);

  }
}
