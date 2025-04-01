package ch18_static.builders;

import lombok.Builder;
import lombok.ToString;

@ToString
public class Person {
    private String name;
    private int age;
    private  String address;

    private Person (Builder builder){
        //argument 대입이 아니라 builder 객체의 속성값을 그대로 person에 대입해여 Person 객체를 생성하겠다는 의미
        //private이라서 builder를 통해서면 객체생성이 가능
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;

    }
    // 객체를 생성하는 main단계에서 일반 생성자가 아니라 Builder를 통해 Person 객체를 생성할거라서 public static 선언함
    public  static class Builder{
        private String name;
        private int age;
        private String address;

        // 이하의 코드는 메서드에 해당, 대부분의 경우 동사는 행위를 나타내기 때문에 동사로 작성되지만 builder의 경우 대입된 필드의 이름과
        //동일한 메서드 명을 짓습니다. 즉, Builder.name("안근수"); 와 같은 식으로 코드작성 됨.
        // Person 객체는 name 에 안근수라는 속성값을 가지게 됨
        public Builder name(String name){
            this.name = name;
            return this;
        }
        // Builder.name("안근수").age(38); 연달아서 적을수잇는걸 체이닝 메서드라고 함
    public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        // 이상의 코드까지는 필드에 속성값을 집어넣는 메서드들이었습니다
        public Person build(){
            return new Person(this);
        }
    }

}
