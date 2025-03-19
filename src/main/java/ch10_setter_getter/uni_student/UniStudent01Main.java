package ch10_setter_getter.uni_student;
/*
 4. UnivStudentMain 생성하시고
        student1 -> 기본 생성자 김일 / 1 / 3.3
        student2 -> 기본 생성자 김이 / 3 / -30 -> 실패하고 4.0
        student3 -> 기본 생성자 김삼 / 5 -> 실패하고 2 / 2.7
        student4 -> 기본 생성자 김사 / 4 / 3.8
        student5 -> 기본 생성자 김오 / 2 / 1.0

    5. 콘솔창에
        이름 : 김일
        학년 : 1학년
        점수 : 3.3
    으로 출력될 수 있도록 showInfo() 메서드를 call1() 유형으로 작성하시오.
    student1.showInfo();
    student2.showInfo();
    student3.showInfo();
    student4.showInfo();
    student5.showInfo();
 */
public class UniStudent01Main {
    public static void main(String[] args) {
        //객체생성
        UniStudent01 uniStudent01 = new UniStudent01();
        UniStudent01 uniStudent02 = new UniStudent01();
        UniStudent01 uniStudent03 = new UniStudent01();
        UniStudent01 uniStudent04 = new UniStudent01();
        UniStudent01 uniStudent05 = new UniStudent01();
        //객체에 각 대입
        uniStudent01.setName("김일");
        uniStudent01.setGrade(1);
        uniStudent01.setScore(3.3);

        uniStudent02.setName("김이");
        uniStudent02.setGrade(3);
        uniStudent02.setScore(-30);
        uniStudent02.setScore(4.0);

        uniStudent03.setName("김삼");
        uniStudent03.setGrade(5);
        uniStudent03.setGrade(2);
        uniStudent03.setScore(3.3);

        uniStudent04.setName("김사");
        uniStudent04.setGrade(4);
        uniStudent04.setScore(3.8);

        uniStudent05.setName("김오");
        uniStudent05.setGrade(2);
        uniStudent05.setScore(1.0);

        uniStudent01.showInfo();
        uniStudent02.showInfo();
        uniStudent03.showInfo();
        uniStudent04.showInfo();
        uniStudent05.showInfo();


    }
}
