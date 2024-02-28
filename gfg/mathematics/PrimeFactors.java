package gfg.mathematics;

public class PrimeFactors
{
    public static void main(String[] args) {
        int N=12;
        for (int i = 1; i<=N ; i++)
        {
            int c=0;
            for (int j = 1; j <=i ; j++) {
                if(j%1==0)
                    c++;
            }
            if(c==2)
                System.out.println(i);
        }

    }
}

