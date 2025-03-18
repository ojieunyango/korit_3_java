package ch06_condition;

import java.util.Scanner;

/*
중첩 if(nested if condition sentence)
if 문내에 if문이 연속적으로 작성될수있습니다

형식:
if(조건식1) {
실행문1
if (조건식1-a){
실행문 1-a
}else if (조건식 1-b){
실행문 1-b
} else {
실행문 1-c
} else if(조건식2) {
실행문2
if(조건식2-a){
실행문2
if(조건문2- a){
실행문2-a
}else {
실행문2-b
} else {
실행문3
 */
public class Condition06 {
    public static void main(String[] args) {
        /*
        사용자에게 score를 입력받아 다음과 같은 조건을 만족시키도록 작성하시요.

        score가 0보다 작거나 100 초과라면 grade는 x
        score 90 ~ 100 = A
        score 80 ~ 90 = B
        score 70 ~ 80 = C
        score 60 ~ 70 = D
        score 50 ~ 59 = E

        실행 예 #1
        점수를 입력하세요 >>> -10
        입력한 점수는 -10점 이면 학점은 X 학점입니다

        실행 예 #2
        점수를 입력하세요 >>> 92
        입력한 점수는 92점 이면 학점은 A학점입니다.


        1. Scanner import
        2. int score 선언 및 초기화
        3. String grade 선언 및 초기화
        4. scanner 입력받기위한 안내문 작성

         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("점수를 입력하세요>>>");
//        int final = scanner.nextInt();
//        String score = "";

//        final score ( score <= 90 && score >= 100) = A;
//        final score ( score <= 80 && score >= 90) = B;
//        final score ( score <= 70 && score >= 80) = C;
//        final score ( score <= 60 && score >= 70) = D;
//        final score ( score <= 0 && score >= 59) = F;
//
//
//        if(score < 0 || score > 100 ) {
//            score = "X";
//        }else if (score <= 90 && score >= 100){
//            score = A;
//        }else if (score <= 80 && score >= 90){
//            score = B;
//        }else if (score <= 70 && score >= 80){
//            score = C;
//        }else if (score <= 60 && score >= 70){
//            score = D;
//        }else if (score <= 0 && score >= 59){
//            score = F;
//        }
//        System.out.println("입력한 점수는 " + final + "점이며 학점은 " + score + "학점입니다.");

        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade ="";
        System.out.println("점수를 입력하세요>>>");
        score = scanner.nextInt();

//        if (score < 0) {
//            grade ="X";
//        } else { // 조건은 grade >= 0 이 됩니다.
//            if (score > 100) {
//                grade = "X";
//            } else {
//                if (score > 90) {
//                    grade = "A";
//                } else if (score > 80) {
//                    grade = "B";
//                } else if (score > 70) {
//                    grade = "C";
//                } else if (score > 60){
//                    grade = "D";
//                } else { // 그럼 이제 여기의 조건은  score>= 0 && score < 60
//                    grade = "F";
//                }
//                System.out.println("입력한 점수는 " + score + "점이며 학점은 " + grade + "학점입니다.");


// 논리 연산자를 사용한 if 문
//100 초과 및 0 미만을 거르는 조건문 작성

        if (score > 100 || score < 0) {
            grade ="X";
        } else { // 조건은 grade >= 0 이 됩니다.
            if (score > 100) {
                grade = "X";
            } else {
                if (score > 90) {
                    grade = "A";
                } else if (score > 80) {
                    grade = "B";
                } else if (score > 70) {
                    grade = "C";
                } else if (score > 60) {
                    grade = "D";
                } else { // 그럼 이제 여기의 조건은  score>= 0 && score < 60
                    grade = "F";
                }
                System.out.println("입력한 점수는 " + score + "점이며 학점은 " + grade + "학점입니다.");
            }
        }
    }
}

