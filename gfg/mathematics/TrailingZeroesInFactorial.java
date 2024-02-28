package gfg.mathematics;

public class TrailingZeroesInFactorial
{
    public static void main(String[] args) {
        //trailing zeroes in the factorial of number n
               int n=251;
               int trailingZero=countZero(n);
               int trailingZero2=countZero_effecient(n);
               System.out.println(trailingZero);
               System.out.println(trailingZero2);
    }

    private static int countZero(int n)
    {
        int f=1;
        for (int i = 2; i <=n; i++)
           f=f*i;
        int res=0;
        while (f%10==0)
        {
            res++;
            f=f/10;
        }
        return res;
    }

    private static int countZero_effecient(int n)
    {
        int res=0;
        for (int i = 5; i <=n; i=i*5)
            res=res+n/i;
        return res;
    }
}
