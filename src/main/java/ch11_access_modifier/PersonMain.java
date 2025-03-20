package ch11_access_modifier;

import ch10_setter_getter.Person01;

class  Person {
    private String name;
    // private이기 때문에 이 Person 클래스 외부에서는 name을
    // 참조할 수 없다 -> 우회방법이 뭐다? setter / getter다.



    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //setter/getter는 access modifier가 public임
    //클래스 외부에서 사용가능
    //우회를 통해서 person클래스의 객체의 속성값을 바꿀수있다
    //이유는? 데이터값을 걸러내는 로직을 쓸수있기때문

    //PersonMain에서 person1 객체를 생성하는데
    //처음 이름을 "김일"로 입렵하고 콘솔에 출력
    //다시 이름을 "이일"로 입력하고 바뀐 이름을 콘솔에 출력
}
public class PersonMain {
    public static void main(String[] args) {
        //객체 생성
        Person person1 = new Person();
        person1.setName("김일");
        System.out.println(person1.getName());
        person1.setName("이일");
        System.out.println(person1.getName());
    }

}
