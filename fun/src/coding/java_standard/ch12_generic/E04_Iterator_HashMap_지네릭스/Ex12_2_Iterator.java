package coding.java_standard.ch12_generic.E04_Iterator_HashMap_지네릭스;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    String name = "";
    int ban; // 반
    int no;  // 번호

    public Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}

public class Ex12_2_Iterator {

    // 12-7 Iterator<E>
    // - 클래스를 작성할 때, Object 타입대신 T와 같은 타입 변수를 사용
    // - 타입변수를 명시해주면 타입 변환이 필요하지 않다.

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("홍길동", 2, 1));

        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
//            Student s = (Student) it.next(); // 지네릭스를 사용하지 않으면 형변환 필요!
//            Student s = it.next();
            System.out.println(it.next().name); // 형변환을 하지 않아도 되니 코드가 줄어든다
        }
    } // main
}
