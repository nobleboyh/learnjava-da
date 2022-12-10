package test;

import java.util.ArrayList;
import java.util.function.Consumer;

public class TestInterface8 {
    public static void main(String[] args) {
        Regtangle regtangle = new Regtangle();
        Printable.saySomething();
        regtangle.defaultPrint();

        TestFunctionalInterface test = new TestFunctionalInterface();
        test.myFunctionalInterface.test();
        test.execute.accept(1);
        System.out.println(test.data);
    }



}

interface Printable{
    static int data = 5;
    static void saySomething(){
        System.out.println("Printable");
    }

    default void defaultPrint(){
        System.out.println(data);
    }
    void print();
}
interface Drawable extends Printable{
    void draw();
}

class Regtangle implements  Printable{

    @Override
    public void print() {
        System.out.println("reg");
    }
}

@FunctionalInterface
interface MyFunctionalInterface{
    void test();
}

class TestFunctionalInterface {
    public MyFunctionalInterface myFunctionalInterface = Hoang1::hoang;

    public int data = 10;

    public Consumer<Integer> execute = (Integer a)->{
        int b = 11;

        data = 11;
    };


}

class Hoang1{
    static public void hoang() {
        System.out.println("Hoang");
    }
}