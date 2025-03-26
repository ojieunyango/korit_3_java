package ch13_inheritance;

public class Tiger extends Animal { //자식 클래스명 extends 부모클래스명으로 상속
    // 필드 안써도 됨

    public Tiger() {
    }

    public Tiger(String animalName) {
        super(animalName);
    }

    public Tiger(int animalAge) {
        super(animalAge);
    }

    public Tiger(String animalName, int animalAge) {
        super(animalName, animalAge);
    }
    // getter setter를 자동생성할려면 필드값이 잇어야함 없어서 오버라이드하는거임
    // override라고 적혀있는게 상속받았다는 의미
    @Override
    public String getAnimalName() {  //그냥 수퍼()라고 되어있는건 부모클래스
        return super.getAnimalName();  //super.메서드명() 이거는 실행호출시킨다는 의미
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
      //  super.move();

        System.out.println(" 네발로 움직입니다.");
    }
    public void hunt(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
