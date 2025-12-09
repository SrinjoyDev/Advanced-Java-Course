
import other.A;


class C extends A {
    public void abc() {
        System.out.println(password); //here we can use it , coz we are creating a subsclass of it , and able to access it .
    }
}

class D extends AnotherClass {
    public void abc() {
        ///System.out.println(name); //if u see we cant access private variable of a class with subclass also , we can only access it insdide the class only.
    
        //we tru protected now >
        System.out.println(veryProtectedPassword); ///we canb access protected variables of antoher class from any package , not randomly but inside a subclass.
    }
}

public class Main {
    public static void main(String[] args) {
         A obj  = new A();
        int amarks = obj.marks; //if the A class is insdide anothjer package then we havbe to make the vartiaLBLE OR methods public ootherwise we cant access it.
        AnotherClass obj1 = new AnotherClass();
        int bmarks = obj1.Bmarks; //if it is in the same package we can access it witrhjjout public,

        System.out.println(amarks);
        System.out.println(bmarks);

        //so the thing is that .
        //for private variables : for private variables , we can use it in the same class.
        //for defaulty acess modifiers we can use it if the class is getting acessed from the same package.
        //for protected acess modifiers we can use it from anywheer but only after creating a subclass from that parent class.
        //protected can be used in the same package non subclass too. (NOTE)
        //for public access modifeiers we can access it from anywhere.


        //GOOD PRACTICEs >
        //try to keep ur classes public,
        //dont use degfauly access moduiefiers for vars , try to usse privatee more.
    }  
}