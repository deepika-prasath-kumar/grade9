public class prog76
{
    public static void main(String[]args)
    {
        int a=0;
        int total=0;
        do {
            if(a%2==0)
            {
              total=a+total;
            }
            a++;
        }
        while(a<=18);
        System.out.println(total);
    }
}