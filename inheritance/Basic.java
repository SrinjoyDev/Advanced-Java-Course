
//most important thing in inheritance is the difference between is and has in inheritance.

//has , a computer has mouse , keyboard , monitor , cpu ...etc
//mobile is a computer.
// laptop is a computer.
//
//

//apple has a base version of iphone that is there version 1.
//lets say apple as a software is a class class Apple {}  ,something like that.
//then they do a software upgrade  , do they crate the class (software) from scratch???
//no right , so what they do is make another class of that prev one.
//where they defined the new features.
//but they have to copy the prev things also right ?
//they can simply copy but thats too much time waste innit ?
//so what they can do is they can make another class which extends the prev class.
//so that is how they define the new features by keeping the old ones.
//
//that means the new version is inherit the properties of the prev version of apple also.
//
//

public class Basic {

  public static void main(String[] args) {

    // Calc obj = new Calc(); // object of that class.
    int n1 = 10;
    int n2 = 5;

    // int r1 = obj.add(n1, n2);
    // int r2 = obj.sub(n1, n2);

    // now trying with the adv calc which is the extended version of the calc class.
    AdvCalc obj = new AdvCalc();

    int r1 = obj.add(n1, n2);
    int r2 = obj.multi(n1, n2);

    // so calc is the parent class
    // advcalc is the child class , which inherits the properies of the parent class
    // calc.
    int r3 = obj.modulo(n1, n2);
    System.out.println("modulo : " + r3);
    System.out.println(r1 + " " + r2);
  }

}
