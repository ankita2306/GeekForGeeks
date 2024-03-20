package gfg.array_practice;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={2,4,24,12,3};
        int n=arr.length;
        int max=0, sec_max=0;

        for (int i = 0; i < n ; i++)
        {
            if(arr[i]>max)
            {
                sec_max=max;
                max=arr[i];
            }
            else if(arr[i]>sec_max && sec_max!=max)
            {
                sec_max=arr[i];
            }
        }
        System.out.println(sec_max);
    }
}
