package gfg.Sandeep;

public class LeftRotateString2 {
    public static void main(String[] args) {
        String n="priya";
        int d=2;

        String z="";

        //required output =iyapr
        for (int i = d; i < n.length(); i++)
        {
            z=z+n.charAt(i);
        }

        for (int i = 0; i < d; i++) {
            z=z+i;
        }

        System.out.println(z);
    }
}
