package org.example;
/*
Bmi 계산기를 작성하시오.
1. 사용자에게 키는(cm)와 몸무게(kg)를 입력받으시오.
2. 수학적 연산을 통해서 BMI 지수를 산출하시오.
    BMI 지수 = 몸무게(kg) / 키(m)의 제곱
    3. 18.5 미만인 경우 저체중
        23 미만은 정상체중
        25 미만은 과체중
        25 이상에 해당하는 조건문을 작성하고
    4. 실행 예
    키(cm)를 입력하세요>>>
    몸무게(kg)를 입력하세요>>>
    당신의 BMI는 00.00000 이며 저제충/정상/과체중/비만 입니다.
    와 같이 출력될수있도록 작성하시오.
 */


import java.util.Scanner;

public class BmiCalcMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiCalc02 bmiCalc02 = new BmiCalc02();
        //사용할 변수 초기화 밎 선언
        double height;
        double weight;
        double bmi;
        String result = "";

        System.out.println("키(cm)를 입력하세요.>>>");
        height = scanner.nextDouble();
        System.out.println("몸무게(Kg)를 입력하세요.>>>");
        weight = scanner.nextDouble();

//        // height가 cm 이기때문에 m로 변환해야함
//        height = height / 100;
//        //BMI 계산
//        bmi = weight / (height * height);

//        if (bmi < 18.50){
//            result = "저체중";
//        } else if (bmi < 23) {
//            result = "정상체중";
//        } else if (bmi < 25) {
//            result = "과체중";
//        } else {
//            result = "비만";
//        }

        bmi = bmiCalc02.getBmi(height,weight);
        result = bmiCalc02.getResult(bmi);
        System.out.println("당신의 BMI는 "+ bmi + "이며, "+ result + "입니다.");

    }
}