package test;

public class StringConstantPool {
    public static void main(String[] args) {
        String a = "1234";
        String b = "1234";
        Hoang c = new Hoang();
        Hoang d = new Hoang();
        a = a.replace("1","a");
        System.out.println("a: " + a);
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

        System.out.println("Is equal: " + (c == d));

        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
    }
}

class Hoang{
    public String name;
}
