
package gfg;
public class ReverseAString {
    public static void main(String[] args) {
        String myString="Ankita";
        int length=myString.length();
        String reverseString="";
        for(int i=length-1;i>=0;i--)
        {
            char ch=myString.charAt(i);
            reverseString=reverseString+ch;
        }
        System.out.println("My String --> "+myString);
        System.out.println("Reversed String --> "+reverseString);
    }
}
