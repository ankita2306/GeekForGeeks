package gfg.practice;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    public static void main(String[] args) {
        String n="abc";
        List<String> permutation=permuteString(n);
        System.out.println(n +":"+permutation);
    }

    private static List<String> permuteString(String n)
    {
        List<String> permutation=new ArrayList<>();

        if(n.length()==0) {
            permutation.add("");
            return permutation;
        }

        for (int i = 0; i < n.length(); i++) {
            char x=n.charAt(i);
            String rem=n.substring(0,i)+n.substring(i+1);

            List<String> perms=permuteString(rem);
            for (String perm:perms) {
                  permutation.add(x+perm);
            }
        }
        return permutation;
    }
}
