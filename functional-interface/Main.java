
//types of interfaces
//1. normal interfaces -> more than one values or methods defined in an interface.
//2. functional interface (SAM) -> only one method defined in an interface
//3, marker interface -> empty interface. -> which can store stuff in HD of ur device , used in game saving ...etc we will learn about this in detail later.

@FunctionalInterface
interface A {
    void show();
}

// class B implements A {
//     public void show() {
//         System.out.println("in B show");
//     }
// }

public class Main {
    public static void main(String[] args) {
        //     A obj = new B();
        //     obj.show();
        // }

        //OR

        A obj = new A() {
            public void show() {
                System.out.println("in show!!");
            }
        };
        obj.show();
    }
}
