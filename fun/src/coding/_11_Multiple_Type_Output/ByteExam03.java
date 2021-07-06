package coding._11_Multiple_Type_Output;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteExam03 {
    public static void main(String[] args) {
        try (
                // try의 뒤에 나오는 괄호() 사이에서 만든 stream은 별도로 close()하지 않아도 된다.
                DataOutputStream out = new DataOutputStream(new FileOutputStream("src/coding/_11_Multiple_Type_Output/multiple.txt"));
            ){

            out.writeInt(100);
            out.writeBoolean(true);
            out.writeFloat(3.14F);
            out.writeDouble(50.5);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
