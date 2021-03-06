package coding._13_Char_IO.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CharIOExam02 {
    public static void main(String[] args) {

        BufferedReader br = null;
        PrintWriter pw = null;

        try {
              br = new BufferedReader(new FileReader("src/coding/_13_Char_IO/file/CharIOExam02.java"));
              pw = new PrintWriter(new FileWriter("src/coding/_13_Char_IO/file/test.txt"));

              String line = null;
              while ((line = br.readLine()) != null){ // null일 때까지 실행
                  pw.println(line);
              }

        } catch (Exception e) {
            e.printStackTrace();
        } finally { // 닫아주지 않으면 파일에 저장되지 않는다.
            try {
                br.close();
                pw.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
