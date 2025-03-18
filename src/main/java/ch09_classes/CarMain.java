package ch09_classes;

/*
CarMain 클래스 생성
Car의 인스턴스인 myCar라는 객체를 생성하시오.
color에 빨강 대입, speed에 160대입
yourCar 객체 생성하시오
color에 노랑대입 speed 180 대입
myCar 는 drive()메서드 호출
yourCar는 brake()메서드 호출
myCar, yourCar에 각각 displayInfo()메서드 호출하시오
 */
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //객체 생성 (클래스명 객체명 = new 클래스명();
        Car car = new Car();
        Car myCar = new Car();
        Car yourCar = new Car();

        //myCar / yourCar에 각각 대입 (객체명.속성명 = 대입할 데이터 값;
        myCar.color = "빨강";
        myCar.speed = 160;

        yourCar.color = "노랑";
        yourCar.speed = 180;


        //지시사항에 있던 메서드들을 호출

        myCar.drive();
        yourCar.brake();
        myCar.display_info();
        yourCar.display_info();

    }
}
