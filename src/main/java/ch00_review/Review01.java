package ch00_review;

import java.util.Scanner;

public class Review01 {
    public static void main(String[] args) {
        //System.out.println("Hello, Java!");
        //변수: 데이터를 담는 바구니, 이름표를 붙여줘요
        //변수의 선언방식: 자료형 = 데이터;
        //자료형: int, double, string, boolean 등
        //변수명 짓는 규칙: 카멜케이스 ex) myExample
        //double height = 170;
        //System.out.println(height);
        //이름, 나이, 생년월일을 적절한 자료형과 변수명으로 선언 및 초기화한 다음 sout을 통해 출력하시오
        /*
        실행 예
        제이름은 000이고, 나이는 00살입니다.
        생일은 0000 입니다.
        10년후에 저는 (00+10)살이 됩니다. 정말 싫네요.
         */
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        int birthdate = 19991121;

        System.out.println("이름을 입력하세요.>>>");
        name = scanner.nextLine();
        System.out.println("나이를 입력하세요.>>>");
        age = scanner.nextInt();
        System.out.println("생일을 입력하세요.>>>(예시 20250320)");
        birthdate = scanner.nextInt();

        System.out.println("제 이름은 "+name+"이고, 나이는 "+age+"입니다. \n" +"10년후에 저는"+(age+10)+"살이 됩니다. 정말 싫네요");


    }
}
