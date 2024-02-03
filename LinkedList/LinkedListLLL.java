/**
 * LinkedListLLL
 */
import java.util.*;
public class LinkedListLLL {

    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");

        list.addLast("List");
        list.addFirst("This");

        list.add("Asif"); 

        list.remove(list.size()-1);

        System.out.println(list);
    }
}
