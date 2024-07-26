package gfg.Web.Array;

public class LargestArray {
    public static void main(String[] args) {
        int a[]={3,6,2,5,9,77};
        int max=0;
        for (int i = 0; i < a.length; i++) {
            //System.out.println(a[i]);
            if(a[i]>max)
                max=a[i];
        }
        System.out.println(max);
    }
}
