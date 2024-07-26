package gfg.Web.Array;

public class SmallestSecondSmallest {
    public static void main(String[] args) {
        int[] a = {3, 6, 12, 5, 9, 7};
        int min=Integer.MAX_VALUE,sec_min=Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++)
        {
           if(a[i]<min)
           {
               sec_min=min;
               min = a[i];
           }
           else if(a[i]<sec_min && a[i]!=min)
           {
              sec_min=a[i];
           }
        }
        System.out.println(min);
        System.out.println(sec_min);
    }
}
