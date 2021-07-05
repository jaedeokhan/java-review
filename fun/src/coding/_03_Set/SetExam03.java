package coding._03_Set;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetExam03 {
    public static void main(String[] args){

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");

        Iterator<String> iter = set.iterator();

        // iter에 다음값이 존재하면
        while (iter.hasNext()){
            System.out.println(iter.next()); // 다음값 출력
        }

    }

}
