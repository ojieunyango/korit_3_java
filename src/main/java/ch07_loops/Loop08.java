package ch07_loops;

import java.util.Scanner;

/*
scanner를 응용해사 별 찍기
몆줄의 별을 생성하시겠습니까?>>>3
*
**
***
 */
public class Loop08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        System.out.println("몇줄의 별을 생성하시겠습니까?>>>");
        number = scanner.nextInt();

        for(int i=0; i < number; i++) {
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
1.기본적으로 개행이 이루어지는 부분과 별이 찍히는 부분 때문에 2중 for문은 전제되어야한다는 점.
2.추가된 사항인 넘버 변수와 관련된 부분이 개행의 한계값과 관련이 있다는 점을 파악
 */