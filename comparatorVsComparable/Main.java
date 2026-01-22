package comparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student implements Comparable<Student> {

    int age;
    String name;

    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that){
        if(this.age > that.age){
            return 1;
        }
        return -1;
    }
    
}

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(32);
        nums.add(21);
        nums.add(48);
        nums.add(45);
        nums.add(69);
        nums.add(67);

        Collections.sort(nums); //this will sort based on the collections framework.

        //but what if we want our own logic of sorting
        //for example we want to sort the arraylist based  on the last digit of the numbers that are there on the array

        //there we can use comparators.
        //comparators is an interface.
        //if we see comparator is a functional interface , so we can make an anonymous class out of it , and use it.
        // Comparator<Integer> com = new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer i  , Integer j) {
        //         if(i%10 > j %10){ //this is to check the last number of an element
        //             return 1; //swap for 1
        //         }
        //         return -1; //dont swap for -1
        //     }
        // };

        Comparator<Integer> com = ( i, j) -> {
            return Integer.compare(i%10 , j%10);
        };

        //so bassically comparator is an interface , for which we can use that to implement our own logic of sorting.
        Collections.sort(nums , com); //it also accepts a comparator here . the comparator here is our custom logic.


        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Srinjoy"));
        studs.add(new Student(22, "Shakir"));
        studs.add(new Student(22, "Subhayan"));
        studs.add(new Student(21, "Ankit"));

        for(Student s : studs){
            System.out.println(s);
        }

        //how do we sort this students based on their age.
        // Comparator<Student> studentComparator = new Comparator<Student>() {
        //     @Override
        //     public int compare(Student s1 , Student s2){
        //         if(s1.age > s2.age){
        //             return 1;
        //         }
        //         return -1;
        //     }
        // };

        Comparator<Student> studentComparator = (s1 , s2) -> {
            return s1.age > s2.age ? 1 : -1;
        };

        Collections.sort(studs , studentComparator);
        System.out.println("after sorted");
        for(Student s : studs){
            System.out.println(s);
        }

        //another approach is that comparable method .
        //that is if we go to Integer class we will see an method called compareTo.
        //what we can do is that we can implement the interface COmparable to the Student class , and override the compare to method
        //and then instead of using a comparator here . 
        //we can simply do collectoionns.sort(studs) , and it will work.

        //after using comparable
        System.out.println("after using comparable");
        Collections.sort(studs);

        for(Student s : studs){
            System.out.println(s);
        }

    }
}
