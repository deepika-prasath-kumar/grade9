import java.util.*;
public class primecomposite{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int i=1;
        int j=0;
        for(i=1;i<=n;i++){
            if(n%i==0){
            j++;
        }
    }
    if(j==2){
      System.out.println("The number is prime") ;
    }
    else{
        System.out.println("The number is composite");
    }
    }
}