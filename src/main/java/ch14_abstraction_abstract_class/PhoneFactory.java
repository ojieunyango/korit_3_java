package ch14_abstraction_abstract_class;

public class PhoneFactory extends Factory {
    public PhoneFactory(String name) {
        super(name);

    }

    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 스마트폰을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("스마트폰 공장을 관리합니다.");
    }
}


// 생성자 및 메서드를 일일이 복사 및 타이핑 할 필요없음
    // 빨간거 뜰때마다 딸깍딸깍!!!

