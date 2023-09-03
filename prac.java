public class prac
{
    public static void main(String[]args)
    {
        int row=0;
        for (int x=1;x<=9;x=x+2)
        {
            row+=1;
            int j=1;
            while(j<=(5-row))
            {
                System.out.print(" ");
                j++;
            }
            for(int n=1;n<=x;n++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}