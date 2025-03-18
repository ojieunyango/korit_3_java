package ch08_method;

import java.util.Scanner;

public class ScoreCal02 {
    //메서드의 정의
    //1. 총합을 내는 메서드 : call4()유형으로 작성 예정 매개변수 return
//    public static double addScores(double score1, double score2){
//        return score1 + score2;
//    }
//
//////2. addScores()메서드를 overloading 하여 매개 변수가 3개인 메서드를 만드시오
//
//    public static double addScores(double score1, double score2, double score3) {
//        return score1 + score2 + score3;
//    }
//
//    // 3. addScore() 메서드를 overloading하여 매개변수가 4, 5, 6개인 메서드들을 만드시오.
//    public static double addScores(double score1, double score2, double score3, double score4) {
//        return score1 + score2 + score3 + score4;
//    }
//
////    public static double addScores(double score1, double score2, double score3, double score4, double score5) {
////        return score1 + score2 + score3 + score4 + score5;
////    }
//
//    public static double addScores(double score1, double score2, double score3, double score4, double score5, double score6) {
//        return score1 + score2 + score3 + score4 + score5 + score6;
//    }
//
// 오버로딩이라는 개념자체는 편하지만 (메서드명이 중복되어도 된다는 점에서)
//항상 만능은 아니다 -> 매개변수의 개수를 엄격하게 지정하기 때문에 유연하게 발휘될수없음
//1. 그래서 일단 합계를 낼때 두개짜리만 생성한 예정

public  static double addSubjects(double totalScore, double addedScore) {
    return totalScore+addedScore;
}
// 2.평균을 내는 메서드
    public static double calculateAvg(double totalScore, int numberOfSubjects){
    return totalScore / numberOfSubjects;
    }

    public static void main(String[] args) {
//        double sum = addScores(100, 95);
//        System.out.println(sum);
        System.out.println(addSubjects(4.5, 3.5));
        System.out.println(addSubjects(4.5, 3.5)/2);

        System.out.println(calculateAvg(addSubjects( 4.5,  3.5),2));

        //이상의 코드를 확인하게 됐을때 알수있는 점은 addSubject() method 결과값이 calculateAvg() method의
        //첫번째 argument 가 됐다는 점입니다. -> 프로그래머스나 백준에서 코테 연습하는문제풀이에서 하는 사람들잇음

        double sumOfScores = addSubjects(4.5, 3.5);
        int subjects = 2;
        double avgScore = calculateAvg(sumOfScores, subjects);
        //이상의 코드는 일단 두과목을 기준으로 합과 평균을 낸다는 점을 확인할수있습니다.
        //method로 두과목부터 100과목까지의 overloading을 통한 매개변수 늘리기보다는 main 단계에서 addSubject를 반복해버리 굳이
        //몇과목일지도 모르는 overloading 을 할 필요가 없습니다
        //scanner import
        Scanner scanner = new Scanner(System.in);
        //사용할 변수 목록
        boolean endOfCalc = false;
        double score1 = 0;
        double totalScore = 0;
        int totalSubjects =1; // 과목수가 될텐데 반복 횟수마다 ++ 시켜줄 예정 (0으로 나누지않기위해 1로 초기화)
        double avgScores = 0; // totalScore / totalSubjects의 결과값이ㅣ 대입될거니깐 미리 double로 선언함

        while (!endOfCalc){
            System.out.println("점수입력하세요.(종료하려면 -1을 입력하세요.)>>>");
            score1 = scanner.nextDouble();
            //score1 = -1이 대입되었다면 반복문이 종룍될수있도록 하는 조건문 작성
            if(score1 == -1){ //왜 종료 라든지 x가 아니라 -1 입ㄹ력을 햇을때 종료되도록 작성해야할까요? 더블로 초기화되어잇ㅇ음
                break;
                //endOfCalc = true; //현재반복은 이루어지고 다음 반복시에 종료가 되기때문
            }
            //합을 계산하는 코드
            totalScore = addSubjects(totalScore, score1);//첫반복문일때는 addSubject(0, score1);입닌다
            //평균을 계산하는코드
            avgScore = calculateAvg(totalScore, totalSubjects);
            System.out.println("----점수입력시마다 나오는 합계와 평균입니다.-----");
            System.out.println("입력한 점수의 합계: "+ totalScore);
            System.out.println("입력한 점수의 평균: "+avgScore);

            totalSubjects++; // 다음 반복시에는 한과목 더 늘어난 상태로 평균계산의 분모가 되어야하기때문
            System.out.println("----점수입력종료후 나오는 합계와 평균입니다.-----");
            System.out.println("입력한 점수의 합계: "+ totalScore);
            System.out.println("입력한 점수의 평균: "+avgScore);

        }

    }
}

