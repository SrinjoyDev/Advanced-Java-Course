package other;

class Launch {
    public void show() {
        A obj = new A();
        String gettingPassword=  obj.password; //as u can see we can see we are using , this protected thing inside the package.
        //but we cant use it outside the package. uless we are using a subclass of it/.
    }
}

public class A {
    public int marks = 100;
    //if we dont menmtion anytingh something will be default./
    //that is called defult access modifier whenm we dont include private or public.
    int age = 20; //defauilt simply measns it can be accessesed in the same package.

    protected String password = "secret password"; //if we use protected we cant use it outside the package.
}
