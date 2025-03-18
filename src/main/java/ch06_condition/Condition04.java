package ch06_condition;
/*
if - else if- else문

형식:
if (조건식1) {
   실행문1
   }else if (조건식2) {
   실행문2
   }else if(조건식3) {
   실행문3
   }else if(조건식4) {
   실행문4
   }else if(조건식5) {
 */
import java.util.Scanner;

public class Condition04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int point = 0;
        final int VIP_point = 80;
        final int GOLD_point = 60;
        final int SILVER_point = 40;
        final int BRONZEN_point = 20;

        String rating = "";

        System.out.println("회원 포인트를 입력하세요>>>");

        point = scanner.nextInt();

        if (point > VIP_point) {
            rating = "VIP";
        } else if (point > GOLD_point) {
            rating = "GOLD";
        } else if (point > SILVER_point) {
            rating = "SILVER";
        } else if (point > BRONZEN_point) {
            rating = "BRONZEN";
        } else {
            rating = "일반";
        }
    }
}
