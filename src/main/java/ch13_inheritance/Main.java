package ch13_inheritance;
/*

 */
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("나비");
        Animal animal3 = new Animal(1);
        Animal animal4 = new Animal("바둑이",2);

        Human human = new Human();
        Human human1 = new Human("양지은", 30);
        human1.move();
        human1.read( "자바의 기초");

        System.out.println("안녕하세요. 제 이름은 "+human1.getAnimalName()+"이고, 나이는 "+ human1.getAnimalAge()+"몇살입니다.");
        System.out.println("내년에는 "+ (human1.getAnimalAge()+1)+"살이 됩니다.");

        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("푸바오");
        tiger1.setAnimalAge(4);

        System.out.println(tiger1.getAnimalName()+"은 올해 " + tiger1.getAnimalAge()+"살 입니다.");

        tiger1.move(); // super.move()d; 일경우 -> 움직입니다 출력
        tiger1.hunt();
        animal1.move();




    }

    }

