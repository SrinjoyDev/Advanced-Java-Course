

class Human {
  private int age;
  private String name;

  //constructor>>
  //constructor has the same name as the class name
  //and also constructors doesnt have any return types.
  public Human() { //default constrictor
    System.out.println("in constructor!!");

    //here by defailt we can assign some values.
    //so when the object is defined and the constructor laods.
    //we will have some values.
    age = 21;
    name = "Srinjoy another";
  }

  public Human(String name , int age){ //parameterised constructor.
    //we make a constructor accepting arguments so that , 
    //on object is defined for that class ,some values of that can
    //be created.
    this.name = name;
    this.age = age;
  }

  //getters
  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  //setters
  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }
}


public class prac {
  public static void main(String a[]) {
    //normally what happens is when we create an object
    //for a class by it creates an empty object in the
    //heap memory
    //what if we want to assign values to the object
    //when the object is created
    //
    //we can always do this , create object for the class.
    //then put values for that.
    //normal method ::

    //Human object = new Human();
    //setage and set name
    //object.setAge(11);
    //object.setName("Srinjoy");

    //System.out.println(object.getName());
    //System.out.println(object.getAge());

    //above was the normal method which we can do .
    //but provlem with that is that we are creating an 
    //object in heap memory that is empty
    //then we are assigning some values for that object.
    
    //but to have some vairables while defineing the 
    //object , we need to do this :
    //Thats why constructors are there.
    
    Human obj = new Human();
    System.out.println("name : " + obj.getName());
    System.out.println("age : " + obj.getAge());

    //lets say we dont want the predifined values of the class
    //we want to have our own values when we create the object.
    Human obj1 = new Human("shakir", 3);
    System.out.println("new object name" + obj1.getName());
    System.out.println("new object age : " + obj1.getAge());
  }
}
