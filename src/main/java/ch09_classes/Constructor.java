package ch09_classes;

import java.util.SortedMap;

/*
생성자 개념(constructor)
   생성자는 객체가 생성될때 호출되는 특별한 메서드
   클래스명      객체명 = new ClassExample();
ClassExample example = new ClassExample();
: 사실 new ClassExample()가 생성자였습니다. ClassExample 대문자로 시작
특징:
1. 클래스 이름과 생성자 이름은 동일하다
(다른 메서드들과 달리 대문자로 시작한다)
2. return 값이 없다 -> call1(), call2() 유형으로 볼수있다.
3. 객체 초기화 : 생성자는 객체의 필드(속성) 초기화를 담당한다

생성자의 정의 방식
1. 기본생성자 : 매게 변수가 없는 생성자
(사실 클래스를 만들때 default로 생성되어 정의 하지 않을때도 있음
ClassA, Car에서 기본 생성자를 정의하지않고 ClassAMain, CarMain에서 객체를 생성해봤습니다 -> 복습해야함
2. 매개변수 생성자 : 하나이상의 매개변수를 가지는 생성자
 */
public class Constructor {
    //필드선언
    int num;
    String name;

    //기본생성자 정의-> 직접하면 call1()유형과 같은 형태 [x|x]
    Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }
//매게변수 생성자 -> 기본적으로 만들어지지않습니다. 개발자가 정의해야함
        //근데 그경우에는 기본생성자와 매게 변수 생성자를 둘다 쓰고 싶다면 기본생성자도 정의해야함
    Constructor(int number){
        System.out.println("RequiredArgsConstructor(int 매게변수를 필수로 요구하는 생성자)");
        this.num = number; //  this: 해당 클래스에서 객체를 만들게되면 객체이름으로 대체됨. 임시적으로 붙여주는 키워드
    }
    //String title 을 매개변수로 하는 생성자를 정의하고,
    //RequiredArgsConstructor(String 매개 변수를 필수로 요구하는 생성자) 라는 안내문을 출력함수있도록 작성한 뒤
    //ConstructorMain 으로 가셔서 constructor4라는 객체명을 지니고  title에 여러분 이름으로 지어 객체를 생성한 후
    //System.out.println(constructor4.name)을 입력하여 콘솔에 여러분 이름을 출력하십시요.

    //두개이상의 매개변수를 지니는 생성자
    Constructor(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("AllArgsConstructor(int, String 매개변수 전체를 요구하는 생성자");
    }

        Constructor(String title) {
            this.name = title;
            System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)");

        }
        // method 정의
        void showInfo(){
            System.out.println("이 객체의 num값 : "+num);
            System.out.println("이 객체의 name값 : "+name);
        }
    }

