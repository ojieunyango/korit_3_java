package ch01_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
//        // Scanner 클래스 import
          Scanner scanner = new Scanner(System.in);

//          System.out.print("올해 년도를 입력하세요>>>");  // print/ println ln은 라인을 바꿔주는거임
//          //int year = scanner.nextInt();
//          String year = scanner.nextLine();
//         // System.out.println(year);
//        System.out.println("올해는" + year + "년입니다");
//        System.out.println("내년은"+ (year + 1)+ "년입니다");

//        System.out.println("당신의 이름을 입력하세요 >>> ");
//        String name = scanner.nextLine();
//
//        System.out.println("제이름은" + name + "입니다");

        /*
        String 자료형으로 변수를 선언하고 초기화 할때
        String 변수명 = Scanner.nextLine();

        int 자료형으로 변수를 선언하고 초기화 할때
        int 변수명 = scanner.nextInt();
        double 자료형으로 변수를 선언하고 초기화할때
        double 변수명 = scanner.nextDouble();

        scanner를 사용할때 여러분들은 결국 콘솔에 입력한 데이터를 변수에 저장하게 되는데
        그자료형을 고려하여 작성할 필요가 있습니다.

         */

//        System.out.println("키를 입력해주세요>>>");
//        double height = scanner.nextDouble();
//        System.out.println(height);

        // 실행 예
        // 나이를 입력하세요 >>19

        System.out.println("나이를 입력하세요");
        int age = scanner.nextInt();
        System.out.println("저는 올해" + age + "살입니다");
        System.out.println("내년에는"+ (age+1)+ "살입니다");

        System.out.println("올해는 몇년를 입력하세요");
        int year = scanner.nextInt();
        System.out.println("올해는"+year+"입니다");
        System.out.println("내년은"+ (year +1)+ "입니다");

    }
}
