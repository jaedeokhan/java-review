package coding._13_Char_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam01 {

    // 데코레이터 패턴(Decorator Pattern)
    // 객체에 추가적인 요건(기능)을 동적으로 첨가하는 방식
    // 서브클래스를 만드는 것을 통해 기능을 유연하게 확장할 수 있는 방법 제공

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 데코레이터 패턴

        String line = null;

        try {
            line = br.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(line);

    }

}
