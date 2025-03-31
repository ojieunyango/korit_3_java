package ch18_static;

public class ProductMain {
    public static void main(String[] args) {
        // 정적 메서드이 호출
        System.out.println(Product.getCount());
        // 객체 생성
      Product product = new Product();
      //count / instanceCount 값 확인
        System.out.println(Product.getCount());  // 정적 메서드 호출
        System.out.println(product.getInstanceCount()); //일반 메서드 호출
        // 객체 생성
        Product product1 = new Product();
        System.out.println(Product.getCount());  // 정적 메서트 호출
        System.out.println(product1.getInstanceCount());  //일반메서트 호출

        System.out.println("prduct1: " + product1.getInstanceCount());



      Product product2 = new Product();
        System.out.println(Product.getCount());
        System.out.println("prduct2: " + product2.getInstanceCount());

        Product product3 = new Product();
      System.out.println(Product.getCount());
        System.out.println("prduct3: " + product3.getInstanceCount());

        Product product4 = new Product();
      System.out.println(Product.getCount());
        System.out.println("prduct4: " + product4.getInstanceCount());

        Product product5 = new Product();
      System.out.println(Product.getCount());
        System.out.println("prduct5: " + product5.getInstanceCount());

      Product product6 = new Product();
      System.out.println(Product.getCount());
        System.out.println("prduct6: " + product6.getInstanceCount());

      System.out.println(Product.getTitle()); // 클래스.메서드명()으로 static메서드
    }

}
