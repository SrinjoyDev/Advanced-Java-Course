package collectionsAss;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    //for defining string in array listss we do this
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");

        //print the original list.
        System.out.println(names);

        //convert the list to a linkedHashSet to remove duplicates while preserving order.
        LinkedHashSet<String> set = new LinkedHashSet<String>(names);

        System.out.println("unique set");

        System.out.println(set);


        
    }
    
}
