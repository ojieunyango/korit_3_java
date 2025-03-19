package ch09_classes.students;

public class Student01Main {
    public static void main(String[] args) {
        // 각 생성자를 이용한 객체 생성
        Student01 student1 = new Student01();
        Student01 student2 = new Student01(2025002);
        Student01 student3 = new Student01("김삼");
        Student01 student4 = new Student01(2025004, "김사");
        Student01 student5 = new Student01(2025005, "김오", 80.7);

        // 비어있는 속성에 속성값을 대입하는 코드
        student1.studentCode = 2025001;
        student1.name = "김일";
        student1.score = 4.5;

        student2.name = "김이";
        student2.score = 100;

        student3.studentCode = 2025003;
        student3.score = 95.8;

        student4.score = 4; //double이라 어차피 4.0으로 뜹니다

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();

        // Student2 클래스를 사용한 객체 생성 -> 비어있는 속성값 대입 -> showInfo() 실행

    }
}