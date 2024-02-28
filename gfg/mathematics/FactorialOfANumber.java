package gfg.mathematics;

public class FactorialOfANumber
{
    public static void main(String[] args) {
        int n=5;
        int factorial_iterative=factorialI(n);
        int factorial_recursive=factorialR(n);
        System.out.println(factorial_recursive);
        System.out.println(factorial_iterative);
    }


    private static int factorialI(int n)
    {
        int res=1;
        for (int i = 2; i <=n ; i++)
            res=res*i;

            return res;
    }
    private static int factorialR(int n)
    {
        if(n==0)
            return 1;
        return n*factorialR(n-1);
    }

}
