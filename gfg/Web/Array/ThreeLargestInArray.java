package gfg.Web.Array;

import java.util.Arrays;

public class ThreeLargestInArray {
    public static void main(String[] args) {
        int []a={3,6,2,5,9,7};

        threelargest(a);
    }

    private static void threelargest(int[] a)
    {
       int max=0,second_max=0,third_max=0;
        for(int i = 0; i < a.length; i++) {
            if(a[i]>max)
            {
                third_max=second_max;
                second_max=max;
                max = a[i];
            }
           else if(a[i]>second_max && a[i]!=max)
            {
                third_max=second_max;
                second_max=a[i];
            }
          else if(a[i]>third_max && a[i]!=second_max)
            {
                third_max=a[i];
            }
        }
        System.out.println(max+" "+second_max+" "+third_max);
    }
}
