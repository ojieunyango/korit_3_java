package ch17_bean.persons;



public class Person {
    // name에 final 선언하면 빨간줄뜸 -> 여태까지는 NAME 대문자로 고치고 = "데이터" 이런식으로 값을 넣어줘서 초기화했음
    // 지금은 final 필드를 필수적으로 포함하는 매개변수 생성
    private final String name;

    private int age;
    // 필수적인 필드를 포함한 RequiredArgsConstructor를 생성

    public Person(String name) {
        this.name = name;
    }
    // AllArgsConstructor 생성

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
