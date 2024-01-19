package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    Book() {
        this("", "", 0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    } //비워두면 안됨(null이라고 뜸)

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    } //모든 필드를 매개변수로 받는 생성자부터 작성

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    } //반환타입 없음
}
