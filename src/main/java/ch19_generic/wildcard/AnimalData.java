package ch19_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AnimalData<T> {
    private T animal;

    public void printData(){
        ((Animal)animal).move();
        //AnimallData의 필드인 animal을 Animall 타입으로 형변환하고 .move() 메서드를 호출
        if (animal.getClass()== Human.class){
            ((Human)animal).read(); //현재필드인 animall의 클래스를 조사하여 (.getClass())를 통해 그것이 human 클래스라면 휴먼 고유메서드 실행
        } else if (animal.getClass()== Tiger.class) {
            ((Tiger)animal).hunt();
        }
    }


}
