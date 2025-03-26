package ch12_arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays17LottoClean {

    public static void main(String[] args) {

        Random random = new Random();

        int[] lottoNumbers = new int[6]; //열
        int round = 5;
        int temp = 0;   // 랜덤 번호를 저장할 임시 변수 temporary
        boolean dunplcate; //중복이 되었을때  true로 바꿔서 조건문을 실행시킬 예정

        for (int j = 0; j < round; j++) {
            for (int i = 0; i < lottoNumbers.length; i++) {
                dunplcate = false;  // 여기 왜 있는지 중요 -> 중복 여부를 초기화
                temp = (int) (Math.random() * 45) + 1; //temp에 들어간 난수가 이전 배열의 element와 값이 겹치는지 확인해야함
                for (int k = 0; k < i; k++) {    // 이미 생성된 번호들과 비교하여 중복이 있는지 확인하는 반복문
                    if (lottoNumbers[i] == temp) { //temp랑 겹치는게 있다면
                        dunplcate = true; //   중복되었다고 표시
                    }
                }
                if (!dunplcate) {   // duplicate 가 false라며 !duplicate가 true이므로 중복이
                    lottoNumbers[i] = temp;
                }else {
                    // 대입이 아니라 다시 뽑아야함
                    i--;
                    //i=3일때 실행이 되었다면
                    //i=2 로 바뀌게 됩니다

                }


                }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));


        }
    }
}



