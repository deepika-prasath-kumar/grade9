public class patternstb
{
    public static void main(String[]args)
    {
        int no=1;
        for (int n=5; n>=1;n--)
        {
            for(int r=n;r>=2; r--){
               System.out.print("* "); 
            }
            System.out.print(no);
            no++;
            System.out.println(" ");
        }
    }
}