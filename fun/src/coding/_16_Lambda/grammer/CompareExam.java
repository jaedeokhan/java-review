package coding._16_Lambda.grammer;

public class CompareExam {

    // 람다식 문법 (매개변수 목록) -> { 실행문 }
    public static void exec(Compare compare){
        int k = 10;
        int m = 20;
        int value = compare.compareTo(k, m);
        System.out.println(value);
    }

    public static void main(String[] args) {
        exec((i, j) -> {
            return i - j;
        });
    }
}
