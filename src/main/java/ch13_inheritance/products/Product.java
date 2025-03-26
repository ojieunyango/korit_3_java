package ch13_inheritance.products;
// 부모의 속성과 자식의 속성을 전부 다 입력해야하는 AllArgsConstructor를 생성하시오
// 부모 속성의 setter getter
//자식 속성의 setter getter를 정의하시오
public class Product extends Item {
    private int price;
    private int stock;
// extends가 빨간줄 생겨서 눌러서 부모속성만 받아오고 나서 생성자 getter setter 만들고 지우면 오류 안생김 그리고 수퍼도 같이 뜸
// 위에 과정을 거치지말고 오버라이드로 부르면 됨



    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;  // 매개변수에 가격 재고 입력-> this로 참조도 같이 입력

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public void setCategory(String category) {
        super.setCategory(category);
    }



    public  void  displayInfo(){
        System.out.println("제품명: "+this.getName());
        System.out.println("카테코리: "+ this.getCategory()); // 부모 클래스이긴한데 서로 다른 클래스가 private이라서
        System.out.println("가격: "+ price); // 같은 클래스라서 private 이라도 상관없음
        System.out.println("재고: "+ stock);
    }
}
/* 이상까지의 코드를 작성했을때 ProductMain 에서 할수있는것
1. 객체 생성을 필드를 전부 초기화 했을때 할수있음
2. 부모속성이든 자식 속성이든 상관없이 getter/setter
고유메서드

 */

