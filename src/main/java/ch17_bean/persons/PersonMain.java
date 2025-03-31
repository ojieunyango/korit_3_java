package ch17_bean.persons;

public class PersonMain {
    @Override
    public String toString() {
        return "PersonMain{}";
    }

    public static void main(String[] args) {
        Person person = new Person("김일", 20);
        Person person1 = new Person("김이");  //final 때문에 필수로 입력

        person1.setAge(67);

        System.out.println(person);
        System.out.println(person1);

      PersonLombok personLombok = new PersonLombok("김삼");
      PersonLombok personLombok1 = new PersonLombok("김사", 12);

      personLombok.setAge(78);

        System.out.println(personLombok);
        System.out.println(personLombok1);

        // PersonLombok personLombok2 = new PersonLombok();  //name 필드의 @NonNull 때문에 오류발생함

    }
}
