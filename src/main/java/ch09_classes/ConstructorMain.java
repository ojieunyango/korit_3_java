package ch09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        //기본 생성자를 통한 객체 생성
        Constructor constructor1 = new Constructor();
        //매게변수 생성자를 통한 객체 생성
        Constructor constructor2 = new Constructor(20);
        System.out.println(constructor2.num);
        //AllArgsconstructor 를 이용해서 객체 생성
        Constructor constructor3 = new Constructor(21, "김삼");


        Constructor constructor4 = new Constructor("김사");
        System.out.println(constructor4.name);





        constructor1.showInfo();
        constructor2.showInfo();
        constructor3.showInfo();
        constructor4.showInfo();

        constructor4.num =4;
        System.out.println();
        constructor1.showInfo();
        constructor2.showInfo();
        constructor3.showInfo();
        constructor4.showInfo();

    }
}

//String title 을 매개변수로 하는 생성자를 정의하고,
//RequiredArgsConstructor(String 매개 변수를 필수로 요구하는 생성자) 라는 안내문을 출력함수있도록 작성한 뒤
//ConstructorMain 으로 가셔서 constructor4라는 객체명을 지니고  title에 여러분 이름으로 지어 객체를 생성한 후
//System.out.println(constructor4.name)을 입력하여 콘솔에 여러분 이름을 출력하십시요.