package ch18_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        // ProductView productView = new ProductView(); private으로 선언해서 오류뜸
        ProductView productView1 = ProductView.getInstance(); // 이렇게해야 오류안뜸
        ProductView productView2 = ProductView.getInstance(); // 이렇게해야 오류안뜸
        ProductView productView3 = ProductView.getInstance(); // 이렇게해야 오류안뜸
        ProductView productView4 = ProductView.getInstance(); // 이렇게해야 오류안뜸
        //이상의 코드에서 복수의 객체를 만든것처럼 보이지마 실제로 ProductView.getInstance();의 결과값은 동일한 instance이기때문에
        //실제 생성된 객체의 개수는 한개밖에 없음

        // 콘솔창에 1 줄만 출력됨 적어도 static변수로 counter를 선언했다면 1,2,3,4번째 객체가 생성되었습니다
        // 코드를 자세히 봤다면 생성자 내부의 int counter가 지역변수이기 때문에 한번만 출력되었다는 것은 생성자 호출자체가 한번만 있었다는 의미
        productView1.showMainView();
        productView2.showMainView();
        productView2.showOrderView();
    }
}
