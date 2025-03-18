package ch07_loops;
/*
별찍기 오른쪽정렬로 만들기

공백의 갯수를 책임지는 반복문 - 개행시마다 공백의 개수를 줄어드니까
별의 개수가 줄어드는 반복문을 참조

별의 갯수를 책임지느 반복문-개행시마다 별의 갯수가 늘어나니까
맨처음에 배웠던 반복문을 참조
 */
public class Loop09 {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {   //공백관련 for문
//            for (int j = 5; j > i; j--) {
//                System.out.print("");
//            }
//            for (int k = 0; k < i; k++) { //별찍기 관련 for문
//                System.out.print("*");
//            }
//            System.out.println();//개행 실행문
//        }
//    }
//}


//#2
//for (int i = 0; i < 6; i++) {   //공백관련 for문
//        for (int j = 0; j < 6-i; j++) {
//        System.out.print("");
//            }
//        for (int k = 0; k < i; k++) { //별찍기 관련 for문
//        System.out.print("*");
//            }
//        System.out.println();//개행 실행문
//        }
//    }
//}


        for (int i = 6; i > 0; i--) {
            // 공백을 출력하여 오른쪽 정렬
            for (int j = 0; j < 6 - i; j++) {
                System.out.print(" ");
            }
            // 별을 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }
    }
}