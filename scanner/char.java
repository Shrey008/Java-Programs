import java.util.Scanner;
class Char{
 public static void main(String[]args)
{
   Scanner kb = new Scanner(System.in);
   String str;   
char ch;
   System.out.println("enter a character");
   str = kb.next();
   ch = str.charAt(0);
   System.out.println("you entered:"+ch);
   
}
}