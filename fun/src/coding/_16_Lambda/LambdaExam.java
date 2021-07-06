package coding._16_Lambda;

public class LambdaExam {

    public static void main(String[] args) {
        // lambda 적용 전
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("hello");
                }
            }
        }).start();

        // labmda 적용 후
        new Thread(() -> {
            for (int i = 0; i < 10; i++){
                System.out.println("hello");
            } // 여기까지 람다식 == 익명 메서드
        }).start();
    }
}
