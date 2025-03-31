package ch18_static.singleton.products;

public class ProductView {
    // 정적 변수 선언-> ProductView 클래스의 instance: 여기에 생성자 대입할 예정
    // 보통 싱글톤 만들거며 정적 변수이름이 instance입니다 -> 시험시 힌트중하나
    private static ProductView instance; //Product 클래스의 instance를 정적변수필드에
    //private으로 생성자 선언-> 싱글톤 패턴시의 중요한 지점
    private ProductView(){
        int counter = 1;  // 일종의 객체 필드라고 할수있습니다
        System.out.println(counter+"번째 객체가 생성되었습니다.");
        counter++;

    }// static 메서드 정의 -> 대부분의 경우 getInstance()-> 시험시 힌트중 하나
    public  static  ProductView getInstance(){
        if (instance==null){  // 현재 인스턴스가 없다면 얘가 실행됨
            instance = new ProductView(); // ProductView 객체생성
        }                        // 그 생성자를 정적변수인 instance에 대입 근데 조건문이 실행안되엇다면 instance!=null이기 때문에
                                // 이미 ProductView 객체가 생성되었아는 뜻
        return instance;
    }

    public void showMainView(){
        System.out.println("상품정보를 보여주는 메인 화면");
    }
    public void showOrderView(){
        System.out.println("주문정보를 보여주는 화면");
    }
}
