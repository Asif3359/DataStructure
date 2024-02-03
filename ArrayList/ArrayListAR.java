package ArrayList;

import java.util.*;
/**
 * ArrayListAR
 */
public class ArrayListAR {

    public static void inArrayList()
    {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String :");
        int i = 0 ;
        while (true) {
            String str = sc.next();
             if(str.equals("0"))
             {
                break;
             }
             list.add(str);
             i++;
        }

        Collections.sort(list);
        System.out.println(list);
        System.out.println(i);
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Asif ahammed");
        list.add("is ");
        list.add("a");
        list.add("bad");
        list.add("boy");
        list.add("*");
        list.add(0, "1. ");
        list.set(0, "Man");
        list.remove(list.size()-3);
        list.remove(list.size()-1);
        list.remove(list.size()-list.size());

        System.out.println(list);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String :");
        String subString = sc.nextLine();

        for(int i = 0 ; i<list.size(); i++)
        {
            if(list.get(i).equals(subString))
            {
                System.out.println("Found index "+i);
            }
        }
        Collections.sort(list);
        System.out.println(list);

        inArrayList();
    }
}
