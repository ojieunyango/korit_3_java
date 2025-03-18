package ch02_variable;
/*
 주석(comment) : Java 프로그램의 경우 폴더 및 파일의 전체 코드를 컴파일링하는데, 거기서 오류가 하나라도 발생하면 전체 프로그램이 실행 안됨
 하지만 주석처리를 한부분에 대해서는 컴퓨터가 코드로 인지하지 않기 때문에 오류가 발생하지 않습니다.

 즉, 주석이란 컴퓨터가 읽어서 처리하는 부분이 아니라 사람이 읽어서 정보를 얻을수 있도록하는데 있어서 의의가 있습니다.
 1) 한줄주석 : //
 2) 다중주석 : / + shift + *
 3) 사후주석 : 주석 처리할 부분의 코드 라인에 ctrl + /

 변수(variable) : 데이터를 담을수 있는 바구니
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, Java");
//        System.out.println("안녕하세요, 제이름은 양지은입니다.");
////        System.out.println("안녕하세요, 제이름은 양지은입니다.");
//        System.out.println(123);
//        System.out.println("123");
//        System.out.println(123+1);
//        System.out.println("123"+"1");
        // 변수 선언 방법
        // 자료형 변수명 = 데이터;
//        int score = 100;
//        System.out.println(score);
//        System.out.println(100);

        // 1. 논리자료형 (boolean) 변수 : 참/거짓
//        boolean checkFlag = false;
//        System.out.println(checkFlag);
//        checkFlag = true;
//        System.out.println(checkFlag);
//
//        // 이상에서 볼수있듯이 처음 변수를 언급할때에는 자료형 변수명 = 데이터;
//        // 의 형태로 작성하지만 다시 대입하는 경우에는 '변수명 = (바뀌는) 데이터;
//        // 형태로 작성함.
//
//        // checkFlage2 = true; - 얘는 checkFlag2가 처음 등장하는데
//        // 자료형이 명시되지 않았기 때문에 오류발생
//
//        boolean checkFlag3;      // 변수를 선언하는 부분: 자료형 변수명
//        checkFlag3 = true;       // 변수에 처음 값을 대입하는 것을 '초기화'라고 함
//        checkFlag3 = false;      // 변수에 값을 '재대입'

        // 2. 문자 자료형 변수 char
//        char name1 = '안';    // 문자를 입력할 때는 작은 따옴표
//        char name2 = '근';    // char : character의 축약어
//        char name3 = '수';    // 문자 =/= 문자열
//
//        System.out.println(name1+name2+name3);  //144732
//
//        System.out.println(""+name1+name2+name3);  //안근수
//
//        System.out.println(""+name2+name1+name3);

        /* 이상의 코드에서 확인할수 있는 것은 컴퓨터는 생각보다 멍청해서 개발자인 저희가 하나하나 지정을 다해줘야한다는 점.
        문자와 문자열이 서로 다른 개념인데, 문자(하나짜리)를 세번 더했을 경우 더이상 문자가 아니라 문자열로 인식되기 때문에 원하는 방식대로
        출력이 되지않습니다.

        그렇기 때문에 저희는 sout()의 () 안에 "" 를 넣어줌으로써 () 안의 부분이 전체 문자열로 인식되게끔 꼼수를 부린 부분이 58번 라인에
        해당합니다. 여기서 알수있는 점은 sout()의 가장 먼저 나온 데이터의 자료형을 따라간다는 점입니다.
         */

        // 3. 정수 자료형 변수 (int)
//        int width1 = 100;
//        int width2 = 200;
//
//        System.out.println(width1 + width2);   // 숫자끼리는 연산 가능
//
//        String width3 = "300";
//        String width4 = "400";
//
//        System.out.println(width3 + width4);  //300400
//
//        System.out.println(width1 + width3);   // 정수 + 문자열 = 100300
//        System.out.println(width4 + width2 );   // 문자열 + 정수 = 400200 *  스트링만 첫대문자
//
//        // 4. 실수 자료형 double
//
//        double pi = 3.1415926623;
//
//        String a = "오늘은 첫수업";
//
//        System.out.println(19*pi);

        // 지름이 42인 원의 넓이를 구하시요.

        // 반지름의 제곱 * pi

//        System.out.println(21*21*pi);
//        System.out.println((42/2)*(42/2)*pi);
//
//        // 반지름이 17인 원의 둘레를 구하시오
//        // 지름*pi
//
//        System.out.println(17*2*pi);

        /*
        Java에서의 변수 표기 방식:
           1. 카멜 표기법 (camel case)를 사용함
            : 첫문자는 소문자로 시작/ 복수의 단어로 이루어졋을 경우
            두번째 단어의 첫문자만 대문자
            ex) 한단어: result
            ex) 두단어: myTestResult

           2.특수문자 지양

           cf) 파이썬 학습하신 분들은 파이썬의 변수 표기 방식은 Snake case라고해서 my_test_result와 같은 방식으로 표기

         */

    // 5. 문자열 자료형 String
        //아까 언급한거처럼 대문자로 시작하는 특이점
        String name ="안근수";
        String major ="영어교육과";
        String job = "강사";

        System.out.println(name);
        System.out.println(major);
        System.out.println(job);

        System.out.println("안녕하세요. 제이름은"+name+"이고"+major+"출신입니다");
        System.out.println("제 직업은 현재"+job+"입니다");


        //연습
        String name1 = "양지은";
        int age1 =38;
        String major1="제품디자인";
        String mbti1="ISTJ";

        System.out.println("저는 코리아 IT 3월 국비과정을 수강하고있는"+name1+"입니다"+age1+"살입니다");
        System.out.println("\t전공은"+major1+"학과이며, MBTI는"+ mbti1+"입니다. 열심히 할게요!");



    }
}
