package gfg.demo.duoon;

public class SearchIndex {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int X=8;
        int N= arr.length;
        int index=-1;
        for(int i=0;i<N;i++)
        {
            if(arr[i]==X)
                index=i;
        }
        System.out.println(index);
    }
}
