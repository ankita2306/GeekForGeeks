package gfg.mathematics;

import java.util.ArrayList;

public class AllDivisorsOfNumber
{
    public static void main(String[] args) {
        int number=24;
        ArrayList<Integer> al=new ArrayList<Integer>();
        for (int i = 1; i<=number ; i++)
        {
            if(number%i==0)
                al.add(i);
        }
        System.out.println(al);
    }
}
