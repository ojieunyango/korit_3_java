package ch18_static;

import lombok.Getter;
//static 변수(정적변수) 를 선언 및 초기화
@Getter
public class Product {
    @Getter  //필드레벨에서의 getter
    private static int count =0;

    private static String title ="제품입니다";

    public static String getTitle(){
        return title;
    }
    // 멤버 변수선언 및 초기화
    private int instanceCount =0;

    public Product(){
        System.out.println("product클래스의 인스턴스가 생성되었습니다.");
        count++;
        instanceCount++;
    }
}
