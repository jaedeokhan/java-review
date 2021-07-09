package coding.java_standard._04_Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import static java.util.Collections.*; // Collections를 생략 가능하게한다.

public class E11_8 {

    // Collections - 컬렉션을 위한 메서드(static)을 제공
    //    - Objects, Arrays들과 비슷한 static 메소드를 가진다.
    // 1. 컬렉션 채우기, 복사, 정렬, 검색 - fill(), copy(), sort(), binarySearch()
    // 2. 컬렉션의 동기화 - synchronizedXXX()
    //    - Vector는 동기화 O
    //    - ArrayList는 동기화 X
    // 3. 변경불가(readOnly) 컬렉션 만들기 - unmodifiableXXX()
    //    - 즉 읽기전용
    // 4. 싱글톤 컬렉션 만들기 - singletonXXX()
    //    - 객체를 하나만 가지는게 싱글톤이다.
    // 5. 한 종류의 객체만 저장하는 컬렉션 만들기 - checkedXXX()
    //    - 즉 하나의 타입만 저장이 가능하다.
    public static void main(String[] args) {

        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1,2,3,4,5);
        System.out.println(list);

        rotate(list, 1); // 오른쪽으로 두칸씩 이동, 반시계방향으로 두 번 회전
        System.out.println("rotate(list, 1) : " + list);

        swap(list, 0, 2); // 첫 번재와 세 번재를 교환(swap)
        System.out.println("swap(list, 0, 2) : " + list);

        shuffle(list); // 저장된 요소의 위치를 임의로 변경
        System.out.println("shuffle(list) : " + list);

        sort(list, reverseOrder()); // 역순 정렬 reverse(list); 와 동일
        System.out.println("sort(list, reverseOrder()) : " + list);

        sort(list); // 오름차순 정렬
        System.out.println("sort(list) : " + list);

        int idx = binarySearch(list, 3); // list에 3이 위치하는 인덱스를 찾기
        System.out.println("list : " + list + " index : " + idx);

        System.out.println("list : " + list + " max = " + max(list));
        System.out.println("min(list) = " + min(list));
        System.out.println("max(list, reverseOrder()) = " + max(list, reverseOrder()));

        fill(list, 9);
        System.out.println(list);

        // list와 같은 크기의 새로운 list를 생성하고 2로 채운다.
        List newList = nCopies(list.size(), 2);
        System.out.println("newList = " + newList);

        System.out.println(disjoint(list, newList)); // list와 newList에 공통요소가 없으면 true

        copy(list, newList); // newList의 값을 list에 복사
        System.out.println("newList = " + newList);
        System.out.println("list = " + list);

        replaceAll(list, 2, 1); // list에 있는 2를 1로 모두 변경
        System.out.println("list = " + list);

        Enumeration e = enumeration(list);
//        ArrayList list2 = List(e);
//        System.out.println("list2 = " + list2);

    }

}
