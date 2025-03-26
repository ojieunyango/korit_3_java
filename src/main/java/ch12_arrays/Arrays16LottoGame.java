package ch12_arrays;

import java.util.Arrays;
import java.util.Random;

/*
1. 1차 배열을 기준으로 1~45까지의 임의의 숫자를 뽑아 배열에 대입

  목표는 1차 배열내에 6개의 임의의 int값을 집어넣는것
  근데 중복이 있으면 안됨

  복습- 1~45까지의 숫자를 여섯개짜리 빈배열에 집어넣는것부터 시작
  lottoNumbers 에 1~45까지의 숫자중 6개를 뽑아 대입하는 반복문 작성
  -> 1 차 배열의 하나가 완성됩니다.
 */
public class Arrays16LottoGame {
    public static void main(String[] args) {
        // 객체 생성
        Random random = new Random();
        //생각해봐야할 점
        //Math.random()을 사용해서 1~45까지의 범위를 만들려면 어떻게해야할까?
        //빈배열 선언
        int[] lottoNumbers = new int[6]; //열
        //게임횟수
        int round = 5; // 5번 반복설정
        // 게임횟수를 반복하기 위한 반복문
        for (int j = 0; j < round; j++) {


            // 배열을 대입하기 위한 for문 작성
            for (int i = 0; i < lottoNumbers.length; i++) {
                lottoNumbers[i] = (int) (Math.random() * 45) + 1;
            }
            Arrays.sort(lottoNumbers); // Arrays.sort()를 사용하여 배열을 오름차순으로 정렬
            System.out.println(Arrays.toString(lottoNumbers));  // 생성된 로또 번호를 출력 (배열을 문자열로 변환하여 출력)


        }
    }
}
