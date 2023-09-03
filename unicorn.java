import java.util.*;
public class unicorn 
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number you want to divide");
        int i= sc.nextInt();
        System.out.println("Enter the number you want to be the divisor");
        int b= sc.nextInt();
        int remainder, quotient;
        remainder= i%b;
        quotient=i/b;
        System.out.println("The quotient is "+ quotient);
        System.out.println("The remainder is "+ remainder);
    }  
}