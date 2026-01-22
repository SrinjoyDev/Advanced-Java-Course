package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

//collecton is an interface whjich consists of some good data structures we can use in our programs.
//it has so many classes which we can work with

//collection is an interface.
//there are many interfaces that implements this collection interface.

//such as lists -> ArrayLists  , linkedlists ...etc, queues->dequeues , set-> hashset ..etc

public class Main {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<>();

        //instead of collections we cans use List here coz list has get , it can work with indexes.
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);

        System.out.println(nums.get(3));
        System.out.println(nums.indexOf(8));

        for(int n : nums){
            System.out.println(n);
        }

        System.out.println(nums);
    }
}
