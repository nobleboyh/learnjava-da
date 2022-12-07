package test;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandle {
    public static void main(String[] args) {
        //NOTE:
        //Checked Exception not propagate automatically -> Compile error
        //Only Unchecked Exception automatically propagate
        try {
            a();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void a(){
//        b();    //Compile error
        c();
    }

    public static void b() throws IOException {
        throw new IOException("Test");
    }

    public static void c(){
        int a = 100/0;
    }
}
