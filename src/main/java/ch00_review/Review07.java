package ch00_review;

import java.util.Scanner;

/*
클래스=설계도
클래스 내부에는 속성(필드/멤버변수/인스턴스변수)/ 행위 메서드
 */
class Developer {
    //필드선언
    String name;
    boolean window;
    boolean java;
    boolean python;
    int career;
    String company;

    // 생성자 정의 : 원래 기본 생성자는 default로 있음
    void introduce() {

        Developer developer1 = new Developer();
        developer1.name = "양지은";
        developer1.window = true;
        developer1.company = "Korea IT academy";
        developer1.career = 3;
        developer1.java = true;
        developer1.python = false;
    }
}

public class Review07 {
    /*
    이름
    window PC 소유여부 yes
    company
    career
    java
    python

    전부 다 메인 단계에서 작성하시오
    이름
    윈도우
    회사
    자바
    파이썬

    속성값을 대입하려면 어떻게 해야할까요?
    작성하고 콘솔창에
    안녕하세요 제이름은 000 입니다
    현재 저는 000 에서 일하고 있으며

    인 상황입니다 열심히하겠습니다
     */
    public static void main(String[] args) {

        Developer developer1 = new Developer();
//        developer1.name="양지은";
//        developer1.window=true;
//        developer1.company="Korea IT academy";
//        developer1.career=3;
//        developer1.java=true;
//        developer1.python=false;


        System.out.println("안녕하세요. 내이름은 " + developer1.name + "입니다. 현재 저는 " + developer1.company + "근무주입니다. 현재 " + developer1.career + "년차입니다.");
        System.out.println("window PC: " + developer1.window);
        System.out.println("java: " + developer1.java);
        System.out.println("python: " + developer1.python);


    }

}
