package gfg.Web.Array;

public class SmallestThreeInArray {
    public static void main(String[] args) {
        int[] a = {1,3, 6, 2, 5, 9, 7};

        smallestThree(a);
    }

    private static void smallestThree(int[] a) {

        int min=Integer.MAX_VALUE,second_min=0,third_min=0;
        for(int i = 0; i < a.length; i++) {
            if (a[i]<min) {
                third_min=second_min;
                second_min=min;
                min=a[i];
            }
            else if(a[i]<second_min && a[i]!=min)
            {
                third_min=second_min;
                second_min=a[i];
            }
            else if(a[i]<third_min && a[i]!=second_min)
            {
                third_min=a[i];
            }
        }
        System.out.println(min+" "+second_min+" "+third_min);
    }
}
