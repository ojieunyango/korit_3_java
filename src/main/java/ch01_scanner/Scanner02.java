package ch01_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
        문자열 입력
        next() : 띄어쓰기 포함하지않음
        nextLine() : 띄어쓰기를 포함하고 엔터키(개행) 기준으로 데이터를 입력받음

        실행 예
        이름을 입력하세요 >>> 여러분 이름
        주소를 입력하세요 >>> 주소 시 구 도 까지
        나이를 입력하세요 >>> 나이

        이름 :
        주소 :
        나이 :
        내년 나이 :
         */

        Scanner scanner = new Scanner(System.in);

//        System.out.print("이름을 입력하세요");
//        String name = scanner.nextLine();
//        System.out.println("이름:" + name);
//
//        System.out.print("주소를 입력하세요");
//        String address = scanner.nextLine();
//        System.out.println("주소:"+address);
//
//
//        System.out.print("나이를 입력하세요");
//        int age = scanner.nextInt();
//        System.out.println("나이:"+ age);
//        System.out.println("내년나이:" + (age+1));

        System.out.print("이름을 입력하세요>>>");
        String name = scanner.nextLine();

        System.out.print("주소를 입력하세요>>>");
        String address = scanner.nextLine();

        System.out.print("나이를 입력하세요>>>");
        int age = scanner.nextInt();
        System.out.println();             // 중간에 한줄 띄울려면 System.out.println(); 넣기
        System.out.println("이름:" + name);  //System.out.println("\n이름:" + name);  \n넣어서 한줄띄어도 됨
        System.out.println("주소:"+address);
        System.out.println("나이:"+ age);
        System.out.println("내년나이:" + (age+1));

        // ````




    }
}
