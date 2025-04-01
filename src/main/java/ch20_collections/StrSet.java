package ch20_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StrSet {
    public static void main(String[] args) {


        // Set 객체생성
        Set<String> strSet = new HashSet<>();
        //List 객체 생성
        List<String> strList = new ArrayList<>();
        //Set 에 element 삽입 -> .add()
        strSet.add("1");
        strSet.add("2");
        strSet.add("2");
        strSet.add("3");
        strSet.add("3");
        strSet.add("3");

        //Set의 출력
        System.out.println(strSet);// 순서를 보장 안함
        // 특정  element 의 추출 -> 추출의 변환
        strList.addAll(strSet);

        // List 출력
        System.out.println(strList);  // List는 순서를 보장합니다.
    }
}

