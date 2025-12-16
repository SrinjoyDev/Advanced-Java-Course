
//to implement run time polymorphism we need dynamic method dispatch


public class Main {
    public static void main(String[] args) {
     Computer obj = new Laptop(); //so we are making an object of laptop but using type of Computer.
     //as that is the parent class.
     
     obj.show();   // will print b class show , coz we are making object of B but type is A.
     //right now in stack mem there is obj in stack memory that is pointing to show object in heap

     //now we can do something like this here >
     obj = new Computer();
     obj.show(); //here what we did is we assigned the obj object to be object of the class Computer.
     //now the link which was refering to the object b show is now removed and points to A show method object and that will be taken by garbage collectors.


     //how is this polymorphism ???

     //if u see this method obj.show() is diff behaving with diff objects.
     //that is what polymorphism is

     //so it dosent really depend upon wht type of object u are creating but it really depends upon which object of what class u create

     //and keeping in mind it is possible due to inheritance.
     
    }
}


//parent class
class Computer {
    public void show() {
        System.out.println("in show method of a class!");
    }
}

//child
class Laptop extends Computer {
    public void show() {
        System.out.println("in show method of bs class!");
    }
}
