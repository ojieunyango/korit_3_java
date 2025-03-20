package org.example;

import java.util.Scanner;

public class BmiCalcMain02 {
    public static void main(String[] args) {
        //사용할 클래스 임포트하기
        Scanner scanner = new Scanner(System.in);
        BmiCalc02 bmiCalc = new BmiCalc02();

        //사용할 변수 목록 선언 및 초기화
        double height;
        double weight;
        double bmi;
        String result = "";

        System.out.println("키(cm)를 입력하세요.>>>");
        height = scanner.nextDouble();
        System.out.println("몸무게(Kg)를 입력하세요.>>>");
        weight = scanner.nextDouble();

        //System.out.println(bmiCalc.getBmi(height,weight));
        bmi = bmiCalc.getBmi(height,weight); // 메서드의 결과값이 bmi 변수에 저장
        result = bmiCalc.getResult(bmi);
        //String result2 = bmiCalc.getResult(bmiCalc.getBmi(height,weight));

        System.out.println("당신의 BMI는 "+ bmi + "이며, "+ result + "입니다.");
    }
}
