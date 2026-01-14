
//enum is a class only  , only difference from standard classes with enum is that , u cant extend another enum from an enum.
//rest we can do pretty much everything with enums.

enum Laptop {
    apple(100000) , hp(45000) , lenovo , dell(60000);

    private int price;

    private Laptop() {
        //calls only once , when detects there is no values of prce on the laptop names , then it will piclk the default.
        price = 500;
    }

    private Laptop(int price) {
        //calls this constructror three times
        this.price = price;
        System.out.println("in laptop");
    }

    //getters
    public int getPrice() {
        return price;
    }

    //setters
    public void setPrice(int price) {
        this.price = price;
    }
    
}


public class Main {
    public static void main(String[] args) {
        // Laptop lap = Laptop.apple;
        // System.out.println(lap + " " + lap.getPrice());

        //for all values >
        for (Laptop lap : Laptop.values() ) {
            System.out.println(lap + " price : " + lap.getPrice());
        }

    }
}