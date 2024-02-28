package gfg.mathematics;

public class PallindromeNumber
{
    public static void main(String[] args) {
        int n=1235321;
        boolean pallin=isPallindrome(n);
        System.out.println(pallin);
    }
    private static boolean isPallindrome(int n)
    {
        int b=n,x,rev=0;
        while(b!=0)
        {
            x=b%10;
            rev=rev*10+x;
            b=b/10;
        }
        if(rev==n)
            return true;
        else
            return false;
    }
}



