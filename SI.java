public class SI
{
    public static void main(String[]args)
    {
        int p=5500;
        double r=7.2, t=3;
        double si= p*r*t/100; //Simple intrest is= principal into rate into time divided by 100
        System.out.print("The principal is "+p);
        System.out.println("The rate is "+r);
        System.out.println("The simple intrest of this principal and rate for a time period of 3 years is "+si);
    }
}