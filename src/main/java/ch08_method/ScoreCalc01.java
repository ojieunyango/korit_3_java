package ch08_method;

import java.util.Scanner;

/*
점수들을 입력받아서 총합 및 평균을 내는 프로그램을 구현할 예정
 */
public class ScoreCalc01 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        double avg = 0.0;
        int numOfSubs = 0;

        //3과목의 점수를 입력받고, 총합과 평균점수를
        //콘솔창에 출력하시오

        //실행 예
        //몇과목의 점수를 입력하시겠습니까?>>> 3
        //1과목의 점수를 입력하세요>>> 100
        //2과목의 점수를 입력하세요>>> 90
        //3과목의 점수를 입력하세요>>> 95
        //총합은 285.0점이며 평균은 95.0점 입니다.
//        System.out.print("몇과목의 점수를 입력하시겠습니까?>>>");
//        numOfSubs = scanner.nextInt();
//        System.out.println("1과목의 점수를 입력하세요>>>");
//        sum += scanner.nextDouble();
//        System.out.println("2과목의 점수를 입력하세요>>>");
//        sum += scanner.nextDouble();
//        System.out.println("3과목의 점수를 입력하세요>>>");
//        sum += scanner.nextDouble();
//        avg = sum / 3;
//        System.out.println("총합은 " + sum + "점이며, 평균은 " + avg + "점입니다.");

        //이상의 코드를 기준으로 필요한 부분을 반복문으로 바꾸는 refactoring 을 작성하시오.

        System.out.println("몇 과목의 점수를 입력하시겠습니까?>>>");
        numOfSubs = scanner.nextInt();
        for(int i = 0; i < numOfSubs; i++){
            System.out.println((i+1)+"과목의 점수를 입력하세요>>>");
            sum+= scanner.nextDouble();
        }
        avg = sum / numOfSubs;
        System.out.println("총합은 "+ sum + "점이며, 평균은 "+ avg +"점입니다.");
    }
}


