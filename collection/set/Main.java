package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //hash set unique values
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(2);
        nums.add(1);
        nums.add(1);
        nums.add(0);
        nums.add(7);
        nums.add(8);
        nums.add(7);

        //note set dosent support index values.
        //set is a collection of unique elements.
        //it doestn give sorted value.

        //if we wantl sorted values we can use tree set.
        Set<Integer> num2 = new TreeSet<Integer>();
        num2.add(101);
        num2.add(102);
        num2.add(99);
        num2.add(95);
        num2.add(91);
        num2.add(85);
        num2.add(99);

        //tree sets has their own iterators
        Iterator<Integer> values = num2.iterator();

        System.out.println(nums);

        while(values.hasNext()){
            System.out.println(values.next());
        }

        // System.out.println(num2);
    }    
}
