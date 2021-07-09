package coding.java_standard._03_Comparator_Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class E11_7 {

    // Comparaotr, Comparable
    // 객체 정렬에 필요한 메서드 (정렬기준 제공)를 정의한 인터페이스
    // Comparable : 기본 정렬기준을 구현하는데 사용
    //    - int compareTo(Object o) : 주어진 객체(o)를 자신(this)과 비교
    // Comparator : 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용
    //    - int compare(Object o1, Object o2) : 양수[왼쪽 > 오른쪽], 음수[왼쪽 < 오른쪽], 동일[왼쪽 == 오른쪽]
    public static void main(String[] args) {

        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        // 기본으로 대상정렬
        Arrays.sort(strArr); // String의 Comparable에 의한 기본 정렬
        System.out.println("strArr = " + Arrays.toString(strArr));

        // 대상, 기준정렬
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분없이 정렬 - Comparator
        System.out.println("strArr = " + Arrays.toString(strArr));

        // 대상, 기준정렬
        Arrays.sort(strArr, new Desecending()); // 역순 정렬
        System.out.println("strArr = " + Arrays.toString(strArr));
    }
}

    class Desecending implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            if (o1 instanceof Comparable && o2 instanceof Comparable){
                Comparable c1 = (Comparable)o1;
                Comparable c2 = (Comparable)o2;
                // return c2.compareTo(c1); 으로 해도 똑같은 결과를 반환한다.
                return c1.compareTo(c2) * -1; // -1을 곱해서 기본 정렬 방식의 역으로 변경한다.
                // 양수 -> 음수, 0 -> 0, 음수 -> 양수
            }
            return -1;
        }
    }

