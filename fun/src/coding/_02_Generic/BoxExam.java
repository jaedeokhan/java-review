package coding._02_Generic;

public class BoxExam {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObj(new Object());
        Object obj = box.getObj();

        box.setObj("hello");
        String stringObj = (String) box.getObj();
        System.out.println(stringObj);

        box.setObj(1);
        int intObj = (int) box.getObj();

        // Generic은 인스턴스를 만들 때 타입을 지정하기에 위와 같이 형변환해줘야 하는 불필요한 작업을 제거해준다.
        GenericBox<Object> gBox = new GenericBox<>();
        gBox.setObj(new Object());
        Object gObj = gBox.getObj();

        GenericBox<String> gStringBox = new GenericBox<>();
//        gStringBox.setObj(3); // 컴파일 에러로 잡을 수 있다.
        gStringBox.setObj("string");
        String gStringObj = gStringBox.getObj();

        GenericBox<Integer> gIntegerBox = new GenericBox<>();
        gIntegerBox.setObj(1234);
        int gIntegerObj = gIntegerBox.getObj();


    }
}
