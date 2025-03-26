package ch13_inheritance.book;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성");
        EBook eBook1 = new EBook("스프링 입문", "이강준", 5.2, "EPUB");

       eBook1.displayInfo();



        System.out.println("이책의 저자는 "+ book1.getAuthor());
        System.out.println("이책의 제목은 "+book1.getTitle());

    }
}
/*이 책의 제목은 자바의 정석입니다
이책의 저자는 남궁성 입니다
이북 클래스의 인트턴스를 생성합니다
스프링 입문/ 이강준/ 5,2/EPUB
그 다음은 setter 이용하여 PFD로 변환
그다음 getter 이용해서 이전자핵의 포맷은 PDF 입니다 출력할것

 */