package ch00_review;

public class Review02 {
    public static void main(String[] args) {
        /*
        연산자
        1) 대입연산자 =
        2) 복합대입연산자
        +=
        -=
        *=
        /=
         */
        double height =124.37;
        double width =30.3;
        double area = height * width; //식 먼저 구하고 area 대입해도 됨

        //1. 이상의 변수에 세로 30.3 / 가로 124.37 인 사각형의 넓이를 구하시오.
        //2. 동일한 가로 세로의 삼각형의 넓이를 구하시오
        // 실행 예
        // 가로 124.37, 세로 30.3인 삼각형의 넓이는 000 이고, 사각형의 넓이는 000 입니다.

        System.out.println("가로 124.37, 세로 30.3인 삼각형의 넓이는 "+((height*width)/2)+"이고, 사각형의 넓이는 "+ (height*width)+"입니다.");

    }
}
