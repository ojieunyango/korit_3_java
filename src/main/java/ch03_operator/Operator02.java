package ch03_operator;
/*
    논리 연산자

    true (1) / false(0) : 컴퓨터가 읽을수 있는 두숫자
    boolean : true/false를 구분하는 자료형
    AND(&&) : 곱 연산자 둘다 true 여야 true
    OR(||) : 합 연산자 둘중 하나만 true 여도 됨
    NOT(!) : true 값을 false로, false 값을 true로 역전시키는 연산자
 */
public class Operator02 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;

        boolean result1 = flag1 && flag1;
        System.out.println(result1);         // true
        boolean result2 = flag1 && flag2;
        System.out.println(result2);          // false
        boolean result3 = flag2 && flag2;
        System.out.println(result3);        // false

        System.out.println("---|| 연산자---");

        boolean result4 = flag1 || flag1;
        System.out.println(result4);       //true
        boolean result5 = flag1 || flag2;
        System.out.println(result5);        // true
        boolean result6 = flag2 || flag2;
        System.out.println(result6);      // false

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println(result7);

        boolean result8 = 10 % 3 == 0;
        System.out.println(result8);   //오늘 마지막 시간 혹은 내일 조건식


    }
}
