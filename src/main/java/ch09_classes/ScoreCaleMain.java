package ch09_classes;

import java.util.Scanner;

public class ScoreCaleMain {
    public static void main(String[] args) {
        //필요한 class들을 import
        Scanner scanner = new Scanner(System.in);
        ScoreCalc scoreCalc = new ScoreCalc();

        // ch08의 ScoreCalc 와 동일한 기능을 하도록
        //나머지 코드를 전부작성하시오

        double sum = 0.0;
        double avg = 0.0;
        int numOfSubs = 0;

        boolean endOfCalc = false;
        double score1 = 0;
        double totalScore = 0;
        int totalSubjects =1;
        double avgScores = 0;

        while (!endOfCalc){
            System.out.println("점수입력하세요.(종료하려면 -1을 입력하세요.)>>>");
            score1 = scanner.nextDouble();

            if(score1 == -1){
                break;

            }
            //합을 계산하는 코드
            //totalScore = addScores(totalScore, score1);
            totalScore = scoreCalc.addScores(totalScore, score1);

            //평균을 계산하는코드
            //avgScores = calculateAvg(totalScore, totalSubjects);
            avgScores = scoreCalc.calculateAvg(totalScore, totalSubjects);
            System.out.println("----점수입력시마다 나오는 합계와 평균입니다.-----");
            System.out.println("입력한 점수의 합계: "+ totalScore);
            System.out.println("입력한 점수의 평균: "+avgScores);

            totalSubjects++;
            System.out.println("----점수입력종료후 나오는 합계와 평균입니다.-----");
            System.out.println("입력한 점수의 합계: "+ totalScore);
            System.out.println("입력한 점수의 평균: "+avgScores);

        }

    }
}


