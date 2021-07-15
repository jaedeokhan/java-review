package coding.java_standard.ch12_generic.E06_제한된_지네릭_클래스_지네릭스의_제약;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() {return "Fruit";}
}

class Apple extends Fruit {public String toString() {return "Apple";}};
class Grape extends Fruit {public String toString() {return "Grape";}};
class Toy                 {public String toString() {return "Toy";}};

interface Eatable {}

public class Ex12_4 {

    // 12-9 제한된 지네릭 클래스
    // - extends로 대입할 수 있는 타입을 제한 (Ex, <T extends Fruit>
    // - 인터페이스인 경우에도 extends를 사용

    // 12-11 지네릭스의제약
    // - 타입 변수에 대입은 인스턴스 별로 다르게 가능
    // - static 멤버에 타입 변수 사용 불가 - static이 모든 인스턴스의 공통이기에 사용 불가
    // - 배열 생성할 때 타입 변수 사용불가. 타입 변수로 배열 선언은 가능
    //    - new 연산자는 뒤의 타입이 확정되어 있어야 하기에 T를 객체 생성, 배열 생성시는 안된다.

    public static void main(String[] args) {

        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//        FruitBox<Grape> grapeBox2 = new FruitBox<Apple>(); // 컴파일 에러, 참조변수의 타입변수와 생성자의 타입변수가 불일치!
//        FruitBox<Toy> toyBox = new FruitBox<Toy>(); // 당연히 Error가 난다. Fruit의 자손이 아니기에!
        Box<Toy> toyBox2 = new Box<Toy>(); // Box class에서는 모든 타입변수를 받기에 가능하다.

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
//        appleBox.add(new Grape()); // 에러, Grape는 Apple의 자손이 아니다
        grapeBox.add(new Grape());

        System.out.println("fruitBox = " + fruitBox);
        System.out.println("appleBox = " + appleBox);
        System.out.println("grapeBox = " + grapeBox);
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}
class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item);}
    T get(int i)     { return list.get(i);}
    int size()       { return list.size();}
    public String toString() { return list.toString();}
}

