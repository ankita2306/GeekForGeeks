package gfg.demo.duoon;

public class NFibonacci {
    public static void main(String[] args) {
       // int n=5;    1,1,2,3
        int a=0,b=1,c=0;
        for (int i = 0; i < 10; i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
