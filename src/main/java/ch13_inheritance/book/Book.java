package ch13_inheritance.book;
/*
부모 클래스 Book
자식 EBook
실행 BookMain

지시사항
1. private title / author
2. 생성자는 AllArgsconstructor
3. setter getter
EBook 클래스에서 EBook 클래스는 Book 을 상속 받아야합니다 자식 필드로 double fileSize /String format displayInfo() 메서드롤
call 1 타입으로 정의
제목:
저자:
파일크기:
파일 형식:

북메인으로 넘아가서 북 클래스이 인스턴스를 생성 제목이랑 저자 출력 getter 이용
실행
이 책의 제목은 자바의 정석입니다
이책의 저자는 남궁성 입니다

이북 클래스의 인트턴스를 생성합니다
스프링 입문/ 이강준/ 5,2/EPUB
그 다음은 setter 이용하여 PFD로 변환
그다음 getter 이용해서 이전자핵의 포맷은 PDF 입니다 출력할것
 */
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
