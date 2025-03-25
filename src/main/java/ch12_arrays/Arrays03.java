package ch12_arrays;

import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"추영우","허남준","서강준","양지은","진기주","이은정","윤현지","박형식", "김성철"};

        // 특정 배수를 추출하기 위한 기준점 변수
        System.out.println("어떤 숫자 배수번호를 출력하시겠습니까?");
        int specifiNum = scanner.nextInt();
        int specificNum = 3;

        for (int i =0; i < names.length; i++){
            if((i+1)% 2 ==0){
                System.out.println(names[i]+" ");
            }
        }
    }
}
