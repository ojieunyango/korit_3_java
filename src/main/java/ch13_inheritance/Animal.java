package ch13_inheritance;

public class Animal {
    //필드 생성
    private String animalName;
    private int animalAge;

    //생성자를 자동 생성하세요
    public Animal() {
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }
    //setter getter 자동생성

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }
    // 메서드 정의
    public void move(){
        System.out.println("움직입니다.");
    }

}
