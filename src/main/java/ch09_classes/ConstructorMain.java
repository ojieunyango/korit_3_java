package ch09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        //기본 생성자를 통한 객체 생성
        Constructor constructor = new Constructor();
        //매게변수 생성자를 통한 객체 생성
        Constructor constructor2 = new Constructor(20);
        System.out.println(constructor2.num);

    }
}

