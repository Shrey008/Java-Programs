 import java.util.Scanner;
class Sum
{
   public static void main(String[]args)
{
    Scanner kb = new Scanner(System.in);
    int a,b,c;
    System.out.println("enter first number");
    a = kb.nextInt();
    System.out.println("enter second number");
    b =kb.nextInt();

    c = a + b;

    

    System.out.println("sum is:"+c);
      
}
}