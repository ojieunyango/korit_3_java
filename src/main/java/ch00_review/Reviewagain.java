package ch00_review;
/*
사용자에게 숫자 5개를 입력받습니다.
각 숫자에 대해 다음과 같은 조건을 체크합니다:
입력된 숫자가 짝수일 경우 "짝수입니다."를 출력합니다.
입력된 숫자가 홀수일 경우 "홀수입니다."를 출력합니다.
입력된 숫자가 3의 배수일 경우 "3의 배수입니다."를 출력합니다.
입력된 숫자가 5의 배수일 경우 "5의 배수입니다."를 출력합니다.
0이면 "입력된 숫자가 0입니다."를 출력합니다.
5개의 숫자 중에서 최대값과 최소값을 구하고 출력합니다.
5개의 숫자에 대한 합계와 평균을 계산하고 출력합니다.
 */
import java.util.Scanner;

public class Reviewagain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number =0;
        double evenCount =0;
        double oddCount = 0;
        double sum = 0;
        double avg = 0;
        int max = Integer.MIN_VALUE; // 최대값
        int min = Integer.MAX_VALUE; // 최소값

        System.out.println("숫자 5개를 입력하세요.(1~100)");
        for (int i =0; i < 5; i++){
            System.out.println("숫자"+(i+1)+":");
            number = scanner.nextDouble();
            if (number < 0 || number > 100) {
                System.out.println("입력범위를 초과하여 다시 입력해주세요.>>>");
                i--;
                continue;
            }
            if (number % 2 == 0){
                evenCount++;
                System.out.println("짝수입니다.");
            } else if (number%2==1) {
                oddCount++;
                System.out.println("홀수입니다.");
            } else if (number == 0) {
                System.out.println("입력한 숫자가 0 입니다.");
            } else if (number % 3 == 0) {
                System.out.println("3의 배수입니다.");
                
            }
            number+=sum;
            avg =sum /5;

            System.out.println("합계: "+ sum);
            System.out.println("평균: "+ avg);

            }
        }
        }






