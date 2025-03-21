package ch00_review;

import java.util.Scanner;

/*
조건문
if(조건식){
실행문
}
조건식 : true false로 결정나는식
조건식이 true면 {}내의 실행문이 실행됨

전체 형식:
if(조건식){
실행문1
}else if(조건식2){
실행문2
}
}else if(조건식3){
실행문3
}
}else if(조건식4){
실행문4
}
그리고 nested if 문
if(조건식){
실행문1
   if (조건식 1-a){
       실행문 1-a
}else if(조건식 2-b){
      실행문 2-b
 }else {
      실행문 3

      7세미만 탑슬불가
      110cm 탑승불가
 */
public class Review03 {
    public static void main(String[] args) {


        int height = 0;
        int age = 0;

        // 조건문
//        if(age >= 7 ){
//            System.out.println("규정나이는 7세이상입니다.");//실행문 1-1
//            if (height>=110) {
//                System.out.println("입장이 가능합니다.");
//            }else { //height
//                System.out.println("규정키미만으로 탑승이 불가능합니다.");//실행문 1-a
//            }
//            System.out.println("감사합니다");//실행문 1-b
//            }else { //age
//            System.out.println("나이미만으로 탑승이 불가능합니다.");//실행문 1-2
//        }
        // 현재 age를 기준으로 중첩 if문이 작성되었는데 height를 기준으로 중첩 if문을 적성하시오
        // 다하신분은 논리연산자를 활용하여 다시 한번 작성하세요


        if (height >= 110) {
            System.out.println("규정 키제한이상입니다.");
            if (age >= 7) {
                System.out.println("입장이 가능합니다.");
            } else {
                System.out.println("규정 미만입니다.");
            }
            System.out.println("감사합니다.");
        } else {
            System.out.println("다음기회에...");
        }
        if (age >= 7 && height >= 110){
            System.out.println("탑승이 가능합니다.");
        }else {
            System.out.println("규정제한미만이므로 탑승이 불가능합니다.");
        }
    }
}











