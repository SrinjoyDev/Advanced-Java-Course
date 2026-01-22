package collection.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        //map is not part of collectio , it is an interface on itself. 
        //map supports key and value pairs

        //in a map , the keys are unique therefore set , and the values can be duplicated , therefore they are lists.
        //so a map is a combination of set and a list.
        Map<String , Integer> students = new HashMap<String , Integer>();

        //if we want to work with synchronised hashmaps then we can use HashTable<>();
        //that is thread safe . 
        //and we use u7se hashtable when we want multiple threads want to hanmdle the same map .

        students.put("srinjoy", 100);
        students.put("shakir", 99);
        students.put("shubhayan", 95);
        students.put("ankit", 95);
        students.put("shakir" , 23);

        //get via key.
        System.out.println(students.get("srinjoy"));
        System.out.println(students.get("shakir"));

        System.out.println(students);

        //get all the keys.
        Set<String> keys = new HashSet<String>();
        keys = students.keySet();
        
        //print all the keys.
        for(String key : keys) {
            System.out.println("name of the student : " + key);
            //print the vvalues of the key.
            System.out.println("marks : " + students.get(key));
        }
    }
}
