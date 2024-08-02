package test04;

public class Member {
	String name;
	String memberId;
	Book borrowedBook;

	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBook = null; // 초기 상태는 대출된 책이 없음
	}

	public void borrowBook(Book book) {
		if (borrowedBook == null) {
			book.borrowBook();
			if (book.isBorrow) {
				borrowedBook = book;
			}
		} else {
			System.out.println(borrowedBook.getTitle() + " 이미 대출됨");
		}
	}

	public void returnBook(Book book) {
		if (borrowedBook != null && borrowedBook == book) {
			book.returnBook();
			if (!book.isBorrow) {
				borrowedBook = null;
			}
		} else {
			System.out.println(book.getTitle() + " 아직 대출되지 않음");
		}
	}

	public void getMemberInfo() {
		System.out.println("회원명 : " + name);
		System.out.println("아이디 : " + memberId);
		System.out.println("대출한 도서 : " + (borrowedBook != null ? borrowedBook.getTitle() : "없음"));
	}
}
