 class Pytha {
    
public static void main(String[] args) 
{
double height, base, hyp;
height=Double.parseDouble(args[0]); 
base=Double.parseDouble(args[1]); 
System.out.println("height: "+height);
System.out.println("base: "+base);
hyp= Math.sqrt((height*height)+(base*base));
System.out.println("The length of the hypotenuse is: " + hyp);
}
}
