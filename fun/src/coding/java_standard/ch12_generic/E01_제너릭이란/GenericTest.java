package coding.java_standard.ch12_generic.E01_제너릭이란;

import java.util.ArrayList;

public class GenericTest {

    // 지네릭스(Generics)란?
    // - 컴파일시 타입을 체크해 주는기능(compile-time type check) - JDK 15
    // - 객체의 타입 안정성을 높이고 형변환의 번거로움을 줄여줌

    // Exception
    // - Runtime Error보다는 Compile Time Error가 나는게 낫다. 실행 시 에러가 나면 프로그램이 종료된다.
    // 어떻게 하면 런타임의 에러를 컴파일 에러로 가져올 수 있을까? => ClassCaseException은 지네릭으로 해결

    // String str1 = null, String str2 = "";
    // 두 개중에 더 나은 코드는?
    // str1.length()를 하면  null.length()이기에 NullPoint 에러
    // str2.length()를 하면 "".length() 0가 나온다.

    // 배열도 마찬가지!
    // Object[] obj1 = null, (Object[] obj2 = new Object[0]; || Object[] obj2 = {};)
    // 실행중에 널포인터 에러가 덜 발생하게 하려고 이렇게 작성한다!!

    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // JDK 1.5이전 요렇게 사용 - 일반 클래스
        list.add(10);
        list.add(20);
        list.add("30"); // String도 가능 - ArrayList<>타입을 정해주지 않아서 다른 자료형도 가능

        // ClassCastException - 형변환 에러
//        Integer i = (Integer) list.get(2); // 컴파일 시는 에러가 없다. 그러나 런타임 시 에러!!
        // Object -> Integer 변환하면 컴파일 시 문제가 없기에 컴파일 에러의 한계이다.
        // 실행 시 발생에러를 어떻게 컴파일 에러로 끓어 올 수 있을까? => Generic

        System.out.println(list);

        ArrayList<Integer> integerList = new ArrayList<>(); // JDK 1.5이후 요렇게 사용 - 지네릭클래스
        integerList.add(10);
        integerList.add(20);
//        integerList.add("30"); // 당연히 컴파일 에러가 난다.

        // 제너릭을 사용하지 않으면 원래는 형변환을 해줘야 하지만,
        // ArrayList 선언시 <Integer> 제너릭을 만들어 주기에 그냥 불러오면 된다.
        // 지네릭스 덕분에 타입 체크가 강화된다!!
        Integer i2 = integerList.get(1);
        System.out.println(i2);

        ArrayList<Object> oldList = new ArrayList<Object>();
        oldList.add(10);
        oldList.add(20);
        oldList.add("30");

        // 옛날처럼 형변환해서 사용하려면 <Object>형으로 선언 후 캐스팅하면 된다.
        String i3 = (String) oldList.get(2);
        System.out.println(i3);
    }
}
