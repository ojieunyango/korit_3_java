package ch12_arrays;

import java.util.Arrays;

public class Arrays14 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5]; // 20개의 행과 5개의 열을 가진 2차원 배열 nums 선언
        int number = 0;                // 숫자를 1부터 시작해서 증가시키기 위한 변수
        // 1부터 100까지의 숫자를 nums 배열에 순서대로 값을 넣으시오
        /*
        [1,2,3,4,5],
        [6,7,8,9,10],
        [11,12,13,14,15],
        [16,17,18,19,20],
        ....100]

         */

        // 2차원 배열 nums의 모든 원소에 값을 할당하는 반복문
        for (int i = 0; i < nums.length; i++) {    // 행을 순회하는 반복문
            for (int j = 0; j < nums[i].length; j++) {    // 열을 순회하는 반복문
                nums[i][j] = ++number; // number 값을 1 증가시킨 후 그 값을 nums[i][j]에 대입
            }
        }
        // 2차원 배열 nums의 모든 원소를 출력하는 반복문
            for (int i = 0; i < nums.length; i++) {   // 행을 순회하는 반복문
                for (int j = 0; j < nums[i].length; j++) {  // 열을 순회하는 반복문
                    System.out.print(nums[i][j] + "/");   // 현재 원소 값에 "/"를 붙여 출력
                }
                System.out.println();   // 각 행이 끝날 때마다 빈 줄을 출력 (행마다 한 줄 띄우기)
            }
            // 2차 배열의 출력: Arrays.deepToString(배열명));
           // Arrays.toString()이 안먹힌다는것을 확인
        System.out.println(Arrays.deepToString(nums));
        }
    }
