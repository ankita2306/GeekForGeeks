package gfg.practice;

public class AllSubstrings {
    public static void main(String[] args) {

        String n="abc";
        substringFunction(n);
        System.out.println('\n');
        allSubstring(n);
    }

    private static void allSubstring(String n) 
    {
        System.out.println("All Substring");

        for (int i = 0; i < n.length() ; i++) {
            String subStr="";

            for (int j = i; j < n.length() ; j++) {
                char x=n.charAt(j);
                subStr+=x;
                System.out.print(subStr+"   ");
            }

        }
    }

    private static void substringFunction(String n) 
    {
        System.out.println("Built In Function");
        for (int i = 0; i < n.length(); i++) {
            for (int j = i+1; j <= n.length() ; j++) {
                System.out.print(n.substring(i,j) +"   ");
            }
        }
    }
}
