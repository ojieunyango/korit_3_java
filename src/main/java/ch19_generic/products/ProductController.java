package ch19_generic.products;

import java.util.Date;

/*
    1. ProductController.java를 생성하시고, 다양한 타입의
    상품 정보를 저장하고, 출력하는 코드를 작성하ㅣㅅ오.

    실행 예
        Product(productName=Laptop, productInfo=Intel i7, 16GB RAM, 512GB SSD) String
        Product(productName=Smartphone, productInfo=799.99) Double
        Product(productName=Available, productInfo=true)    Boolean

 */
public class ProductController {
    public static void main(String[] args) {
       Date now = new Date();

        Product<String> product1 =
                new Product<>("Laptop","Intel i7, 16GB RAM, 512GB SSD" );
        Product<Double> product2 =
                new Product<>("Smartphone", 799.99);
        Product<Boolean> product3 =
                new Product<>("Available", true);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);


    }
}