import java.util.Scanner;
class Stringscanner
{
 public static void main (String[]args)
{
   Scanner kb = new Scanner (System.in);
   String name;
   System.out.println("what is your name");
   name = kb.nextLine();
   System.out.println("good evening"+ name);
}
}