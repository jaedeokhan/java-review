package coding.java_standard.ch12_generic.E08_열거형;

//                0      1      2     3
enum Direction { EAST, SOUTH, WEST, NORTH }

public class Ex12_6 {

    // 12-17 열거형(enum)
    // - 관련된 상수들을 같이 묶어 놓은 것. Java는 타입에 안전한 열거형을 제공
    //    - 값 & 타입 둘 다 체크를 한다
    //    - if (Card.ClOVER == Card.TWO) // true지만 false이여야 의미상 맞다
    //    - if (Card.Kind.CLOVER == Card.Value.TWO) // 컴파일 에러, Kind와 Value의 타입이 달라서 비교 불가

    // 12-18 열거형의 정의와 사용법
    // - 열거형을 정의하는 방법 => enum 열거형이름 { 상수명1, 상수명2, ... }
    // - 열거형 타입의 변수를 선언하고 사용하는 방법
    // - 열거형 상수의 비교에 ==(등가비교)와 compareTo() 사용가능, 비교 연산자는 사용불가해서 compareTo() 사용

    // 12-19 열거형의 조상 - java.lang.Enum
    // - 모든 열거형은 Enum의 자손이며, 아래의 메서드를 상속받는다
    // - values(), valueOf()는 컴파일러가 자동으로 추가

    public static void main(String[] args) {

        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("d1 == d2 ? " + (d1 == d2));
        System.out.println("d1 == d3 ? " + (d1 == d3));
        System.out.println("d1.equals(d3) ? " + d1.equals(d3));
//        System.out.println("d1 > d3" + (d1 > d3)); // 에러, 객체라서 불가!
        System.out.println("d1.compareTo(d3) ? : " + (d1.compareTo(d3)));
        System.out.println("d2.compareTo(d2) ? " + (d1.compareTo(d2)));


        switch (d1) {
            case EAST: // Direction.EAST라고 쓸 수 없다.
                System.out.println("The Direction is EAST."); break;
            case SOUTH:
                System.out.println("The Direction is SOUTH."); break;
            case WEST:
                System.out.println("The Direction is WEST"); break;
            case NORTH:
                System.out.println("The Direction is NORTH"); break;
            default:
                System.out.println("Invalid direction"); break;
        }

        Direction[] dArr = Direction.values();

        for (Direction d : dArr){
            System.out.printf("%s=%d%n", d.name(), d.ordinal()); // 이름, 순서
        }
    }
}
