package coding._12_Multiple_Type_Input;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteExam04 {
    public static void main(String[] args) {
        try(
                DataInputStream in
                        = new DataInputStream(new FileInputStream("src/coding/_11_Multiple_Type_Output/multiple.txt"));
                ){

            int i = in.readInt();
            boolean b = in.readBoolean();
            float f = in.readFloat();
            double d = in.readDouble();

            System.out.println("i = " + i);
            System.out.println("b = " + b);
            System.out.println("f = " + f);
            System.out.println("d = " + d);

        } catch (Exception e){

        }
    }
}

