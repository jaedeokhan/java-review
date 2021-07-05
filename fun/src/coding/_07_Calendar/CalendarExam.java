package coding._07_Calendar;

import java.util.Calendar;

public class CalendarExam {

    // Date의 지역화를 지원하지 않는
    // 문제를 해결하기 위한 클래스가 Calender
    // Calender는 변수는 static 즉, 상수로 많이 이루어져 있다.

    public static void main(String[] args) {
        // Calendar는 추상 클래스다.
        // 추상클래스는 미완성된 메소드를 가지는 클래스이기에 new로 인스턴스화를 진행하지 못한다.
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH )+1); // 7월인데 6으로 나온다. 즉 1월 ~12월을 0 ~ 11로 한다.
        System.out.println(cal.get(Calendar.DATE));

        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 13시이면 13시로 나온다.
        System.out.println(cal.get(Calendar.MINUTE));

        cal.add(Calendar.DATE, 100);

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH )+1); // 7월인데 6으로 나온다. 즉 1월 ~12월을 0 ~ 11로 한다.
        System.out.println(cal.get(Calendar.DATE));

        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 13시이면 13시로 나온다.
        System.out.println(cal.get(Calendar.MINUTE));

    }
}
