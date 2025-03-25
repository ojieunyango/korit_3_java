package ch12_arrays;

import java.util.Scanner;

/*
String[] scores = new String{"A"~F 를 선언하고 반복문을 작성해서
scores 배열의 결과가 {"A+", 가 되도록 한후
점수 : A+ B+ 되도록 코드를 작성하시오  main  에서만 쓰시면 됩니다

 */
public class Arrays05 {


    public static void main(String[] args) {
//        String[] scores = {"A","B","C","D","E","F"};
//
//        for (int i = 0; i < scores.length; i++){
//          //  scores[i]+="+";
//            System.out.println("점수: "+scores[i]+"+");
//        }

//        int[] scores2 = {100, 90, 80, 70, 60, 20, 88, 52};
//        int sum = 0;
//        int[] numScores = new int[8];
//        double avg = 0;
//
//        for (int i = 0; i < scores2.length; i++){
//            sum += scores2[i];
//        }
//        System.out.println("총점 : "+ sum);
//        avg = (double) sum / scores2.length;
//        System.out.println("평균 : "+avg);
        Scanner scanner = new Scanner(System.in);
        int[] scores3 = {34, 43, 89, 56, 76, 67,56,45,67,78,87};


        int sum = 0;
        double avg = 0;

        for (int i = 0; i < scores3.length; i++) { //총합
            sum += scores3[i];
        }
        System.out.println("총합 : " + sum);

        avg = (double) sum / scores3.length;  //더블로 형변환 후 평균냄
        System.out.println("평균: " + avg);

        String[] grade = new String[scores3.length]; //각 학점을 저장할 배열 (학생 수 만큼 배열 크기 설정)

       int a = 0;
       int b = 0;
       int c = 0;
       int d = 0;
       int f = 0;



           for(int i = 0 ; i < scores3.length ; i++) {  //각 학점 별 학생수
               if (scores3[i] > 89) {
                   a++;
               } else if (scores3[i] > 79) {
                   b++;
               } else if (scores3[i] > 69) {
                   c++;
               } else if (scores3[i] > 59) {
                   d++;
               } else {
                   f++;
               }
               System.out.println("A 학생 수 : " + a);  // 각 학점 별 학생수
               System.out.println("B 학생 수 : " + b);
               System.out.println("C 학생 수 : " + c);
               System.out.println("D 학생 수 : " + d);
               System.out.println("F 학생 수 : " + f);
           }

               int[] numOfStudent = { 0, 0, 0, 0, 0 }; // 학생수 저장하는 배열

               // 점수에 따라 각 학점 카운트
               for (int i = 0; i < scores3.length; i++) {  // scores3 배열의 크기만큼 반복
                   if (scores3[i] > 89) {  // 점수가 90 이상이면 A
                       numOfStudent[0]++;  // numOfStudent[0] (A) 카운트 증가
                   } else if (scores3[i] > 79) {  // 점수가 80 이상 90 미만이면 B
                       numOfStudent[1]++;  // numOfStudent[1] (B) 카운트 증가
                   } else if (scores3[i] > 69) {  // 점수가 70 이상 80 미만이면 C
                       numOfStudent[2]++;  // numOfStudent[2] (C) 카운트 증가
                   } else if (scores3[i] > 59) {  // 점수가 60 이상 70 미만이면 D
                       numOfStudent[3]++;  // numOfStudent[3] (D) 카운트 증가
                   } else {  // 점수가 60 미만이면 F
                       numOfStudent[4]++;  // numOfStudent[4] (F) 카운트 증가
                   }
               }

           System.out.println("A 학생 수 : "+ scores3[0]);
           System.out.println("B 학생 수 : "+ scores3[1]);
           System.out.println("C 학생 수 : "+ scores3[2]);
           System.out.println("D 학생 수 : "+ scores3[3]);
           System.out.println("F 학생 수 : "+ scores3[4]);
       }

    }


