public class prog75
{
    public static void main(String[]args)
    {
        int a=1;
        int total=0;
        do{
            total=total+a;
            a++;
        }
        while(a<=10);
        System.out.println("The sum of the first 10 numbers is:"+total);
    }
}