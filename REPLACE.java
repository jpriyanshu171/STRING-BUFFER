// The replace() method replaces the given string from the specified beginIndex and endIndex-1.
public class REPLACE {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        sb.replace(1,3,"Java");
        System.out.println(sb);
    }
}
