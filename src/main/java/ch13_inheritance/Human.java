package ch13_inheritance;
/*
Tiger.java처럼 Animal클래스를 상속받고 생성자 및 getter/setter 다 정의하시고 Animal 클래스의 move()메서드를 오버라이딩하여
"사람이 두발로 걷습니다" 만 출력하도록 재정이하기

Main java에서 human1 객체를 생성하여 (기본생성자) setter를 활용 이름과 나이를 입력 gettr를 활용하여
안녕하세요 제이름은 00 이고 나이는 00 몇살입니다
내년에는 몇 +1 살이 돕니다 출력하기

콘솔에
여러분 00 은 자바의 기초를 읽는 중입니다 출력

-> read 메서드 이상의 호출 방식을 봣을 때 call2유형
 사람 객체가 생성되었습니다.
    사람이 두 발로 걷습니다.
    안녕하세요, 제 이름은 여러분이름이고 나이는 몇살입니다.
    내년에는 몇+1살이 됩니다.
    여러분이름은 자바의 기초를 읽는 중입니다.
 */
public class Human extends Animal {
    //상속을 받게되면 Animal 클래스의 필드를 그대로 사용 가능합니다. 고유메서드처럼 고유속성도 가질수있습니다.
    String smartPhone;

    public Human() {
        System.out.println("사람 객체가 생성되었습니다.");
    }

    public Human(String animalName, int animalAge, String smartPhone) {
        super(animalName); //부모 필드를 그대로 대입함
        this.smartPhone = smartPhone;
    }

    public Human(int animalAge) {
        super(animalAge);
    }

    public Human(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override
    public void move() {
        //super.move();
        System.out.println("사람이 두발로 걷습니다. ");
    }
    public void read(String book){
        System.out.println(getAnimalAge()+"은, "+book+"를 읽고 있는 중입니다.");
    }

    // 새로 만든 필드인 smartPhone에 관한 getter setter 추가적으로 작성 필요함

    public String getSmartPhone() {
        return smartPhone;
    }

    public void setSmartPhone(String smartPhone) {
        this.smartPhone = smartPhone;
    }
}
