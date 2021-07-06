package coding._08_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam01 {
    public static void main(String[] args){
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println("timePoint = " + timePoint);

        LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);
        System.out.println("ld1 = " + ld1);

        LocalTime lt1 = LocalTime.of(17, 18);
        System.out.println("lt1 = " + lt1);

        LocalTime lt2 = LocalTime.parse("10:15:30");
        System.out.println("lt2 = " + lt2);

        LocalDate theDate = timePoint.toLocalDate();
        System.out.println("theDate = " + theDate);
        Month month = timePoint.getMonth();
        System.out.println(timePoint.getMonth());
        System.out.println(month.getValue());


    }
}
