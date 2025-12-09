

class Me {
  private String name = "Srinjoy";
  private int age = 21;

  private String setName;
  private int setAge;

  //above instance variables are privare so if someone directs wants to access this ,
  //the wont be able to.
  
  //we can make methods , by which we can give access to private instance variable;
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setName(String nameToSet) {
    this.setName = nameToSet; //this method is used , to refer an instance varialble
    System.out.println(setName);
  }
  
  public void setAge(int ageToSet) {
    this.setAge = ageToSet;
    System.out.println(setAge);
  } 

}

public class gettersSetters {
  public static void main(String a[]){

    Me obj1 = new Me();
    //obj1.name = "Srinjoy"; //wont work as name is a private instance variable.
    //System.out.println(name);
    
    //as we made methods for that class , we can get the name anda ge as >
    System.out.println("name of the user : " + obj1.getName());
    System.out.println("age of the user : " + obj1.getAge());

    //set the name
    Me obj2 = new Me();
    obj2.setName("shakir");
    obj2.setAge(11);
  }
}
