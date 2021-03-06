package coding._09_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam01 {
    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/coding/_09_IO/ByteExam01.java");
            fos = new FileOutputStream("src/coding/_09_IO/byte.txt");

            int readData = -1;
            while ((readData = fis.read()) != -1){
                fos.write(readData);
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            fis.close();
            fos.close();
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
