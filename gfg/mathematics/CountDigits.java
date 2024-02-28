package gfg.mathematics;

public class CountDigits {
    public static void main(String[] args) {
        int n=7992332;
        int digits=countDigit(n);
        int count=counts(n);
        System.out.println(digits);
        System.out.println(count);
    }

    public static int countDigit(int n)
    {
        int x=0,c=0;
        while(n!=0)
        {
            x=n%10;
            c++;
            n=n/10;
        }
        return c;
    }
    public static int counts(int n)
    {
        int res=0;
        while(n>0)
        {
          n=n/10;
          res++;
        }
        return res;
    }
}
