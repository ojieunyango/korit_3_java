package ch20_collections;

import java.util.*;

public class StrList {
    public static void main(String[] args) {


        List<String> strList = new ArrayList<>(); // 배열은 방의 갯수가 정해져있고 리스트는
        int[] intArray = new int[3]; // 인덱스 넘버는 고정시켜야함

        // 배열값을 넣는 방법
        intArray[0] = 1;
        //List에 값을 넣는  방법
        strList.add("java");
        strList.add("python");
        strList.add("C#");
        strList.add("Javascript");
        strList.add("Kotlin");
        // 출력
        System.out.println(intArray);//이러면 주소값만 나옴
        System.out.println(Arrays.toString(intArray));
        System.out.println(strList); // toString()이 정의되어있음
        // 특정 element(리스트내의) 검색 -> contains()메서드 사용
        String searchElem1 = "python";
        boolean contains1 = strList.contains(searchElem1);
        System.out.println(searchElem1+"포함여부: "+ contains1);

        String searchElem2 ="py";
        boolean contains2 = strList.contains(searchElem2);
        //String 에서의 .contains() 메서드의 ㅣ경우 "내부스트링데이터"에서 한문자씩 다 걸러서 확인이 가능하지만 List의 경우는 element의
        //full word를 기준으로 검색합니다
        // 특정 element의 삭제 -> remive()
        String removeElem = "kotlin";
        boolean removed = strList.remove(removeElem);  //.pep();
        System.out.println(removeElem+"삭제여부: "+ removed);
        System.out.println(strList);

        String removeElem2 = "py";
        boolean removed2 = strList.remove(removeElem2);
        System.out.println(removeElem2+"삭제 여부: "+removed2);
        System.out.println(strList);

        Collections.sort(strList);
        System.out.println("정렬된 List"+strList);

        //List 역순 정렬 -> Collections.reverseOrder()
        Collections.sort(strList, Collections.reverseOrder());
        System.out.println("역순 정렬 List"+strList);

        System.out.println(strList.get(0)+"언어");
        System.out.println(strList.get(0)+"언어");

        for (int i =0; i <strList.size(); i++){
            System.out.println(strList.get(i));
        }
        for (String elem : strList){
            System.out.println(elem);
        }

    }
}