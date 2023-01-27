//Inheritance

//1.1 Memory Usage Optimization
//1.2 Code Reusability
//     --faster development
//     --central code (Easy to debug/test)
//productivity/efficiency

public class Furniture {

    int width;
    int height;

    void display(String item) {
            System.out.println(item +" Width "+width+" Height "+height);
        
    }

    public static void main(String[] args) {
        
        Chair neelkamal = new Chair();
        neelkamal.foo();
    }

}
class Chair extends Furniture{

    void foo() {width=10;height=20;dispaly("Chair");}

}
class Table extends Furniture{

    void foo() {width=30;height=50;dispaly("Table");}

}
class Almirah extends Furniture{

    void foo() {width=100;height=200;dispaly("Almirah");}

}
