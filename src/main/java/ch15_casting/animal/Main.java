package ch15_casting.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.fetch();

        Animal animal = dog;  //upcasting #1 상속이되어있지않으면 업캐스팅 불가능
        animal.makeSound(); //개가 짖습니다 출력 재정의된 메서드호출됨
       // animal.fetch(); 호출불가- 애니몰은 도그클래스이 객체가 아니니깐
        dog.fetch(); // 도그를 애니몰에 대입햇다고 도그가 사라지는건 아님

        Animal animal1= new Dog(); //업케스팅 #2 *시험에 자주 나옴
        animal1.makeSound(); // 개가짖습니다 재정의된 메서드 호출

        Animal animal2 = new Animal();
        animal2.makeSound(); // 동물의 소리를 냅니다.
        //instanceof 연산자 사용 사례
        boolean result1 = animal instanceof Animal;
        System.out.println(result1);  //true
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);  //true

        // object가 인스턴스이거나 "하위 클래스의 인스턴스인 경우"
        boolean result3 = dog instanceof Dog;
        System.out.println(result3);  //true
        boolean result4 = dog instanceof Animal;
        System.out.println(result4);  //true

        System.out.println("------animal1는 animal와 사실상 같기때문에 animal3를 검증합니다");
        boolean result5 = animal2 instanceof Animal;
        System.out.println(result5);  //true
        boolean result6 = animal2 instanceof Dog;
        System.out.println(result6);  //false

        /*
        다운캐스팅은 명시적으로 이루어져야합니다.
        (클래스명)객체명; (int)2,3
        참조자료형까지 고려해야함
         */
        Dog dog1 = (Dog) animal1; // 다운캐스팅방법
        dog1.makeSound();
        dog1.fetch(); // animal1은 애니멀 클래스에 종속때문에 dog 고유메서드에서 사용불가능 지금은 대놓고 도그 클래스 객체이기때문 featch 사용가능
        // dog2.makeSound(); 오류발생
        // 문제점 : 다운캐스팅은 되었는데 하고나서 오류발생
        /*
        animal2 생성할때 animal클래스이 생성자를 호출해서 만들었기 때문 다운캐스팅이 불가능함
         */
        Animal animal3 = new Dog();
        /* 형태로 선언된 클래스와 호출되는 생성자가 서로 달라야하만 합니다
        그렇다면 animal2 사례에서 같은 오류 발생을 막기위한 다운캐스팅은 instanceof 연산자를 통한 조건식을 작성함으로써 이루어질수있음
         */
        System.out.println("animal3 검증파트");
        if(animal3 instanceof Dog){
            Dog dog3 =(Dog) animal3;

            dog3.makeSound();
            dog3.fetch();
        }
        System.out.println(" 안전한 다운캐스팅 도전");
        if (animal2 instanceof Dog){
            Dog dog2 = (Dog) animal2;

            dog2.makeSound();
            dog2.fetch();
        }else {
            System.out.println("불가능한 다운캐스팅입니다");
        }
    }
}
