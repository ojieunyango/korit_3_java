package ch06_condition;
/*
삼항 연산자
   정의 : 조건식을 평가하며 ture / false에 따라 두가지 표현식 중하나를 선택적으로 실해

   형식:
   조건식 ? 표현식1 : 표현식2

   조건식 : true / false 로 평가 가능한 식
   표현식1 : 조건식이 true 일 때 실행되는 식
   표현식2: 조건식이 false 일때 실행되는 식
 */
public class Condition09 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        // a>b라면 max에 a를 대입/ 아니라면 max에 b를 대입
        int max = (a>b) ? a:b;
        System.out.println("더큰숫자는 " + max +"입니다.");
        // if문으로 쓴다면

        int max2 = 0;
        if (a>b) {
            max2 = a;
        } else {
            max2 = b;
        }

    }
}
