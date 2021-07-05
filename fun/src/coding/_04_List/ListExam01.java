package coding._04_List;

import java.util.List;
import java.util.ArrayList;

public class ListExam01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("kang");
        list.add("kim");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println("str = " + str);
        }
    }

}
