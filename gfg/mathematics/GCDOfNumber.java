package gfg.mathematics;

public class GCDOfNumber
{
    public static void main(String[] args) {
        int a=12;
        int b=15;
        int gcd1=gcd_naive(a,b);
        int gcd_2=gcd_euclidiean(a,b); //repeated subtration
        int gcd_3=gcd_effecient(a,b);
        System.out.println(gcd1);
        System.out.println(gcd_2);
        System.out.println(gcd_3);
    }

    private static int gcd_naive(int a, int b) {
        int res=Math.min(a,b);
        while(res>0)
        {
            if(a%res==0 && b%res==0)
                break;
            res--;
        }
        return res;
    }

    private static int gcd_euclidiean(int a, int b)
    {
        while (a!=b)
        {
            if(a>b)
                a=a-b;
            else;
            b=b-a;
        }
        return a;
    }

    private static int gcd_effecient(int a, int b)
    {
        if(b==0)
            return a;
        else
            return gcd_effecient(b,a%b);
    }

}
