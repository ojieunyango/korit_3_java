package ch06_condition;

import java.util.Scanner;

/*
사용자에게 score를 입력받아 다음과 같은 조건을 만족시키도록 작성하시요

score가 0 미만이거나 100 초과라면 grade = X
chagedScore = 9~ 10, grade = A
chagedScore = 8, grade = B
chagedScore = 7, grade = C
chagedScore = 6, grade = D
chagedScore = 5,4,3,2,1,0이면 grade = F

실행 예
점수를 입력하세요 >>> 100
점수를 100점이고, 학점은 A 학점입니다.

if 문을 통해서 0미만 및 100초과를 걸러내서 grade = x
나머지 부분에 switch문을 작성하면 구현이 가능할겁니다

 */
public class Condition08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int chagedScore = 0;
        String grade = "";
        System.out.println("점수를 입력하세요>>>");
        score = scanner.nextInt();
        chagedScore = score / 10;


        if (score < 0 || score > 100) {
            grade = "X";
        } else { // 이경우 score >= 0에서 score <= 100
            switch (chagedScore) {
                case 10:
                    grade = "A";
                    break;
                case 9:
                    grade = "B";
                    break;
                case 8:
                    grade = "C";
                    break;
                case 7:
                    grade = "D";
                    break;
                case 6:
                    grade = "E";
                    break;
                default:
            }
        }
        System.out.println("점수는 " + score + "점이며, 학점은" + grade + "학점입니다.");
    }
}