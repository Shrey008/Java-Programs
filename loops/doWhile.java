import java.util.Scanner;

public class doWhile {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String choice;

        do{
            System.out.println("enter two integers");
            int a = kb.nextInt();
            int b = kb.nextInt();
            System.out.println("Sum is"+(a+b));
            System.out.println("do you want to comtinue(yes/no)");
            choice = kb.next();

        }
        while (choice.equals("yes"));

    }
}
