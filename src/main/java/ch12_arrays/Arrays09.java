package ch12_arrays;
 /*
            String[] names 배열을 선언하고
            출석부에 이름을 입력하여 names 배열에 값을 집어넣는
            프로그램을 작성할 예정입니다.

            실행 예
            몇 명의 학생을 등록하시겠습니까? >>> 15
            1 번 학생 이름 : 강수림
            2 번 학생 이름 : 기준성
            3 번 학생 이름 : 김미진
            4 번 학생 이름 : 김준식
            5 번 학생 이름 : 문성진
            6 번 학생 이름 : 심민호
            7 번 학생 이름 : 양지은
            8 번 학생 이름 : 유지현
            9 번 학생 이름 : 윤현지
            10 번 학생 이름 : 이동규
            11 번 학생 이름 : 이예성
            12 번 학생 이름 : 이정화
            13 번 학생 이름 : 전용남
            14 번 학생 이름 : 채수원
            15 번 학생 이름 : 한영진

            5의 배수에 해당하는 학생만 콘솔에 출력하시오.

         */

import java.util.Scanner;

public class Arrays09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇명의 학생을 등록하시겠습니까?");
        int indexNum = scanner.nextInt();
        scanner.nextLine(); //barrier
        String[] students = new String[indexNum];
        for (int i = 0; i < indexNum; i++) {
            System.out.println((i + 1) + "번 학생 등록: ");
            students[i] = scanner.nextLine();
        }



        for (int i = 0; i < students.length; i++) { //indexNum ==students.length
            System.out.println(students[i] + " ");
        }
        for (String student : students){
            System.out.println(student);
        }
    }
}
