package ch14_abstraction.abstract_class;

public class Main {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성을 할수없다
        Factory factory1 = new Factory("가전제품공장") { // 이론적으론 생성안됨... 하지만 이렇게 생성하면 오버라이드 같이 뜸
            @Override
            public void produce(String model) {
                System.out.println(this.getName()+"에서 ["+ model+"] 을 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("가전 제품 공장을 관리합니다.");

            }


        }; // 특이하게 }; 로 마무리되는데 메서드를 정의한게 아니라 객체 생성한거라서 !!!!!!!!!!!
        factory1.displayInfo();
        factory1.produce("백색 가전 냉장고");
        // 이상의 개념은 익명 클래스라는 건데 java17 혹은 11 에서 처음 도입
        // 재사용하지 않고 한번만 쓰고 치월 예정이라면 (즉 메인에서만 쓴다면) 사용하기 좋음

        // 이제 그 추상 클래스의 객체 말고 상속 받은 phoneFactory의 객체 생성 하겠습니다
        PhoneFactory phoneFactory = new PhoneFactory("애플 스마트폰 공장");

        phoneFactory.produce("아이폰17");
        phoneFactory.manage();

        phoneFactory.setName("삼성 스마트폰 공장");
        phoneFactory.displayInfo();

        TableFactory tableFactory1 = new TableFactory("애플 태블릿 공장");

        tableFactory1.setName("구글 태블릿 공장");

        System.out.println("현재 공장은 "+ tableFactory1.getName()+"으로 변경");

        tableFactory1.manage();

        tableFactory1.upgrade("구글 테블릿 10 인치 2세대");
    }
}