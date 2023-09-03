public class qpop
{
    public static void main(String[]args)
    {
        int i=1;int y=0;
        do
        {
            y=i++ - --i+ i++;
            if(i%2==0)
            continue;
            System.out.println(i+y);
            y+=5;
        }while(y<=10);
        }
    }
