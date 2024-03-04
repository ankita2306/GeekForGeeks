package gfg.Sandeep;

public class LeftRotationOfAString {

    public static void main(String[] args) {
      String n="SANDEEP";
      int d=3;
        System.out.println("Original String="+n);
      char temp[]=new char[d];
      char arr[]=n.toCharArray();
        for (int i = 0; i < d ; i++) {
            temp[i]=arr[i];
        }
        for (int i = d; i < n.length(); i++) {
            arr[i-d]=arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n.length()-d+i]=temp[i];
        }

        String z=new String(arr);
        System.out.println("Output String="+z);
    }
}
