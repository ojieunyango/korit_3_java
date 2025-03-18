package ch07_loops;
/*
이중구문 for문
for (int i = 0; i <10; i++) {
    반복실행문 1-a
    for(int j =0; i <5; j++){
        반복실행문2
     }
     반복실행문1-b
     for(int k = 0; k<20; k++){
            반복실행문3
      }
     반복실해문1-c
      }
 */
public class Loop07 {
    public static void main(String[] args) {
//        for(int i =0; i < 6; i++){
//            for (int j =0; j < i; j++) {
//                System.out.print("*"); //이중포문내의 별의갯수
//            }
//            System.out.println(); //줄수 책임짐
//        }
//    }
//}

//별찍기를 통한 for문 구조학습
//i=0, j=0 이면 개행이 일어나야함 (실행문2는 실행 안됨)
//i=1 일때 j=0 일때는 */j =1 일때는 개행
//        i=2일때 j=0, 1이면 */j=2면 개행

//100 부터 0까지 역순으로 출력하는 for문 작성하시오 2중 for문 아닙니다
//        System.out.println();
//        for(int i = 100; i > -1; i--) {
//            System.out.println(i);
//        }
//
//        }
//
//        for (int i = 5; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j - i > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}