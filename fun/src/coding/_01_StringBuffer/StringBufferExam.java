package coding._01_StringBuffer;

import java.util.Random;

public class StringBufferExam {

    public String randomName() {
        StringBuffer name = new StringBuffer();
        String[] firstNames = {"Tod", "John", "Michael"};
        String[] lastNames = {"Smith", "Brown", "Davis"};

        // 0 ~ 2 사이의 임의의 랜덤 숫자로 firstName
        int randomFirstNameNumber = new Random().nextInt(firstNames.length);
        String randomFirstName = firstNames[randomFirstNameNumber];

        // 0 ~ 2 사이의 임의의 랜덤 숫자로 lastName
        int randomLastNameNumber = new Random().nextInt(lastNames.length);
        String randomLastName = lastNames[randomLastNameNumber];


        return name.append(randomFirstName).append(" ").append(randomLastName).toString();
    }

    public static void main(String[] args){
        StringBufferExam main = new StringBufferExam();
        System.out.println("랜덤 이름은 => " + main.randomName());
    }

}
