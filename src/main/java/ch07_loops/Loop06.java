package ch07_loops;

import java.util.Scanner;

/*
while for 문 두개 섞기
n을 입력받아
1부터 n까지 합을 구하는 반복문을 ->for
반복하시겠습니까? Y/N >> N이 나올때까지 반복할것 -> while
 */
public class Loop06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEnded = false;

        while (!isEnded) {
            int n = 0;
            int sum = 0;
            System.out.println("1부터 몇까지의 합을 구하시겠습니까?>>>");
            n = scanner.nextInt();
            // 1부터 n까지의 합을 구하는 for 반복문을 작성하시요
            for(int i =1; i < n+1; i++){
                sum += i;
            }
            System.out.println("합은 "+sum + "입니다.");

            System.out.println("반복하시겠습니까? Y/N>>>");
            scanner.nextLine();  //엔터키를 막아주는 베리어
            String answer = scanner.nextLine();
            if (answer.equals("N")) { // 이코드이 잠재적 문제점은 N이외의 모든겂은 전부 반복이 이루어진다는 점
                isEnded = true;
            }
        }
    }
}
