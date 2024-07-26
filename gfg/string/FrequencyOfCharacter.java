package gfg.string;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String n = "capella";

        Map<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < n.length(); i++) {
            char x = n.charAt(i);

            if (m.containsKey(x)) m.put(x, m.get(x) + 1);
            else m.put(x, 1);
        }

        for (int i = 0; i < n.length(); i++) {
            char x = n.charAt(i);

            if (m.get(x) != 0)
                System.out.println(x + "  " + m.get(x));
            m.put(x, 0);
        }
    }
}
