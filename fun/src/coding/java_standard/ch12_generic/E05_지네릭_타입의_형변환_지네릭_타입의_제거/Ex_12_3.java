package coding.java_standard.ch12_generic.E05_지네릭_타입의_형변환_지네릭_타입의_제거;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() {return "Fruit";}
}

class Apple extends Fruit {public String toString() {return "Apple";}};
class Grape extends Fruit {public String toString() {return "Grape";}};
class Toy extends Fruit {public String toString() {return "Toy";}};

interface Eatable {}

public class Ex_12_3 {

    // ch-12-15 지네릭 타입의 형변환
    // - 지네릭 타입과 원시 타입 간의 형변환은 바람직 하지 않다. (경고 발생)
    // - 원시타입과 지네릭 타입을 섞어쓰지 말고 지네릭 타입으로 사용해라
    // - 와일드 카드가사용된 지네릭 타입으로는 형변환 가능
    //    - Box<? extends Object> wBox = (Box<? extends Object>) new Box<String>(); // OK, Object와 그 자손들 가능
    //    - Box<? extends Object> wBox = new Box<String>(); // 위 문장과 동일

    // 12-16 지네릭 타입의 제거 - jdk 다른 버전들과 하위 호환성 때문 -> 자바는 호환성, 안정성에 기반!
    // - 컴파일러는 지네릭 타입을 제거하고, 필요한 곳에 형변환을 넣는다.
    // - 컴파일을 하고나면 지네릭 -> 오브젝트로 변경
    //    - 1. 지네릭 타입의 경계(bound)를 제거
    //    - 2. 지네릭 타입 제거 후 타입이 불일치하면, 형변환을 추가
    //    - 3. 와일드 카드가 포함된 경우, 적절한 타입으로 형변환 추가


    public static void main(String[] args) {
        Box b = null;
        Box<String> bStr = null;

        b = (Box)bStr;          // Box<String> -> Box 가능 but 경고!
        bStr = (Box<String>)b;  // Box -> Box<String> 가능 but 경고!

        Box b2 = new Box<String>(); // 원시타입이 제너릭클래스 타입을 생성자로 받을 수 있다.
//        b2.add(new Integer(100)); // Box<String>인데도 Integer이 들어가진다. 왜나햐면 Box가 원시타입이기에!!

        // =====================================
        FruitBox<? extends Fruit> oriBox = (FruitBox<? extends Fruit>) new FruitBox<Fruit>();
        // FruitBox<Apple> -> FruitBox<? extends Fruit> - 가능
        FruitBox<? extends Fruit> appleBox = new FruitBox<Apple>(); // 좌변과 우변이 타입이 불일치해서 형변환이 필요하지만, 위와 같은 것을 생략 가능

        // FruitBox<? extends Fruit> -> FruitBox<Apple> 가능한가? - 가능
        FruitBox<Apple> testBox = (FruitBox<Apple>)appleBox; // OK, but 경고발생



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
