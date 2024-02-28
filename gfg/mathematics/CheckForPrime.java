package gfg.mathematics;

public class CheckForPrime {
    public static void main(String[] args) {
        int number=9,c=0;
        for (int i = 1; i<=number ; i++)
        {
            if(number%i==0)
                c++;
        }
        if(c==2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
