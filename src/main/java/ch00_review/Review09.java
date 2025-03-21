package ch00_review;
/*
getter/setter
객체명.속성명= 속성값의 형태로 여태까지 속성값을 대입해옴 바꾸는것도 가능햇음 그래서 배터리타임에 음수를 집어넣더라도 자료형이 인트이기대문에
속성값을 대입하는것은 가능
논리적으로 불가능해도 자료형만 맞아떨어지면 그대로 받아들임

악의적으로 클래스 외부에서 데이터를 조작하는것도 가능하다
이와같이 잠재적인 문제를 막기위해서 다른클래스에서 직접적으로 속성값을 바꾸는것을 막고 특정 매서드를 경유해야지만 속성값을 대입할수있도록
처리하는것이 getter/setter 및 접근 지정자 개념입니다
1. setter: 속성값을 대입하기 위한 메서드를 통칭합니다
set 속성명으로 이루어져잇음
내부 로직을 작성하여 필드의 논리적인 개념에 맞지않는 데이터를 걸러낼수있습니다(베터리타임이 음수면 메서드르 정지시킬수잇음)
콜2 유형
2.getter: 속성값을 조회하기 위한 메서드를 통칭
get속성명으로 이루어져잇음
콜3유형. 메인단계에서 데어터 조회시의 조작이 가능합니다
예시) System,out,println(watch1.getButton()+!);//true
setter와 마친가지로 alt + ins 통해서 작성가능
지시사항
 1. 기본생성자 / 이름을 필수로 갖는 매개변수 생성자를 정의할 것
        2. 모든 필드에 대해 Setter를 정의할 것
        3. setBatteryTime()의 구현부에 batteryTime이 10 미만이라면 method 정지시킬 것
        4. watch1에 setter를 활용하여,
            button true
            celular true
            batteryTime -10 -> 실패하고 -> 18
            title 애플워치
            로 객체를 생성하시오.

        5. showInfo()를 정의하여
            이 시계는 애플워치입니다. 배터리타임이 18이지요.
            감사합니다.
            를 출력시킬 것
 */
class SmartWatch {
    private boolean button;
    private boolean celular;
    private int batteryTime;
    private String title;

    public SmartWatch(String title) {
        this.title = title;
    }

    public SmartWatch(boolean button, boolean celular, int batteryTime, String title) {
        this.button = button;
        this.celular = celular;
        this.batteryTime = batteryTime;
        this.title = title;
    }

    public boolean isButton() {
        return button;
    }

    public boolean isCelular() {
        return celular;
    }

    public int getBatteryTime() {
        return batteryTime;
    }

    public String getTitle() {
        return title;
    }

    public void setButton(boolean button) {
        this.button = button;
    }

    public void setCelular(boolean celular) {
        this.celular = celular;
    }

    public void setBatteryTime(int batteryTime) {
        this.batteryTime = batteryTime;
        if (batteryTime < 0){
            System.out.println("잘못입력하셨습니다.");
            return;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }
    void showInfo(){
        System.out.println("이시계는 "+title+"입니다. 배터리타임이 "+batteryTime+"이지요. 셀룰러는 "+ celular+"입니다.");
    }

}
public class Review09 {
    public static void main(String[] args) {


        SmartWatch watch1 = new SmartWatch("애플와치");

        watch1.setButton(true);
        watch1.setCelular(true);
        watch1.setBatteryTime(-10); // 대입되지않고 실패되도록 작성
        watch1.showInfo(); // 배터리 타임이 대입되지않음을 확인하기 위해 호출
        watch1.setBatteryTime(18);
        watch1.setTitle("애플와치");
        watch1.showInfo();

    }

}
