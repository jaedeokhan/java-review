package coding.java_standard.ch12_generic.E03_지네릭스용어_지네릭_타입과_다형성;

import java.util.ArrayList;
import java.util.List;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class Ex01 {


    // 12-4 지네릭스 용어
    // Box<T> : [지넥릭 클래스] 'T의 Box' 또는 'T Box'라고 읽는다.
    // T : 타입 변수 또는 타입 매개변수. (T는 타입 문자)
    // Box : [원시 타입](raw type)

    // 대입된 타입(매개변수화된 타입, parameterized type)
    // Box<String> b = new Box<String>();

    // 12-5 지네릭 타입과 다형성
    // - 참조 변수와 생성자의 대입된 타입은 일치해야 한다.
    // 즉, 타입 변수간은 부모관계도 안되고 일치해야 한다.
    // ArrayList<Tv> list = new ArrayList<Tv>(); // OK, 일치
    // ArrayList<Product> list = new ArrayList<Tv>(); // 에러 불일치

    // - 지네릭 클래스간의 다형성은 성립.(여전히 대입된 타입은 일치해야)
    // List<Tv> list = new ArrayList<Tv>(); // OK, 다형성, ArrayList가 List를 구현
    // List<Tv> list = new LinkedList<Tv>(); // OK, 다형성, LinkedList가 List를 구현

    // - 매개변수의 다형성도 성립
    // ArrayList<Product> list = new ArrayList<Product>();
    // list.add(new Product());
    // list.add(new Tv()); // OK - Product의 자손도 ok
    // list.add(new Audio()); // OK - Product의 자손도 ok

    public static void main(String[] args) {

        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList1 = new ArrayList<Tv>();
//        ArrayList<Product> tvList2 = new ArrayList<Tv>(); // 에러
        List<Tv> tvList3 = new ArrayList<Tv>(); // Ok, 다형성

        productList.add(new Tv());
        productList.add(new Audio());

        tvList1.add(new Tv());
        tvList1.add(new Tv());
//        tvList1.add(new Audio()); // TvList에 Audio는 당연히 못 넣는다.

        printAll(productList);
    }

    public static void printAll(ArrayList<Product> list){ // ArrayList<Product>에는 당연히 new ArrayList<Tv>;를 넣지 못한다.
        // 왜냐하면, 참조변수와 생성자의 타입 변수는 동일해야한다!!
        for (Product p : list){
            System.out.println(p);
        }
    }
}
