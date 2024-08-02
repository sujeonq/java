package test04;

public class Book {
	String title;
	String author;
	String isbn;
	boolean isBorrow;

	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrow = false;
	}

	public void borrowBook() {
		if (!isBorrow) {
			isBorrow = true;
			System.out.println("도서대출 : " + title);
		} else {
			System.out.println(title + " 이미 대출됨");
		}
	}

	public void returnBook() {
		if (isBorrow) {
			isBorrow = false;
			System.out.println("도서반납 : " + title);
		} else {
			System.out.println(title + " 아직 대출되지 않음");
		}
	}

	public void getBookInfo() {
		System.out.println("도서명 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("ISBN : " + isbn);
		System.out.println("대출여부 : " + (isBorrow ? "불가능" : "가능"));
	}

	public String getTitle() {
		return title;
	}
}
