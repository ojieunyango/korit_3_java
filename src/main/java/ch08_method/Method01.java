package ch08_method;
/*
자바에서는 함수의 개념과 동일함. 일련의 동작을 묶어서 정의한것
입력값 (input)과 출력값(output)이 있을수도 없을수도 있음.
펑션 메소드
왜 용어를 분리하는가?
클래스 내부에 함수를 정의하게되면 이를 메서드라고함
자바의 경우는 모든 함수들이 특정 클래스에 종속되어있기때문에 다 메서드에 해당

즉, 다른언어를(python, javascript) 배우게된다면 함수의 호출 방식과 메서드 호출 방식상에서의 차이가 있기 때문에 해당 수업에서는 메서드로 통일
혹시나 제가 자바 수업중에 함수라고 얘기하면 그냥 메서드로 이해하면 됨.

호출형식
1.클래스명.메서드명()
2.객체명.메서드명() -> scanner.nextyLine(); 스트링 입력받을때
3.메서드명() -> python/javascript 배우신분은 3.이 함수냐고 질문할수도...

메서드만의 정의
특정한 코드이 묶음을 클래스내에 만드는것
메서드호출(call)
메인 메서드나 혹은 클래스의 매서드내에서 클래스명.메서드명() 혹은 객체명.메서드명()혹은 메서드명()으로 호출가능
즉, 호출을 실행으로 보셔도 현재는 무방하다.
자바상에서의 메서드
예를들어 사진을 찍느다 라는 행위에 대해서
1. 주머니에서 폰을 꺼내고
2. 잠금화면을 풀고
3.카메라를 켜고
4.사진을 찍고자 하는 대상에 폰을 조준하고
5. 셔터를 누른다

와 같은 과정이 있다고 가정햇을때 컴퓨터는 시키는대로만하기 때문에 사진을 찍기 위해서는 1-5까지의 명령어를 입력해줘야합니다

하지마 매번 그렇게 하는것은 번거로움
사진을 찍는다는 메서드 내에 1-5 의 명령어를 미리 입력해두고 순서대로 시행하룻있게끔 하는것이 메서드의 정의 및 호출

메서드 관련 용어 정리 나중에 함수에도 동일
1.메서드정의 define
사용자가 메서드를 새로만드는것을 의
2.인수 argument
사용자가 메서드에 전달한 입력(input)
3.매개변수(parameter)
argument 를 받아서 저장하는 변수명
4. 반환값/출려값/리턴값
메서드이 출력(return)
5.메서드의 호출
만들어진 혹이 미리만들어진 메서드를 실제로 사용


 */
//메서드 정의. 이번수업부턴 메인 직접입력안해도되는 클래스가 생길수있음

import javax.sound.midi.Soundbank;
import java.util.Scanner;

//1. [x|x][입력값/출력값]
public class Method01 {
    public static void call1() {
        System.out.println("[x|x]");
    System.out.println("오늘은 별찍기와 method에 대해 학습중입니다.");
}
//2.[o|x]
    public static void call2(String strExample) {
        System.out.println("[o|x]");
        System.out.println("오늘의 스케줄:" + strExample);
    } //void 는 리턴 없음...
//3.[x|o]
    public static String call3() { //return 의 자료형이 스트링임을 명시

         //call1 2 와 달리 리턴 명령어가 있음

        String result = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                result += "*";
            }
            result += "\n";

        }
        return result;
    }

    public static String call4(int year, int month, int date, String day) {
        String result = "";
    result = year + "년" + month +"월"+day+"일"+day+"요일입니다";
    return result;
    //메인에서 sout (call4(2025,3,17,"월")); 입력하시고 실행해보세요.
    }
public static int writeMyage(int age){
        int num = age;
        return num;
}
public static void writeMyage2(int age){
    System.out.println(age);
}
/*
함수형 프로그래밍 (functional programming) :
메서드1의 리턴값이 메서드2의 argument가 되고, 메서드2의 리턴값이 메서드3 argument가 되는 방식으로

첫번째 메서드로부터 마지막 메서드까지의 흐름을 통해 프로그램이 이어지는 방식을 의미함
간단 예시

 */
    public static String introduce (String name, int age){
        return "제이름은"+name+ "이고, 나이는"+age+"입니다.\n내년에 "+(age+1)+"살입니다.";
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String myName ="";
        int myAge = 0;

        System.out.println("이름을 입력하세요>>>");
        myName = scanner.nextLine();
        System.out.println("나이를 입력하세요>>>");
        myAge = scanner.nextInt();
        //이상의 코드는 scanner의 메서드 .nextInt() 를 사용하여 그 결과 값을 가각
        // myNAme, myAge 변수에 저장한 부분입니다

        System.out.println(introduce(myName, myAge));
        //그리고 이상의 코드는 115-118번 까지의 결과값들을 새로운 메서드인 introduce()의 name, age
        //매게변수에 각각 myName 및 myAge를 argument로 집어넣어서
        //introduce()메서드 내에서 데이터를 재가공하는 결과를 거치게 됩니다



        //md 파일에 작성한 3번 호출방식을 사용
//        call1();
//        call2("점심고민");//호출단계에서 ()내에 있는것은 argument
//        call3();
//        System.out.println(call3());
//        // 왜 메인단계에서 꼭 sout 써야만 하는가
//            //그냥 내부에 sout 써두면 메인단계에서 편하게 호출할수있는데...
//        System.out.println(call4(year: 205, month:3, date:17, day:"월"));

        writeMyage(38);
        writeMyage2(38);
        //104번 라인 및 105번 라인의 실행 결과 38이 한번만 나옴 -? 104번 라인이 안찍힘
        System.out.println(writeMyage(20)); //여전히 불편한 지점

        int nextAge = writeMyage(38)+1;
        System.out.println(nextAge);

//        int next nextAge2 = writeMyage2(38)+1;
//        System.out.println(nextAge2);
    }
}
