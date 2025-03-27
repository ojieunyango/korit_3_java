package ch14_abstraction.interface01;
/*
interface이기 때문에 변수앞에 접근지정자를 명시하지않았지만
public final이 생략되어있음 또한 상수이기때문에 대문자로
- 인터페이스에서 안되는것들
String name; 안됨 대문자로해야함
public Press(); 인터페이스라서 생성사 생성 불가능
void popOut(){
    System.out.println("추상 메서드x 일반 메서드o");
 */
public interface Press {
    String NAME = "button";
    //되는거
    void onPressed();

    // interface인 Up.java / Down.java를 생성하시고
    // void 형태인 onUp() / onDown() 메서드를 선언하시오.


}
