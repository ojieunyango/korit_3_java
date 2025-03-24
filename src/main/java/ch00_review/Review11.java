package ch00_review;
/*
user 클래스를 수정하여 패스워드 필드를 외부에서 볼수없도록 변경하고 대신 안전하게 값을 얻을수 있는 메서드를 유저 클래스에 구현하시요
이후 리뷰11 클래스에서 패스워드 출력하느 코드 작성
 */
class User {
    public String name;
    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
public class Review11 {
    public static void main(String[] args) {
        //객체생성
        User user = new User();
        // name 필드와 password 필드에 각각 다른 방법으로 데이터를 대입해야 함
        // public / private이라는 접근 지정자 차이 때문에 생겨남.
        // 1. name 필드에 값 대입 : public이라서 직접 접근이 가능

        user.name="user1";
        System.out.println(user.name);
// 2. password 필드에 값 대입 : private 이기 때문에 메서드로 우회해야함.(setter)
        user.setPassword("qwer1234");
        // 그렇다고 하더라도 마찬가지로 입력한 password를 콘솔에서 확인 불가능 (getter)
        System.out.println(user.getPassword());





    }
}
