package gfg.string;

public class BinaryString {
    public static void main(String[] args) {
        String n="00100101";
        String z="";
        int c=0;

        for (int i = 0; i < n.length(); i++) {
            char x = n.charAt(i);
            if (x == '1') {

                for (int j = i+1; j < n.length(); j++) {
                       if(n.charAt(j)=='1') {
                           c++;
                           System.out.println(n.substring(i,j+1));
                       }
                }
            }
        }
        System.out.println(c);
    }
}
