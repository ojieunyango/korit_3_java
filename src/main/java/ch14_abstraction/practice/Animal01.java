package ch14_abstraction.practice;
/*
문제 설명:
Animal이라는 추상 클래스를 만들고, 그 안에 eat()와 sleep() 메서드를 선언합니다. 각 동물의 고유한 eat()과 sleep() 동작을 구현하도록 하세요.
Vehicle이라는 인터페이스를 정의하고, drive()라는 메서드를 선언합니다. 이 인터페이스를 구현하는 Car와 Bicycle 클래스는 각각 drive() 메서드를 구현합니다. Car는 "자동차가 달린다"를, Bicycle은 "자전거가 달린다"를 출력합니다.
FlyingAnimal이라는 또 다른 인터페이스를 정의하고, fly()라는 메서드를 선언합니다. Bird와 Bat 클래스는 FlyingAnimal 인터페이스를 구현하고, 각각 "새가 난다"와 "박쥐가 난다"를 출력하도록 하세요.
SuperAnimal라는 클래스를 만들어 Animal과 FlyingAnimal을 상속받고, eat(), sleep(), fly()를 모두 구현합니다. SuperAnimal은 eat()과 sleep()을 정의할 필요 없이 Animal에서 상속받고, fly()만 구현하면 됩니다.
Main 클래스에서 Animal, Vehicle, FlyingAnimal이 모두 섞인 객체들을 다루는 예제를 작성합니다. 여러 종류의 동물, 차량, 그리고 비행 동물 객체를 만들어 적절하게 메서드를 호출하여 결과를 출력합니다.
요구 사항:
Animal 클래스: eat()와 sleep() 메서드가 기본 구현되어 있으며, 추상 클래스로 정의됩니다.
Vehicle 인터페이스: drive() 메서드가 선언된 인터페이스입니다.
FlyingAnimal 인터페이스: fly() 메서드가 선언된 인터페이스입니다.
SuperAnimal 클래스: Animal과 FlyingAnimal 인터페이스를 두 가지를 상속받습니다.
Car와 Bicycle은 Vehicle을 구현하고, Bird와 Bat은 FlyingAnimal을 구현해야 합니다.

다양한 객체들을 Main 클래스에서 생성하여 동작을 확인합니다.
예시 출력:
복사
자동차가 달린다
자전거가 달린다
생선을 먹는다
빠르게 잠을 잔다
새가 난다
박쥐가 난다

해결을 위한 단계:
Animal 클래스는 기본적인 동물의 행동을 정의합니다. eat()과 sleep() 메서드는 각 동물에서 구현되지만, 추상 메서드로 기본 행동을 정의할 수도 있습니다.
Vehicle 인터페이스는 차량의 공통적인 행동을 정의하고, Car와 Bicycle 클래스에서 이를 구현합니다.
FlyingAnimal 인터페이스는 하늘을 나는 동물들의 공통된 행동을 정의하고, Bird와 Bat 클래스에서 이를 구현합니다.
SuperAnimal 클래스는 Animal과 FlyingAnimal을 다중 상속하여 두 개의 인터페이스와 클래스를 결합한 형태로 구현합니다.
Main 클래스에서 다양한 객체들이 동작하도록 하고, 상속과 인터페이스의 특징을 활용합니다.
 */
public abstract class Animal01 implements FlyingAnimal, Vehicle {
    public void eat() {

    }

    public void sleep() {
    }
}
