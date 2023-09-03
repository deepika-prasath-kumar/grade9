public class patterns123
{
    public static void main(String[]args)
    {
        int incri=1; 
        for (int n=1; n<=5;n++)
        {
            for(int r=1;r<=n; r++){
               System.out.print(incri+ " "); 
               incri++;
            }
            System.out.println(" ");
        }
    }
}