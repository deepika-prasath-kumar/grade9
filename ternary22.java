import java.util.*;
public class ternary22
{
    public static void main() throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println(name);
        System.out.println("Enter your grade");
        String grade=sc.next();
        char g = grade.charAt(0);
        String desig = g == 'A'?"General Manager":g == 'B' ? "Manager" : g== 'C'?"Accountant":g=='D'?"Advisor":"You have entered the wrong the grade";
        System.out.println("Name"+name+", designation"+desig);
        
        
        
    }
}