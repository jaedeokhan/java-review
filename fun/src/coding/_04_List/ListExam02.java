package coding._04_List;

import java.util.List;
import java.util.ArrayList;

public class ListExam02 {

    public List<String> addArray(String[] arr1, String[] arr2){

        List<String> answer = new ArrayList<>();

        for (String str : arr1){
            answer.add(str);
        }

        for (String str : arr2){
            answer.add(str);
        }

        return answer;
    }

    public static void main(String[] args) {
        ListExam02 main = new ListExam02();
        String[] arr1 = {"kim", "han"};
        String[] arr2 = {"lee", "bal"};
        for (String ans : main.addArray(arr1, arr2)){
            System.out.println(ans);
        }
    }
}
