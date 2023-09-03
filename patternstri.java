public class patternstri
{
    public static void main(String[]args)
    {
        char a='A';
        int k = a;
        for (int n=1; n<=5;n++)
        {
            for(int r=1;r<=n; r++){
               System.out.print(k); 
            }
            System.out.println(" ");
        }
        for (int n=4; n>=1;n--)
        {
            for(int r=n;r>=1; r--){
               System.out.print('a'); 
            }
            System.out.println(" ");
        }
    }
}