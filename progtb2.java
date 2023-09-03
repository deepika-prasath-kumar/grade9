public class progtb2
{
    public static void main(String[]args)
    {
       
        for (int n=1;n<=5;n++)
        {
            for(int r=4;r>=n; r--)
            {
               System.out.print("* "); 
            }
            for(int r=1;r<=n; r++)
            {
               System.out.print(n+" "); 
            }
            System.out.println(" ");
        }
    }
}