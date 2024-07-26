package gfg.Web.Array;

public class SecondLargestArray {
    public static void main(String[] args) {
        int a[]={3,6,2,5,9,22,52,77,87};
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            //System.out.println(a[i]);
            if(a[i]>max)
            {
                sec_max=max;
                max = a[i];
            }
            else if(a[i]>sec_max && a[i]!=max)
            {
                sec_max=a[i];
            }
        }
        System.out.println(max);
        System.out.println(sec_max);
    }
}
