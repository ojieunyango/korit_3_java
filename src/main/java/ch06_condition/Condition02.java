package ch06_condition;
/*
if - else문: if 다음에 있는 조건식이 true 일 때는 if 문내의 {} 실행문이 실행
false 일 경우 else 에 딸린 {} 실행문이 실행

형식 :
if (조건식) {
실행문1
} else { else의 경우 if 가 false일때만 실행
실행문2 별도의 조건식이 존재하지않음
}
 */
public class Condition02 {
    public static void main(String[] args) {

        int num = -10;
        if(num < 0) {
            System.out.println("num은 음수입니다");
        }else {
            System.out.println("num은 0이거나 양수입니다.");
        }

    }
}
