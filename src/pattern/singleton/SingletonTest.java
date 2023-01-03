package pattern.singleton;

/**
 * Bill Pugh Singleton Implementation
 * Multi-thread safe
 * */
public class SingletonTest {

    public SingletonTest(){}

    public static SingletonTest getInstance(){
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper{
        public static SingletonTest INSTANCE = new SingletonTest();
    }

    public void hello(){
        System.out.println("Hello");
    }
}
