import java.util.*;

public class prog95
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        for(int i=1;i<=2;i++)
        {
            System.out.println("Enter your Name:");
            String name = sc.next();
            System.out.println("Enter your Roll number:");
            int roll = sc.nextInt();
            System.out.println("Enter your marks in 10 subjects:");
            int total = 0, avg = 0;
            for(int j=1;j<=10;j++)
            {
                int mark = sc.nextInt();
                total = total+mark;
            }
            avg = total/10;
            System.out.println("your average score:"+avg);
        }
    }
}
