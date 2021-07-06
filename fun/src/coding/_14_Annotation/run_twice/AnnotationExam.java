package coding._14_Annotation.run_twice;

import java.lang.reflect.Method;

public class AnnotationExam {

    public void method1(){
        System.out.println("메소드 1입니다.");
    }

    @RunTwice
    public void method2(){
        System.out.println("메소드 2입니다.");
    }

    public void method3(){
        System.out.println("메소드 3입니다.");
    }

    public static void main(String[] args) {

        AnnotationExam exam = new AnnotationExam();

        try {
            Method method = exam.getClass().getDeclaredMethod("method1");
            if(method.isAnnotationPresent(RunTwice.class)){
                exam.method1();exam.method1();
            }

            method = exam.getClass().getDeclaredMethod("method2");
            if(method.isAnnotationPresent(RunTwice.class)){
                exam.method2();exam.method2();
            }

            method = exam.getClass().getDeclaredMethod("method3");
            if(method.isAnnotationPresent(RunTwice.class)){
                exam.method3();exam.method3();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
