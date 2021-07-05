package coding._01_StringBuffer;

public class StringBufferPerformanceTest {

    // String과 StringBuffer의 성능 차이 비교

    public static void main(String[] args) {

            long startTimeOfString = System.currentTimeMillis();

            String str = "";
            for (int i = 0; i < 10000; i++){
                str += "*";
            }

            long endTimeOfString = System.currentTimeMillis();
            long durationOfString = endTimeOfString - startTimeOfString;


            // StringBuffer
            long startTimeOfStringBuffer = System.currentTimeMillis();

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 10000; i++){
                sb.append("*");
            }

            long endTimeOfStringBuffer = System.currentTimeMillis();
            long durationOfStringBuffer = endTimeOfStringBuffer - startTimeOfStringBuffer;

            System.out.println("String 측정 시간 : " + durationOfString);
            System.out.println("StringBuffer 측정 시간 : " + durationOfStringBuffer);

    }
}
