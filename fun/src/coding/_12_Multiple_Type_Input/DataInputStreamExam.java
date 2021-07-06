package coding._12_Multiple_Type_Input;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamExam {

    // data.txt로 부터 세 개의 정수를 가져와서 sum 변수에 더해주기

    public static void main(String[] args) {

        int sum = 0;

        try (
                DataInputStream in = new DataInputStream(new FileInputStream("src/coding/_12_Multiple_Type_Input/data.txt"));
                ){

            int i1 = in.readInt();
            int i2 = in.readInt();
            int i3 = in.readInt();
            sum += i1 + i2 + i3;

        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(sum);
    }
}
