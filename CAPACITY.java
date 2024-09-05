import java.util.Scanner;

// The capacity() method of the StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16. If the number of characters increases from its current capacity, it increases the capacity by (oldcapacity*2)+2.
//For instance, if your current capacity is 16, it will be (16*2)+2=34.
public class CAPACITY {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("Hello world");
        System.out.println(sb.capacity());
        sb.append("Priyanshu Jaiswal");
        System.out.println(sb.capacity());
        sb.append("Hello again");
        System.out.println(sb.capacity());
    }
}
