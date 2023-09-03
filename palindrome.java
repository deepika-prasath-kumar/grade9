import java.util.*;
public class palindrome
{
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int p=n;
    int rev=0;
    while(n!=0){
        int n1=n/10;
        int n2=n%10;
        rev=(rev*10)+n2;
        n=n1;
    }
    if(rev==p){
        System.out.println("The number is a palindrome"+rev);
    }
    else{
        System.out.println("The number is not a palindrome"+rev);
    }
   }
}