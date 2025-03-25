package ch12_arrays;

public class Arrays06 {

    private int calcSum(int[] scores){
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
        sum += scores[i];
    }
    return sum;
}
private double calAvg(int[] scores) {
    double avg = 0;
    int sum = 0;
    sum = calcSum(scores);
    avg = (double) sum / scores.length;

    return avg;
}



private void countGrade(int[] scores){
    int[] grades = {0,0,0,0,0};
    for(int i = 0 ; i < scores.length; i++){

        if (scores[i] > 89) {
            scores[0]++;
        } else if (scores[i] > 79) {
            scores[1]++;
        } else if (scores[i] > 69) {
            scores[2]++;
        } else if (scores[i] > 59) {
            scores[3]++;
        } else {
            scores[4]++;
        }
    }

    System.out.println( "A 학점 인원수: "+grades[0]);
    System.out.println( "B 학점 인원수: "+grades[1]);
    System.out.println( "C 학점 인원수: "+grades[2]);
    System.out.println( "D 학점 인원수: "+grades[3]);
    System.out.println( "F 학점 인원수: "+grades[4]);
}
   public void printTotalInfo(int[] scores){
       double avgScore = calAvg(scores);
       System.out.println("평균 : " + avgScore);
       countGrade(scores);
   }


    public static void main(String[] args) {
        //array06 클래스 메서드를 호출하기 위한 객체 생성
        Arrays06 arrays06 = new Arrays06();
        //점수 데이터를 사전에 마련해놓겠습니다
        int[] scores = {100, 65, 33,54,45,32,6};

//        int total = array06.calcSum(scores);
//        System.out.println("총합 : " + total);
//        double avgScore = array06.calcAvg(scores);
//        System.out.println("평균 : " + avgScore);
//        array06.countGrade(scores);  // A인원수 ... F인원수를 구하는 메서드 호출

        arrays06.printTotalInfo(scores);
    }
}
