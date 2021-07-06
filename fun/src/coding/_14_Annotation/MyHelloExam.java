package coding._14_Annotation;

import java.lang.reflect.Method;

public class MyHelloExam {
    public static void main(String[] args) {

        MyHello hello = new MyHello();

        try {
            Method method = hello.getClass().getDeclaredMethod("hello");

            if (method.isAnnotationPresent(Count100.class)){ // hello()메소드가 Count100 어노테이션이 적용되어 있는가?
                for (int i = 0; i < 100; i++){
                    hello.hello();
                }
            } else {
                hello.hello();
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("hello = " + hello);
    }
}
