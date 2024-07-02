package gfg.string;

public class StringRotation {
    public static void main(String[] args) {

        String n="elephant";
        //012345
        //left-airecl 234501
        //right-reclai 450123
        int k=3;

     /*   String left=n.substring(k)+n.substring(0,k);
        String right=n.substring(n.length()-k)+n.substring(0,n.length()-k);
        System.out.println(left);
        System.out.println(right);*/
        System.out.println(leftrotate(n,k));

        System.out.println(rightrotate(n,k));
    }

    private static String rightrotate(String n, int k)
    {
        return leftrotate(n,n.length()-k);
    }

    public static String leftrotate(String n,int k)
    {
        String left=n.substring(k)+n.substring(0,k);
        return left;
    }

}
