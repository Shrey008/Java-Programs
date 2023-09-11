import java.util.Scanner;

public class Factorial {

public static void main(String[]args)
{
    Scanner kb = new Scanner(System.in);
    int n,fact=1;
    System.out.println("enter a number");
    n = kb.nextInt();
    while(n>1)
    {
        fact = fact*n;
        n--;

    }
    System.out.println("fact is"+ fact);
}
}
