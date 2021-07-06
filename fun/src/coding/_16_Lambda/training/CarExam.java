package coding._16_Lambda.training;

import java.util.ArrayList;
import java.util.List;

public class CarExam {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("작은차", 2, 800, 3));
        cars.add(new Car("봉고차", 12, 1500, 8));
        cars.add(new Car("중간차", 5, 2200, 0));
        cars.add(new Car("비싼차", 5, 3500, 1));

//        printCarCheaperThan(cars, 2000);
//        printCar(cars, new CheckCarForBigAndNotExpensive()); // 내부 클래스 이용

//        printCar(cars, // 익명 클래스 사용하면 코드가 조금 더 짧아진다.
//                new CheckCar(){
//                    public boolean check(Car car){
//                        return car.capacity >= 4 && car.price <= 2500;
//                    }
//                });

        // 람다식 사용 => (매개변수) -> { 실행문 }
        printCar(cars,
                (Car car) -> {
                    return car.capacity >= 4 && car.price <= 2500;
                });

    }

    public static void printCarCheaperThan(List<Car> cars, int price) {
        for (Car car : cars){
            if (car.price < price){
                System.out.println(car);
            }
        }
    }

    public static void printCar(List<Car> cars, CheckCar checkCar){
        for (Car car : cars){
            if (checkCar.check(car)){
                System.out.println(car);
            }
        }
    }

    interface CheckCar{
        boolean check(Car car);
    }

    // 내부클래스
    static class CheckCarForBigAndNotExpensive implements CheckCar {
        public boolean check(Car car) {
            return car.capacity >= 4 && car.price <= 2500;
        }
    }
}
