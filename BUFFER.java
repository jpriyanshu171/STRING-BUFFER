// StringBuffer is a class in Java that represents a mutable sequence of characters. It provides an alternative to the immutable String class, allowing you to modify the contents of a string without creating a new object every time.
/*
1. StringBuffer objects are mutable, meaning that you can change the contents of the buffer without creating a new object.
2. The initial capacity of a StringBuffer can be specified when it is created, or it can be set later with the ensureCapacity() method.
3. The append() method is used to add characters, strings, or other objects to the end of the buffer.
4. The insert() method is used to insert characters, strings, or other objects at a specified position in the buffer.
5. The delete() method is used to remove characters from the buffer.
6. The reverse() method is used to reverse the order of the characters in the buffer.
*/
public class BUFFER {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("Priyanshu");
        sb.append(" ");
        sb.append("Jaiswal");
        sb.insert(1, "Java");
        System.out.println(sb);


        String message=sb.toString();
        System.out.println(message);
    }
}
/*
There are several advantages of using StringBuffer over regular String objects in Java:

1. Mutable: StringBuffer objects are mutable, which means that you can modify the contents of the object after it has been created. In contrast, String objects are immutable, which means that you cannot change the contents of a String once it has been created.

2. Efficient: Because StringBuffer objects are mutable, they are more efficient than creating new String objects each time you need to modify a string. This is especially true if you need to modify a string multiple times, as each modification to a String object creates a new object and discards the old one.

3. Thread-safe: StringBuffer objects are thread-safe, which means multiple threads can access it simultaneously( they can be safely accessed and modified by multiple threads simultaneously). In contrast, String objects are not thread-safe, which means that you need to use synchronization if you want to access a String object from multiple threads.
 */