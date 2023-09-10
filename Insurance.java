class Insurance{
     public static void main (String[]args)
{
    int age = Integer.parseInt(args[0]);
    String gender = args[1];
    String status = args[2];

    if(status.equalsIgnoreCase("married"))
    System.out.println("insurance give");

     else if(gender.equalsIgnoreCase("male")&&age>35)
    System.out.println("insurance given");

    else if(gender.equalsIgnoreCase("female")&&age>30)
    System.out.println("insurance given");

    else
            System.out.println("insurance not given");

   
}
}