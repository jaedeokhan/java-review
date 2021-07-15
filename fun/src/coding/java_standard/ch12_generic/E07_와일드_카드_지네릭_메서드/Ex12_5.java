package coding.java_standard.ch12_generic.E07_와일드_카드_지네릭_메서드;

import java.util.ArrayList;

class Fruit                     { public String toString() {return "Fruit";}}
class Apple extends Fruit       { public String toString() {return "Apple";}};
class Grape extends Fruit       { public String toString() {return "Grape";}};

class Juice {
    String name;

    Juice(String name)          { this.name = name + "Juice"; }
    public String toString()    { return name; }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box){
        String tmp = "";

        for (Fruit f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
}

public class Ex12_5 {

    // 12-12 와일드 카드 <?>
    // - 하나의 참조 변수로 대입된 타입이 다른 객체를 참조 가능
    // - ArrayList<? extends Product> list = new ArrayList<Tv>(); // OK
    // - ArrayList<Product> list = new ArrayList<Tv>(); // 에러, 참조변수의 타입변수와 생성자의 타입변수의 불일치
    // - <? extends T> : 와일드 카드의 상한 제한. T와 그 자손들만 가능
    // - <? super T> : 와일드 카드 하한 제한. T와 그 조상들만 가능
    // - <?> : 제한 없음. 모든 타입이 가능 <? extends Object>와 동일

    // - 메서드의 매개변수에 와일드 카드를 사용

    // 12-14 지네릭메서드
    // - 지네릭 타입이 선언된 메서드(타입 변수는 메서드 내에서만 유효)
    // static <T> void sort(List<T> list, Comparator<? super T> c)
    // - 클래스 타입 매개변수<T>와 메서드의 타입 매개변수 <T>는 별개
    // - 메서드를 호출할 때마다 타입을 대입해야(대부분 생략 가능)
    // - 메서드를 호출할 때 타입을 생략하지 않을 때는 클래스 이름 생략 불가

    public static void main(String[] args) {

        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();

        // Fruit와 그 자손들 => Apple, Grape
        FruitBox<Apple> appleBox = new FruitBox<Apple>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());


        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));

    }
}

class FruitBox<T extends Fruit> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item);}
    T get(int i)     { return list.get(i);}
    ArrayList<T> getList() { return list;}
    int size()       { return list.size();}
    public String toString() { return list.toString();}
}