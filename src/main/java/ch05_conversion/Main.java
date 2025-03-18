package ch05_conversion;

public class Main {
    public static void main(String[] args) {
        /*
        Conversion 형변환 -> 용량상의 문제로 일어나는 이슈를 해결하기위해서 사용.
        1) upcasting : 더큰 용량의 자료형으로 변환시키는것
         */

//        char cast1= 'A';
//        System.out.println("원형 : " + cast1);
//        System.out.println("변형 : " + (int)cast1);   //char 타입을 int 로 바꿔줌
//        // 업캐스팅 방법 1.
//        // 형변환하기위해서 (바꿀데이터 타입) 변수명 으로 작성하시면 됩니다.
//        System.out.println("변형 : " + (int)cast1);
//
//        char cast2 ='a';
//        System.out.println("원형 : " + cast2);
//        System.out.println("변형 : " + (int)cast2); // 97 -> A만큼은 아니지만
//        // 업케스팅 방법 2
//        char cast3 = 'b';
//        //새로운 변수를 선언하여 집어넣는 방법입니다
//        int cast4 = cast3;

        //2) downcasting :더적은 용량의 자료형으로 변환시키는것

        int cast5 = 99;
        int cast6 = 100;
        //지시사항: 다운캐스팅하는 방법을 업캐스팅 방법 1,2 를 이용하요 char형으로 바꾼후 콘손창에 원형과 변형을 모두 출력
        System.out.println("원형 : " + cast5);
        System.out.println("원형 : " + (char)cast5);
        System.out.println("변형 : " + cast6);
        System.out.println("변형 : " + (char)cast6);

        char cast7 = (char) cast6;
        //char cast7 = cast6; 오류 발생합니다. 업캐스팅 다운케스티 성격차이있음
        System.out.println("원형 : " + cast6);
        System.out.println("변형 : " + cast7);

        /*
        업케스팅의 경우는 메모리 용량이 키지기만 하면 기존 데이터가 변형이 일어나지는않기 때문에 암시적(implicit)으로 변형이 가능
        다운캐스팅 데이터를 축소하는 과정에서 메모리 용량을 벗어나게 되는경우 가 잇다
        용량 오번에 해당하는 현상을 미리 점검하기위해 다운캐스팅
         */


    }
}
