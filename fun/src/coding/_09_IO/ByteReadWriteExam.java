package coding._09_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteReadWriteExam {
    public static void main(String[] args) {
        // byte.txt의 내용을 그래도 읽어서 copy.txt로 복사하기
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/coding/_09_IO/byte.txt");
            fos = new FileOutputStream("src/coding/_09_IO/copy.txt");

            int readData = -1;
            while ((readData = fis.read()) != -1){ // fis 에서 -1이면 byte 데이터가 x
                fos.write(readData);
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                fis.close();
                fos.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
