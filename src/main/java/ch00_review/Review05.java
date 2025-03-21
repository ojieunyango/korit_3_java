package ch00_review;
/*
method- 순차적으로 실행되는 여러 코드들을 하나의 이름으로 묶어둔것
유형을 저희는 call1 - call4 매개변수 유무/ 리턴 유무로 분할해서 학습했었습니다.
형식:

(접근지정자) (static) 리턴타입 메서드명(매개변수1,매개변수2){
메서드에 순서대로 들어갈 코드들
}
예시
  public String writeSchedule(String date, String content){
      System.out.println(date +"일의 스케줄은 다음과 같습니다.");
      System.out.println(content);
  }
  호출예시
  같은 클래스내에 정의된 메서드라면

  writeSchedule("20250321", "메서드/오버로딩/클래스복습");

 */
public class Review05 {
    //메서드 정의 영역
//    public static void writeSchedule(String date, String content){
//        System.out.println(date +"일의 스케줄은 다음과 같습니다.");
//        System.out.println(content);
//    }//오버로딩 예시
//    public static void writeSchedule(int date2, String content){ //오버로딩
//        System.out.println(date2 +"일의 스케줄은 다음과 같습니다.");
//        System.out.println(content);
//    } //call2 유형으로 작성계획, int 숫자하나를 매개변수로 받가지고 그숫자 7의 배수인지 아닌지를 확인하는 메서드
//    void dividedByMyself(int randomNumber){
    //randonNumber를 호출단계에서 임의의 숫자로 받을텐데 7로 나누어지는지 확인하는 메서드를 가지시오
//
//        if (randomNumber % 7 ==0) {
//            System.out.println(randomNumber + "는 7의 약수입니다.");
//        } else{
//            System.out.println(randomNumber + "는 7의 약수아닙니다.");
//        }
    //지역변수
//        String answer = ""; // 지역변수 선언
//        if (randomNumber % 7 ==0) {
//           answer= "는 7의 약수입니다.";
//        } else {
//            answer="는 7의 약수아닙니다.";
//        }
//        System.out.println(randomNumber+answer);
//    }
//    // 매개변수로 한계값을 받아서 메서드를 호출했을때 1부터 한계값까지 출력하는 메서드를 작성하시오
//    void printLimitNumber(int limitNumber){
//        // 로직 필요
//        for (int i = 0; i < limitNumber; i++){
//            System.out.println((i+1)+" ");
//        }
//    }
    //이상의 메서드를 참조하여 한계값을 매개변수로 받아 짝수만 출력하는 메서드를 정의하시오
    //호출방식
    //review05.printEvenNumber(50);
    //실행예 2 4  6 8....
//    public static void printEvenNumber(int limitNumber) {
//        for (int i = 2; i < limitNumber; i++) {
//            int addedI = i + 1;
//            if (addedI % 2 == 0) {
//                System.out.print(addedI + " ");
//
//            }
//        }
//    }

    /*
    매개변수 2개받기
    첫번째 매개변수에는 한계값/두번째 매개변수로는 나누는값
    호출방식:
    review.printSpecificNums(50,4);
    4 8  12...
     review.printSpecificNums(20,3);
     3 6 9 18
     */
     void printSpecificNums(int limitNum, int dividingNum) {
         for (int i = 4; i < limitNum; i++) {
             if (i % 2 == 0) {
                 System.out.println(i + " ");
             }
         }
             for (int j = 3; j < dividingNum; j++) {
                 if (j % 2 != 0) {
                     System.out.println(j + " ");
                 }
             }
         }


    public static void main(String[] args) {
        Review05 review05 = new Review05();
        //메서드 호출영역
//        review05.writeSchedule("20250321", "메서드/오버로딩/클래스 복습");
//        review05.writeSchedule(20250321, "메서드.,앙러잉로어ㅗ라" );
//
//        // 과제 메서드 호출
//        review05.dividedByMyself(4858749);


//        review05.printEvenNumber(50);

        review05.printSpecificNums(50,50);


    }


}
