package ch08_method;

import java.util.Scanner;

/*
 별찍기 관련한거 메서드로 구현할 예정
 */
public class Method02 {
    //call4 유형이 될 예정
    public static String getStar(int rows, int select) { //rows와 rowOfStars는 서로 다른 게념
        //사용할 지역 변수 선언
        String result = "";

        //select 에 따라서 다른 결과값이 나오도록 조건문을 작성할 예정입니다.
        if (select == 1) {
            for (int i = 0; i < rows + 1; i++) {
                for (int j = 0; j < i; j++) {
                    result += "*";
                }
                result += "\n"; //개행부분
            }
        } else if (select == 2) {
            for (int i = 0; i < rows; i++) { //공백이 찍히는 for문
                for (int j = 0; j < rows - (i + 1); j++) { // 별이찍히는 for문
                    for (int k = 0; k < i + 1; k++) {
                        result += "*";
                    }
                    result += "\n"; //개행
                }
            }
        } else if (select == 3) { //왼쪽으로 감수하는 별찍기
            for (int i = 0; i < rows; i++) {
                for (int j = 5; j - i > 0; j--) {
                    result += ("*");
                }
                result += "\n";
            }
        } else if (select == 4) { //오른쪽으로 감소하는 별 찍기
            for (int i = 0; i < rows; i++) {   //공백관련 for문 select 1 참조
                //공백이 늘어나야함
                for (int j = 0; j < i+1; j++) {
                    result += " ";
                }
                for (int j = rows; j - i > 0; j--) { //별 찍는 for문
                    result += "*";
                }
                result += "\n";
            }
        } else {
            result = "잘못입력하셨습니다. 프로그램을 종료합니다.";
        }
        return result;
    }


    public static void main(String[] args) {

            // Scanner import
            Scanner scanner = new Scanner(System.in);
            //사용할 변수 목록 선언 및 초기화
            int rowOfStars = 0;
            int choice = 0;
            String starResult = "";

            System.out.print("몆줄짜리 별을 생성할까요?>>>");
            rowOfStars = scanner.nextInt();

            System.out.println("1. 왼쪽으로 치우친 증가하는 별");
            System.out.println("2. 오른쪽으로 치우친 증가하는 별");
            System.out.println("3. 왼쪽으로 치우친 감소하는 별");
            System.out.println("4. 오른쪽으로 치우친 증가하는 별");
            System.out.print("메뉴를 선택하세요>>>");

            choice = scanner.nextInt();

            starResult = getStar(rowOfStars, choice);
            System.out.println(starResult);


        }
    }

