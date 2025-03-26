package ch12_arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays15LottoGameAnswer {
    public static void main(String[] args) {
        Random random = new Random();
        // 6개의 로또 번호를 저장할 배열 선언
        int[] lottoNumbers = new int[6]; // 6개의 로또 번호를 저장할 배열
        int round = 5;  // 로또 번호를 생성할 라운드 횟수 (5번 반복)
        int temp = 0;  // 랜덤 번호를 저장할 임시 변수
        boolean dunplcate;  // 중복 여부를 확인할 변수

        // 5번의 라운드를 반복하면서 로또 번호를 생성
        for (int j = 0; j < round; j++) {
            // 각 라운드마다 6개의 로또 번호를 생성
            for (int i = 0; i < lottoNumbers.length; i++) {
                dunplcate = false;  // 중복 여부를 초기화

                // 1부터 45까지의 랜덤 번호 생성 (Math.random()을 사용)
                temp = (int) (Math.random() * 45) + 1;

                // 이미 생성된 번호들과 비교하여 중복 여부를 체크
                for (int k = 0; k < i; k++) {
                    // 만약 이미 생성된 번호와 같은 번호가 있다면
                    if (lottoNumbers[k] == temp) {
                        dunplcate = true;  // 중복이라고 표시
                    }
                }

                // 만약 중복된 번호가 아니라면, 배열에 번호를 저장
                if (!dunplcate) {
                    lottoNumbers[i] = temp;  // 중복되지 않으면 현재 번호를 배열에 저장
                } else {
                    // 만약 중복된 번호라면, i를 하나 감소시켜서 같은 인덱스를 다시 시도
                    i--;  // 중복이므로 이전 인덱스(i)를 다시 시도할 수 있도록 1 감소
                }
            }

            // 6개의 로또 번호를 오름차순으로 정렬
           Arrays.sort(lottoNumbers);

            // 생성된 로또 번호를 출력
            System.out.println(Arrays.toString(lottoNumbers));
        }
    }
    }

