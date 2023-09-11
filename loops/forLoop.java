import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n;
        System.out.println("enter a number");
        n = kb.nextInt();
        int fact;//fact =1; down for can be removed
        for ( fact=1;n > 1; n--)
        //for(;;)
        {
            //if(n<=1)
            //break;
            fact = fact * n;
            //n--

        }
        System.out.println("fact is:" + fact);
    }
}
