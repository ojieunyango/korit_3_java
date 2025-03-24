package ch00_review;
/*
 지시사항
 학생정보를 저장하는 클래스를 구현
 다양한 접근 지정자를 조합하여 정보은닉 및 제한된 접근을 적용

 학생 클래스의 필드는 name, age, studentId, password
 name: 외부에서 읽고 쓸수있어야함 : 김일
 age : 외부에서 읽고 쓸수있어야함 : 20250001
 stdentId: 같은 패키지에서만 접근 가능해야함 : 17
 password: 외부에서 직접 접근이 불가능해야함 -> setter만 제공 : qwer1234

 showInfo()를 사용하
 */
class Student{

    public String name = "";
    public int age =0;
    protected int studentId = 0;
    private String password = "";

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setPassword(String password) {
        this.password = password;

    }
    public void showInfo(){
        System.out.println("학번: "+studentId);
        System.out.println("이름: "+name);
        System.out.println("나이: "+age);
       // System.out.println("비밀번호: "+ password);
    }
}

public class Review12 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name="김일";
        student.age=17;
        student.studentId=20250001;

//        System.out.println(student.name);// 외부에서 접근 가능하니까 참조 가능
//        System.out.println(student.studentId); // 같은 패키지에 있으니까 참조 가능
        // 비밀번호는 private이라서 입력하는게 이상과 같은 방법으로는 불가능 하다 -> setter
        student.setPassword("qwer1234");
        student.showInfo();


    }
}
