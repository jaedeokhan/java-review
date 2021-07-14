package coding.java_standard.ch12_generic.E02_타입변수;

import java.util.ArrayList;

class Tv {}
class Audio {}

public class test {

    // 12-2 타입 변수
    // - 클래스를 작성할 때, Object타입 대신 타입 변수(E)를 선언해서 사용

    // 12-3 타입 변수에 대입하기
    // - 객체를 생성시, 타입 변수(E) 대신 실제 타입(Tv)을 지정(대입)
    //    - Ex) ArrayList<Tv> tvList = new ArrayList<Tv>();
    // - 타입 변수 대신 실제 타입이 지정되면, 형변환 생략가능


    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Tv());
        list.add(new Audio());

        // 제너릭을 사용하기 이전에는 Object 반환이어서 타입 캐스팅이 필요했다.
        Tv tv = (Tv) list.get(0);

        ArrayList<Tv> tvList = new ArrayList<Tv>(); // Tv타입의 객체만 저장가능
        tvList.add(new Tv());
//        tvList.add(new Audio()); // 컴파일 에러

        // 위와 같이 (Tv) 형변환이 필요가 없다.
        // 왜냐하면 타입이 일치하기에!,  ArrayList 생성시 <Tv> 타입 변수를 선언해줘서!!
        Tv genericTv = tvList.get(0);


    }
}
