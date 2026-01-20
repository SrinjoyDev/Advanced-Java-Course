//we learned how functional interfaces are , and different types of interfaces.
///now we will see lambda expressions that are used only with functional interfaces onmly.

//functional interface.
@FunctionalInterface
interface Car {
    void drive(int i);
}

@FunctionalInterface
interface A {
    int add(int a , int b);
}

public class Main {
    public static void main(String[] args) {
        //lambda expressiom
        //compiler knows it is a functional interface so it knows it has only one method , so we can use lambda expressons
        //without typing the method and all , we can simply do like this here.
        //compiler under the hood is intelligent enough to know we are calling the defined method of the functional interface for this object of the class.
        Car car = (i) -> System.out.println("car driving" + i);
        car.drive(5);
        
        //lambda expressions with return values
        //when we go to collections we will see how to put lambda expressions with arguments.
        //remmeber lambda expressionos only work with funcitonal interfaces.
        A adding = (a , b) ->  a+b;
        adding.add(2, 3);
    }
}
