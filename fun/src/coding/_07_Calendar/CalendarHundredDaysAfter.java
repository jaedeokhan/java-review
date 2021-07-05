package coding._07_Calendar;

import java.util.Calendar;

public class CalendarHundredDaysAfter {
    public String hundredDaysAfter(){

        //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
        StringBuffer answer = new StringBuffer();
        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.DATE, 100); // 100일 뒤로
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; // 월은 1월 ~ 12월이 0 ~ 11로 표현되기에 + 1해준다.
        int day = cal.get(Calendar.DATE);

        return answer.append(year).append("년").append(month).append("월").append(day).append("일").toString();
    }

    public static void main(String[] args) {
        CalendarHundredDaysAfter main = new CalendarHundredDaysAfter();
        System.out.println(main.hundredDaysAfter());
    }
}
