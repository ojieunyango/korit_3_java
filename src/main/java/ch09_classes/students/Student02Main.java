package ch09_classes.students;

public class Student02Main {
    public static void main(String[] args) {


    // Student2 클래스를 사용한 객체 생성 -> 비어있는 속성값 대입 -> showInfo() 실행

    // 객체 생성
    Student02 student6 = new Student02();
    Student02 student7 = new Student02(2025002);
    Student02 student8 = new Student02("김삼");
    Student02 student9 = new Student02(2025004, "김사");
    Student02 student10 = new Student02(2025005, "김오", 80.7);

    student6.studentCode = 2025001;
    student6.name = "김일";
    student6.score = 4.5;

    student7.name = "김이";
    student7.score = 100;

    student8.studentCode = 2025003;
    student8.score = 95.8;

    student9.score = 4;

        student6.showInfo();
        student7.showInfo();
        student8.showInfo();
        student9.showInfo();
        student10.showInfo();

 }
}


