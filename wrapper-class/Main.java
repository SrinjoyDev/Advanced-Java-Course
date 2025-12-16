
//we know now that every class in java extends the Object.
//but does that make java an object oriented programming language?
//the answer is no
//becauase java has primitive types as well , that is not an object.
//for exaple int age = 22; this is not an object.
//java is 99 percent object oriented , but also has primitive types that 
//makes java partially oop

//why is that now ?
//why java has primitive types also .
//it is because of the performance java devs had primitive types as well
//that is not everytime it will make an object in the heap memory which will take time to
//retreive from the heap memory.

//so that is where wrapper class comes into the picture , for every primitive type
//there is going to be a class for it .
//int -> Interger , which is a class , and that extends an object.

//for every primitive types there is a class for it .
//which is good and can be usable if u want to have a framework ,that only supports object in it.

public class Main {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num; //primitve to wrapper class , now it an object.
        //well this is happening automatically.
        //in oldeer java what was the method was . older java we had to box primitive data types
        //Integer num2 = new Integer(num); //so this is boxing , where we are taking a primitive data type and boxing into a wrapper claass wchich is an objhect.
    
        int num2 = 9; //primitive
        Integer num3 = num2; //wrap it- > boxing
        int num4= num3.intValue();//unboxing -> wrapper class -> primitive data type.
        //even if we dont do the intValue() that will happen automatically in java , that is auto unboxing .

        System.out.println(num4);


        String str = "22";
        int number = Integer.parseInt(str); //conv string to int
        System.out.println(number);
    }
}