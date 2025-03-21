package ch00_review;

import java.util.Scanner;

/*
for 반복문
for(시작값 ; 한계값; 증감값){
반복실행문
}
시작값에는 처음 선언하는 변수여야 오류를 막을수있습니다.
i는 인덱스라는 뜻임
for(시작과; 한계값; 증감값){
   반복실행문1
   while/if/for(){
      반복실행문2
      }
      반복실행문3
      }
*/
public class Review04 {
    public static void main(String[] args) {
//        int limitNumber = 100;
//        //짝수 만들기
////        for (int i = 1; i < limitNumber; i++) {
////            //System.out.println(i+" ");
////            //여기 내부에 if문을 써서 1부터 limitNumber까지의 숫자중 짝수만 뽑아낼수있도록 하는 조건문을 작성하시오.
////            int addedI = i + 1;
////            if (addedI % 2 == 0) {
////                System.out.print(addedI + " ");
////            }
////        }
//        // while문으로 개조 홀수로 쓰시오
//        int n = 1;
//        while (n < limitNumber + 1) {
//            if (n % 2 == 1) {
//                System.out.println(n + " ");
//            }
//                n++;
//
//            }
        Scanner scanner = new Scanner(System.in);


        int numOfStudent =0;
        double sum =0;
        double avg =0;

        System.out.println("학생수는 몇명인가요?>>>");
        numOfStudent = scanner.nextInt();
        /*
        학생수와 점수를 입력 받아서 합을 구하고 평균을 내는 방식으로 이루어질거라는 유추 가능
        학생 개개인이 점수를 입력할수있도록 sum 만 존재하는다는 점에서 for반복문 내문에 sum, += 사용될것
         */
       // int n = 1;
        double score =0;
//        while (n<=numOfStudent) {
//            System.out.println("점수를 입력하세요.>>>");
//            score = scanner.nextDouble();
//            sum += score;
//            n++;
//        }
//        System.out.println("총합: "+sum);
//        avg = sum / numOfStudent;
//        System.out.println("평균: "+avg);

        for (int i = 1; i <= numOfStudent; i++) {
            System.out.println("점수를 입력하세요.>>>");
            score = scanner.nextDouble();
            if (score < 0 || score > 100) {
                System.out.println("입력값 초과로 종료합니다.");
                break;
            }
            sum += score;
        }
            System.out.println("총합: " + sum);
            avg = sum / numOfStudent;
            System.out.println("평균: "+ avg);

            }


        }







