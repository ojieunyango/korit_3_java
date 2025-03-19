package ch09_classes.students;

public class Student02 {
    // 필드 선언
    int studentCode;
    String name;
    double score;

    // 생성자들 정의
    Student02() {
        System.out.println("기본 생성자로 객체가 생성되었습니다.");
    }

    Student02(int studentCode) {
        this.studentCode = studentCode;
        System.out.println("int 매개변수 생성자로 객체가 생성되었습니다.");
    }

    Student02(String name) {
        this.name = name;
        System.out.println("String 매개변수 생성자로 객체가 생성되었습니다.");
    }

    Student02(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
        System.out.println("int, String 매개변수 생성자로 객체가 생성되었습니다.");
    }

    Student02(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
        System.out.println("int, String, double 매개변수 생성자로 객체가 생성되었습니다.");
    }

    // showInfo() -> call1() -> {}내부에 sout
    void showInfo() {
        System.out.println("\n" + name + " 학생의 정보입니다.\n학번 : " + studentCode);
        System.out.println("이름 : " + name + "\n점수 : " + score);
    }

}




