package ch06_condition;

import java.util.Scanner;

/*
if - else if문: if - else문과 달리 else if 에는 별도의 조건문이 요구됨

형식:
if(조건식1){
   실행문1
   } else if(조건식2) {
   실행문2
   }else if(조건식3) {
   실행문3
   }
 */
public class Condition03 {
    public static void main(String[] args) {
        // 1. Scanner 클래스를 import
        Scanner scanner = new Scanner(System.in);

        // 2. 변수 및 상수의 선언 및 초기화
        int point = 0;
        final int VIP_point = 80;
        final int GOLD_point = 60;
        final int SILVER_point = 40;
        final int BRONZEN_point = 20;
        //2의 추가부부을 통해 코드 효율화
        String rating = "";

        // 콘솔에 찍히기 시작하면서 프로그램 시작
        System.out.println("회원 포인트를 입력하세요>>>");
        //포인트 변수에 데이터를 재대입
        point = scanner.nextInt();

        //수업내용관련 조건문 작성

//        if (point > 80) {
//            System.out.println("회원의 등급 : VIP");
//        } else if (point > 60) {
//            System.out.println("회원의 등급 : GOLD"); // 실버 브론즈 일반등급으로 else if 문을 완성하시오
//        }else if (point > 40) {
//            System.out.println("회원의 등급 : SILVER");
//        }else if (point > 20) {
//            System.out.println("회원의 등급 : BRONZE");
//        }else if (point <= 20) {
//            System.out.println("회원의 등급 : 일반");
//        }

//        if (point > VIP_point) {
//            System.out.println("회원의 등급 : VIP");
//        } else if (point > GOLD_point) {
//            System.out.println("회원의 등급 : GOLD"); // 실버 브론즈 일반등급으로 else if 문을 완성하시오
//        }else if (point > SILVER_point) {
//            System.out.println("회원의 등급 : SILVER");
//        }else if (point > BRONZEN_point) {
//            System.out.println("회원의 등급 : BRONZE");
//        }else if (point <= BRONZEN_point) {
//            System.out.println("회원의 등급 : 일반");
//            //두가지방법중 두번째가 더 선호됨
//        }

        if (point > VIP_point) {
            rating = "VIP";
        } else if (point > GOLD_point) {
            rating = "GOLD";
        } else if (point > SILVER_point) {
            rating = "SILVER";
        } else if (point > BRONZEN_point) {
            rating = "BRONZEN";
        } else if (point <= BRONZEN_point) {
            rating = "일반";
        }


    }
}



