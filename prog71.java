public class prog71
{
    public static void main(String[]args)
    {
        int a=20;
        System.out.println("Even numbers from 20 to 40 are:");
        do{
            if(a%2==0)
            {
                System.out.println(a);
            }
            a++;
        }
        while(a<=40);
    }
}