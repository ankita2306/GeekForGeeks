package gfg.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateStringCharacter
{
    public static void main(String[] args) {
        String n="ankita";
        printDuplicates(n);
    }

    private static void printDuplicates(String n) {

        Map<Character,Integer> d=new HashMap<>();

        for (int i = 0; i < n.length(); i++) {
            char x=n.charAt(i);

            if(d.containsKey(x))
                d.put(x,d.get(x)+1);
            else
                d.put(x,1);
        }



    }


}
