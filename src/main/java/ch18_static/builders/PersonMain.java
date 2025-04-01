package ch18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        // Person 객체인 person1을 만든다고 가정하겠습니다
      //  Person person1 = new Person("안근수", 38, "부산광역시 연제구");
        // 여기까지가 여태까지 방식
        // 아래는 새로운 방식
        // -  Builder.name("안근수").age(38); 연달아서 적을수잇는걸 체이닝 메서드라고 함(순서상관없고 하나빠져도 됨)
        Person person1 = new Person.Builder()
                .name("안근수")
                .age(38)
                .address("부산광역시 연제구")
                .build();

        System.out.println(person1);
    }
}
