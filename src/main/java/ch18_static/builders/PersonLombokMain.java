package ch18_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok personLombok1 = PersonLombok.builder()
                .name("안근수")
                .age(38)
                .address("부산광역시")
                .build();

        System.out.println(personLombok1);

        personLombok1.setName("김일");
        personLombok1.setAge(19);
        personLombok1.setAddress("부산광역시 부산진구");
        System.out.println(personLombok1.getName());
        System.out.println(personLombok1.getAge());
        System.out.println(personLombok1.getAddress());

        PersonLombok personLombok2 = PersonLombok.builder()
                .name("김이")
                .build();
        personLombok2.setAge(89);
        personLombok2.setAddress("경상남도 양산시");
        System.out.println(personLombok2);

        PersonLombok personLombok3 = PersonLombok.builder()
                .name("김삼")
                .age(21)
                .build();
        personLombok3.setAddress("광주광역시 북구");


        PersonLombok personLombok4 = PersonLombok.builder()
                .name("김사")
                .age(39)
                .address("서울특별시 마포구로")
                .build();

        System.out.println(personLombok3);
        System.out.println(personLombok4);


    }
}
 /*
            PersonLombok에 seter / getter를 정의하여
            "김일" / 19 / "부산광역시 부산진구"를 적용하여
            sout을 다시 사용하여 정보를 출력하시오.

            person2를 생성하고 이름 - 김이 만 입력하고 객체를 생성하시오
            -> setter 이용/ 89 / 경상남도 양산시
            - 하고 출력
            person3 이름 김삼 나이 21만 입력하고 객체를 생성하시오
            -> setter 이용 / 광주광역시 북구
            - 하고 출력
            person4 김사 / 39 / 서울특별시 마포구로 객체를 생성하시오. ->
            - 하고 출력
         */