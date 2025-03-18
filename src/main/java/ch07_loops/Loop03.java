package ch07_loops;
/*
while문을 사용하여

 */
public class Loop03 {
    public static void main(String[] args) {
        int num = 1;
        while (num < 101){ //num < 101일 동안 반복합니다. 즉, num이 101보다 작은 동안 반복합니다.
            System.out.print(num+" "); //System.out.print(num + " ")는 현재 num 값을 출력하고, 그 뒤에 공백을 추가합니다.
            if (num % 10 ==0){ //if (num % 10 == 0)는 num이 10의 배수인지 확인하는 조건입니다. 10의 배수일 경우,
                               // 즉 num을 10으로 나눴을 때 나머지가 0이면 System.out.println()을 실행하여 줄 바꿈을 합니다.
                               // 이로 인해 매 10개의 숫자마다 한 줄에 출력되도록 합니다.
                System.out.println();
            }
            num++; //num++는 num 값을 1씩 증가시킵니다.
        }

        int num2 = 1;
        while (num2 <101) {
            num2 += 10;

        }
    }
}
