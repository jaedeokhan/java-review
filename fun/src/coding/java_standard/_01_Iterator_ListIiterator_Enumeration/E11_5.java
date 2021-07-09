package coding.java_standard._01_Iterator_ListIiterator_Enumeration;

import java.util.*;

public class E11_5 {
    public static void main(String[] args) {

//        Collection은 자손은 List, Set이기에 iterator()를 사용이 가능하다.
//        Map은 iterator()가 없다. => keySet(), entrySet(), values()를 호출

//        ArrayList list = new ArrayList();
//        HashSet list = new HashSet(); // List -> Set으로 변경하면 Iterator는 동작하지만, get()은 동작하지 않는다.
        Collection c = new HashSet();
//        Collection c = new TreeSet(); // Collection은 List, Set의 부모이기에 참조변수로 받을 수 있다.
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");

        Iterator it = c.iterator();

        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        it = c.iterator(); // 1회용이여서 한 번 읽고나면 다시 얻어와야 한다.

//    get()있기에 List일때만 동작
//        for (int i = 0; i < list.size(); i++){
//            Object obj = list.get(i);
//            System.out.println(obj);
//        }


    }
}
