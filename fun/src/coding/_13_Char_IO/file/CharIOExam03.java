package coding._13_Char_IO.file;

import java.io.FileWriter;
import java.io.PrintWriter;

public class CharIOExam03 {

    // "안녕하세요. PrintWriter입니다." 문장을 data.txt에 저장하기

    public static void main(String[] args) {

        String answer = "안녕하세요. PrintWriter입니다.";
        try (
            PrintWriter pw = new PrintWriter(new FileWriter("src/coding/_13_Char_IO/file/data.txt"));
            ) {

            pw.println(answer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
