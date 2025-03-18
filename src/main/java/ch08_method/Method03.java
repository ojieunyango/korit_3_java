package ch08_method;

import java.util.Scanner;

/*
Merhod02 파일에서 별찍기관련 method를 구현하고 실행까지 시켜봤습니다
근데 getStar() 메서드를 보면 내부에 if else , if else 형태의 구문으로 매게변수를 1-4까지 받아서 출력하게끔 구현되있습니다

근데 if 문을 작성하면 가독성이 떨어지기때문에
이걸 switch문으로 고체하며 동일한 기능을 하게끔 refactoring 리팩토링 과정을 거치고자 합니다.
 */
public class Method03 {
    public static String getStar(int rows, int select) {
        String result = "";
        // 여기에 메서드02에서 작성한 if문을 switch문으로 수정할것
        //필요한 부분은 condition 패키지를 확인하시오.

        switch (select){
            case 1:
                for (int i = 0; i < rows + 1; i++) {
                    for (int j = 0; j < i; j++) {
                        result += "*";
                    }
                    result += "\n"; //개행부분
                }
                break;
            case 2:
                for (int i = 0; i < rows; i++) { //공백이 찍히는 for문
                    for (int j = 0; j < rows - (i + 1); j++) { // 별이찍히는 for문
                        for (int k = 0; k < i + 1; k++) {
                            result += "*";
                        }
                        result += "\n"; //개행
                    }
                }
                break;
            case 3:
                for (int i = 0; i < rows; i++) {
                    for (int j = 5; j - i > 0; j--) {
                        result += ("*");
                    }
                    result += "\n";
                }
                break;
            case 4:
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
                break;

            default:
                result = "잘못입력하셨습니다.";
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
// Overloading 클래스 생성


