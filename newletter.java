public class newletter
{
    public static void main(String[]args)
    {
        for(int i=1;i<=6;i++)
        {
            for (int j=(71-i); j<=70; j++)
            {
                char ch = (char)j;
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
        for(int m=65; m<=90; m=m+2)
        {
            char ch=(char)m;
            
            System.out.print(ch+ " ");
        }
        char ch = 'C';
        int n = ch;
        System.out.println(n);
    }
}