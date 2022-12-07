package test;

public class GenericsMain {
    public static void main(String[] args) {
        TestGen<Integer> testGen = new TestGen<>(3);
        testGen.showObj();
    }
}

class TestGen<T extends Number>{
    T obj;
    public TestGen(T obj){
        this.obj = obj;
    }

    public void showObj(){
        System.out.println(obj.toString());
    }
}
