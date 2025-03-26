package ch13_inheritance.book;

public class EBook extends Book{
    private double fileSize;
    private String format;

    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }
    public  void  displayInfo(){
        System.out.println("제목: "+ getTitle());
        System.out.println("저자: "+ getAuthor());
        System.out.println("파일크기: "+ fileSize);
        System.out.println("파일 형식: "+ format);
    }

}
