import java.util.Scanner;
public class inputScanner
{ 
    public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
   
    System.out.println("Enter an integer value: ");
    int value1= input.nextInt();
    
    System.out.println("Enter a double value: ");
    double dvalue= input.nextDouble();
    
    System.out.println ("Value1=" + value1);
    System.out.println ("Value2=" + dvalue);
    
    System.out.println("Enter an string value: ");
   String str1=input.next();
   System.out.println ("str1:"+ str1);

 }
}
    


    
    
    
