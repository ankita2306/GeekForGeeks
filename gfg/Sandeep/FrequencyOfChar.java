package gfg.Sandeep;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String n="ankita";
        Map<Character,Integer> list=new HashMap<>();
        for (int i = 0; i < n.length() ; i++) {
             char c=n.charAt(i);

             if(list.containsKey(c))
                 list.put(c,list.get(c)+1);
             else
                 list.put(c,1);
        }
        for (int i = 0; i <n.length() ; i++) {
            char c=n.charAt(i);
            if(list.containsKey(c))
                System.out.println(c+""+list.get(c));

            list.remove(c);
        }
    }
}
