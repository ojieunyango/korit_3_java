package ch07_loops;
/*
중첩 while문(nested  while loop)
while (조건식1) {
    반복 실행문 1-a
    while(조건식2) {
       반복실행문2
       }
       반복실행문 1-b
     }
 */
public class Loop02 {
    public static void main(String[] args) {
        int day =1;

        //1일차 1 교시입니다. 1일차 3교시 입니다. 5일차 3교시입니다.
        while(day<6) {
            int lesson = 1;
            while (lesson <4){
                System.out.println(day+"일차"+lesson + "교생입니다.");
                lesson++;
            }
            day++;
        }
        /*
         이상의 코들를 응용하여
         2*1=2
         2*2=2
         ...
         9*9=81
         */
        int dan = 2;

        while (dan < 10) {
            int num = 1;
            while (num < 10) {
                System.out.println(dan + " x " + num + " = " + (dan*num));
                num++;
            }
            dan++;
        }

    }
}
