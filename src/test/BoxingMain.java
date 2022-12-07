package test;

public class BoxingMain {
    public static void main(String[] args) {
        //Test autoboxing
        int x = 2;
        Integer xNew = x;
        Integer b = xNew;
        b = 3;

        //Use with methods

        System.out.println("xNew: " + xNew);

        Test test = new Test();
        test.data = 1;
        resetTest(test);
        System.out.println(test.data);
    }

    public static void changeValueToOne(Integer integer){
    }

    public static void resetTest(Test test){
        test = new Test();
        test.data = 10000;
    }
}

final class Test{
    public int data;
}
