
class Apple {
    public void show1(){
        System.out.println("in apple show");
    }
}

class Ball extends Apple{

    public void show2() {
    System.out.println("in ball show");
    }
}

public class Main{
    public static void main(String[] args) {
        // double d = 4.5;
        // int i = (int)d; //typecassting
        // System.out.println(i);

        // Apple obj = new Apple();
        // obj.show1(); //in apple show.
        // Apple obj1 = new Ball(); //we can also have an objhect of ball nd reference of apple , we know this thing.
        // obj1.show1(); //in apple show

        //Apple obj1 = new Ball();
        //so here above what we were tyring to do is that we are tyring to make an object of the subclass
        //and assign it to the parent class

        //upcasting
        //even if we dont mention the upcasting ,that is what happens behind the scene there.
        Apple obj2 =  (Apple) new Ball(); //we are telling here , obj is of the subclass but refer to the parent class ,that is we are going up so that is upcasting.
        obj2.show1();

        //downcasting
        //now as we have reference of A there in the obj2 , so if we want to call the method
        //show2() we will not be able to call , coz APple class has no idea of the method show2()

        Ball obj3 = (Ball) obj2; //now we know thje obj2 was reference of Apple class
        //now we are downcasting that reference of A bro take the reference now from B , so from parent class we are going down so that is downcasting
        //now as u can guess we can call thje show2() method
        obj3.show2();
    }
}