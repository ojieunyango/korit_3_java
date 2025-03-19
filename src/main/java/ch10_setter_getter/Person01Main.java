package ch10_setter_getter;

public class Person01Main {
    public static void main(String[] args) {
        Person01 person01 = new Person01(-10);
//        person01.name = "안근수";
//        System.out.println(person01,name);
//        System.out.println(person01.age);
//        person01.age = 38; //private 적용후에 오류발생해서 주석처리
        //메서드 호출방식 : 객체명.메서드명();
        person01.setName("안근수");
        person01.setAge(38);
        person01.setAge(300);



        System.out.println(person01.getName());
        person01.setName("레오나르도 디카프리오");
        System.out.println(person01.getName());



    }
}
