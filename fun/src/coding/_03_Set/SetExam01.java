package coding._03_Set;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class SetExam01 {
    // 중복이 없고 순서도 없는 자료 구조 - HashSet, TreeSet
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        boolean flag1 = set1.add("kang");
        boolean flag2 = set1.add("kim");
        boolean flag3 = set1.add("kang");

        System.out.println(set1.size());
        System.out.println("flag1 = " + flag1);
        System.out.println("flag2 = " + flag2);
        System.out.println("flag3 = " + flag3);

        Iterator<String> iter = set1.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println("str = " + str);
        }
    }
}
