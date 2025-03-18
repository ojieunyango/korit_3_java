package ch09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        //클래스 이름에 메인 넣으면 메인을 쓰는걸로 생각하면 됨...
        //ClassA를 import - 클래스명 객체명 = new 클래스명();
        ClassA classA = new ClassA(); //같은 패키지에 있으면 임포트문 안뜸..
        // 스캐너 임포트도 클래스임. 변수에 다른거 적어도 되는데 모두가 알수잇게 스캐너로 쓰는 암묵적 약속
        //스캐너가 변수라고 했지만 사실은 객체이다
        //정확하게는 스캐너 클래스의 인스턴스였다
        Scanner scanner = new Scanner(System.in);
        //객체의 속성을 참조하는 법 : 객체명, 속성명
//        System.out.print("이름을 입력하세요.>>>");
//        classA.name = scanner.nextLine();
        //객체 생성 -> 이름/ 점수/ 번호를 입력하도록 하겠습니다.
        /*
        1. classA이라는 객체를 생성하고
        2.scanner 를 통해 이름에 여러분 이름
        3. 점수에 100점
        4. num 20250001 을 입력

        실행 예
        이름을 입력하세요>>>
        점수르 입력하세요>>>
        번호를 입력하세요>>>
         */
//        System.out.print("점수를 입력하세요.>>>");
//        classA.score = scanner.nextInt();
//
//        System.out.print("번호를 입력하세요.>>>");
//        classA.num = scanner.nextInt();
//
//
//        System.out.println(classA.name+"입니다.");
//        System.out.println(classA.score+"입니다.");
//        System.out.println(classA.num+"입니다.");

/*
실행결과
20250001 - 이름 : 여러분이름, 점수는 100점입니다.
 */
//객체생성
//        ClassA classA1 = new ClassA(); //ClassA ClassA()두개는 다른거임 나중에 설명
//        System.out.print("이름을 입력하세요.>>>");
//        classA1.name = scanner.nextLine();
//        System.out.print("점수를 입력하세요.>>>");
//        classA1.score = scanner.nextDouble();
//        System.out.print("번호를 입력하세요.>>>");
//        classA1.num = scanner.nextInt();
//
//        System.out.println("실행결과");
//        System.out.println(classA1.num+"-이름: "+ classA1.name+"점수는 " + (int)classA1.score+"입니다.");

        // 지금까지의 코드는 객체의 속성에 값을 대입하고 이를 출력하는 방버

        //method 호출
        ClassA classA2 = new ClassA();
        classA2.name = "김이";
        classA2.callName();
        ClassA classA3 = new ClassA();
        classA3.name = "이삼";
        classA3.callName();


    }
}