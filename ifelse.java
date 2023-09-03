import java.util.Scanner;
public class ifelse
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int value1, value2; // if you dont put int bfr value1 then u write statement//
        System.out.println("Enter value1");
        value1= input.nextInt();
        
        System.out.println("Enter value2");
        value2= input.nextInt();
        
        if(value1 > value2)
        {
            System.out.println("Value1 is greater than value2");
        }
        else if(value2 > value1)
        {
        System.out.println("Value2 is greater than value1");
        }
        else 
        {
            System.out.println("Value1 is equal to value2");
        }
   }
}