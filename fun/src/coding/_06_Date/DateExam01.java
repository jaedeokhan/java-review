package coding._06_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam01 {
    public static void main(String[] args) {

        // Date는 JDK 1.0 때 만들어져서 지역화에 대한 부분이 고려되지 않았다.
        // Calender 클래스는 지역화가 고려되어 있다.

        Date date = new Date();
        System.out.println(date.toString());

        // a or p : 오전/오후
        // zzz : KST
        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println(ft.format(date));

        System.out.println(date.getTime()); // 현재시간

        long today = System.currentTimeMillis();
        System.out.println(today);

        System.out.println(today - date.getTime()); // 걸린시간
    }
}
