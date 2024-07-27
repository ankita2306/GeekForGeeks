package gfg.Web.Array;

public class TwoPointerTechnique {
    public static void main(String[] args) {
        int []a = {10, 20, 35, 50, 75, 80};
        int x = 70;
        int n=a.length;
        boolean result=sumOfTwo(a,x,n);
        System.out.println(result);
    }

    private static boolean sumOfTwo(int[] a, int x, int n)
    {
        int i=0,j=n-1;
        while (i<j)
        {
            if(a[i]+a[j]==x)
                return true;
            else if(a[i]+a[j]>x)
                j--;
            else
                i++;
        }
        return false;
    }
}
