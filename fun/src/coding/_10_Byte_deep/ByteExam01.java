package coding._10_Byte_deep;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam01 {

    // 512 byte 씩 읽어 들이기

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/coding/_09_IO/ByteExam01.java");
            fos = new FileOutputStream("src/coding/_09_IO/byte.txt");

            int readCount = -1;
            byte[] buffer = new byte[512]; // 512 byte로 배열 생성

            // 1byte씩 가져올때보다 수행시간이 더 빠르다.
            while ((readCount = fis.read(buffer)) != -1){
                fos.write(buffer, 0, readCount);
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
