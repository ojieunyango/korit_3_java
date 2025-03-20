package org.example;
/*
이하의 코드에 필요한 로직을 작성하고
BmiCalcMain 적용하여 -> 여기에 객체도 생성해야하고
                    -> getBmi라는 메서드 호출
동일한 결과값이 나오도록 작성성하시오

이클래스에 getBmiResult 메서드를 Call3()으로 정의하여 bmiCalc.getBmiResult();를 호출했을때

실행 예
키(cm)를 입력하세요>>>
    몸무게(kg)를 입력하세요>>>
    당신의 BMI는 00.00000 이며 저제충/정상/과체중/비만 입니다.
    와 같이 출력될수있도록 작성하시오.
 */
public class BmiCalc02 {
    public double getBmi(double height, double weight) {
        double bmi = 0; //지역변수
                height = height * 0.01;
                bmi = weight / (height * height);

        return bmi;
    }
    public String getResult(double bmi) {
        String status = "";

        if (bmi < 18.50){
            status = "저체중";
        } else if (bmi < 23) {
            status = "정상체중";
        } else if (bmi < 25) {
            status = "과체중";
        } else {
            status = "비만";
        }

        return status;
    }
}
