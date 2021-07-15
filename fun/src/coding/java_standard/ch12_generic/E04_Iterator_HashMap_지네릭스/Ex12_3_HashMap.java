package coding.java_standard.ch12_generic.E04_Iterator_HashMap_지네릭스;


import java.util.HashMap;

class Student2 {
    String name = "";
    int ban; // 반
    int no;  // 번호
    int kor;
    int eng;
    int math;

    public Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }
}

public class Ex12_3_HashMap {

    // 12-8 HashMap<K, V>
    // - 여러 개의 타입 변수가 필요한 경우, 콤마(,)를 구분자로 선언

    public static void main(String[] args) {
        HashMap<String, Student2> map = new HashMap<>(); // JDK 1.7부터 생성자의 타입지정 생략가능
        map.put("자바왕", new Student2("kim", 1, 1,  100, 100, 100));

        // public V get(Object key) => public Student get(Object key)
        Student2 s = map.get("자바왕"); // 위와 같이 V의 타입변수가 Student가 되니 (Student)로 형변환이 필요가 없다.

        System.out.println(s);
    }
}
