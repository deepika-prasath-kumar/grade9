public class pattern
{
    public static void main(String[]args)
    {
        int p=1;
      for(int i=1;i<=5;i++)
      {
          for(int j=1;j<=i;j++)
          {
              if(i%2==0){
              System.out.print((p*p*p)-1+" ");
          }
          else{
              System.out.print(p+ " ");
          }
          p++;
      }
       System.out.println(); 
    }
}
}