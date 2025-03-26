package ch13_inheritance.products;

public class ProductMain {
    public static void main(String[] args) {
        //Item item = new Item(); 여기서 오류나는건 여기서 수정 불가능
        // AllArgsConstructor인데 ()안에 argument 안 집어넣어서
        Item item1 = new Item("일반상품", "일반 카테고리");
        /*
        Item 클래스 건드리지말고 getter이용해서 다음과 같은 출력문 나오도록 작성하시오
        이상품은 일반 상품입니다
        이상품은 일반 카테고리입니다
       */
        System.out.println("이상품은 일반 상품입니다");
        System.out.println("이상품은 "+ item1.getName());
        System.out.println("이상품은 "+ item1.getCategory());


        Product product1 = new Product("전자제품", "가전제품", 10000, 10);
        product1.setCategory("백색 가전 제품");
        System.out.println("이 상품은 "+ product1.getCategory());
        product1.displayInfo();
    }

}
