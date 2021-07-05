package coding._03_Set;

import java.util.Set;
import java.util.HashSet;

public class SetExam02 {
    public static void main(String[] args){

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("a");
        set.add("b");

        System.out.println("set의 내용을 출력합니다.");
        for (String str : set){
            System.out.println("str = " + str);
        }
    }
}
