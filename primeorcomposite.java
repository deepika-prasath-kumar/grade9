public class primeorcomposite
{
    public static void main(String[]args)
    {
        int n=5;
        int i=1;
        int j=0;
        for(i=1;i<=n;i++)
        {
          if(n%i==0)
          {
             j++;   
          }
        }
        if(j==2)
        {
            System.out.println("Prime");
        }
        else
        {
          System.out.println("Composite");  
        }
    }
}