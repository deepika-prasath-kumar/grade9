public class op {
public static void main()
{
    int i = 3;
    int sum=0;
  for(;;)
  {
   if( i++ % 3 == 0 )
    continue;
   if( i++ == 8 )
    break;
   sum+= i;
   i++;
  }
System.out.println("sum= "+sum);
System.out.println(i*i*i);
}
}