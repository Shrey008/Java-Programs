class Calculator {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        switch (args[1]) {
            case "+":
                System.out.println("Sum is: " + (a + b));
                break;
            case "-":
                System.out.println("Diff is: " + (a - b));
                break;
            case "*":
                System.out.println("Product is: " + (a * b));
                break;
            case "/":
                if (b != 0) {
                    System.out.println("Division result is: " + ((float) a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case "%":
                System.out.println("Modulus is: " + (a % b));
                break;
            default:
                System.out.println("Wrong operator");
        }
    }
}