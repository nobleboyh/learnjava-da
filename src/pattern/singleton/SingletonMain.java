package pattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonTest singletonTest = SingletonTest.getInstance();
        SingletonTest singletonTest2 = SingletonTest.getInstance();

        singletonTest.hello();
        System.out.println(singletonTest);
        System.out.println(singletonTest2);
    }
}
