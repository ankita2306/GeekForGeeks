package gfg.Web.Array;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {3,6,0,1,0,0,5,7,3,9,0};
        int c = 0;
        for (int i =0;i<arr.length;i++) {
            if (arr[i] != 0) {
                arr[c++] = arr[i];
            }
        }
       /* for (int i = c; i < arr.length; i++)
        {
            arr[i]=0;
        }*/
        while (c< arr.length)
        {
            arr[c++]=0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
