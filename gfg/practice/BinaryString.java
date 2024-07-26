package gfg.practice;

public class BinaryString {
    public static void main(String[] args) {
        String n = "1100101";
        String z ="";
        int c = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '1') {
                for (int j = i+1; j < n.length(); j++) {
                    if (n.charAt(j) == '1') {
                        z = n.substring(i, j + 1);
                        c++;
                        System.out.println(z);
                    }
                }
            }
        }
        System.out.println("Count=" + c);
    }
}
