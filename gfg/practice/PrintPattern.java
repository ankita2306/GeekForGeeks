package gfg.practice;

public class PrintPattern {
    public static void main(String[] args) {
        int n=5;
        printpattern(n);
    }

    private static void printpattern(int n)
    {
        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }

            for (int j = i; j>=1; j--) {
                System.out.print("*"+" ");
            }

            for (int j=2;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println( );
        }
    }
}
