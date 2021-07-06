package coding._08_Time;

import java.time.LocalDateTime;
import java.time.Month;

public class TimeExam02 {
    public static void main(String[] args) {

        // 지금이 몇 월인지 영어로 출력
        LocalDateTime timePoint = LocalDateTime.now();
        Month month = timePoint.getMonth();

        System.out.println(month);
    }
}
