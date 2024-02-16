
package gfg;
public class ReverseAString {
    public static void main(String[] args) {
        String myString="Ankita";
        int length=myString.length();
        StringBuilder reverseString= new StringBuilder();
        for(int i=length-1;i>=0;i--)
        {
            char ch=myString.charAt(i);
            reverseString.append(ch);
        }
        System.out.println("My String --> "+myString);
        System.out.println("Reversed String --> "+reverseString);
    }
}
