package Strings.ez;

public class strings {
    public static void main(String[] args) {
        String name = new String("Srinjoy"); //or String name = "Srinjoy"; we dong generally need to create instance of the class String everytiome , we can just simply assign it like the or method , and if we see String is actuially a java class.
        //in the jvm , in the stack memeoryu , we save the address.
        //thje address points to the heap meomry
        //where the address is the object is stored.
        
        // System.out.println(name);
        // System.out.println(name.hashCode()); //hashcode of the string

        // //string concatenation
        // System.out.println("hello" + name);
        // //look up a charecter from the index of the string
        // System.out.println(name.charAt(0)); //0 is the index here , will print S
        // System.out.println(name.concat(" Das"));

        //mutable and immutable string
        String name2 = "Shakir";
        name2 = name2 + "Das"; //we are not actually changing the origninal name2 string to shakir das.
        System.out.println(name2);

        String s1 = "Srinjoy";
        String s2 = "Srinjoy";

        //here we are not creating 2 objects in the heap memory.
        //it is actually 2 different references stored in the stack memory,
        //which points to the same object at the heap memory
        //so all this constant values for string which gets stored in the heap of JVM
        //is actually the string constant pool

        if(s1 == s2){
            System.out.println("true");
        } else{
            System.out.println("false");
        }

        //so when we do this :
        s1 = s1 + "Das"; //what happens here is the s1 dosent gets overwritten
        //the data of s1 originally that is Srinjoy is still in the String constant pool(S.C.P)
        //from the stack memery the address that s1 was refering to , is changed to the new one that is s1 + Das
        //so we are basically creating a new object here.
        //w3hat happens to the "Srinjoy" that is there in the heap memoery in the scp.
        //it is not eligible for garbage collection now , it will get removed by the jvm.

        //mutable strings -> once a string is created it cant be changed. The object still stays there , just the reference changes.


        //immutable strings --> used by stringbuffers or stringBuilderrs.
    }
}
