import java.util.Scanner;
class Scan
{
      public static void main(String[]args)
{
    Scanner kb = new Scanner(System.in);
int age;
System.out.print("enter your age:");
age = kb.nextInt();
System.out.println("your age is:"+age);
}
}