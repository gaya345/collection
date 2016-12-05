package kr.jhta.list;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo5 {
	
	// 콜렉션과 제목을 전달받아서 제목이 포함된 책 정보를 반환하는 메소드
	public static ArrayList<Book> searchBook(ArrayList<Book> list, String titles) {
		ArrayList<Book> result = new ArrayList<>();
		String lowerCaseKeyword = titles.toLowerCase();
		for(Book bk : list){
			String bktitle = bk.getTitle().toLowerCase();
			if(bktitle.contains(lowerCaseKeyword)) {
				result.add(bk);
			}
		}
		return result;
	}
	// 콜렉션과 최소가격, 최대가격을 전달받아서 그 가격범위에 포함된 책 정보를 반환하는 메소드
	public static ArrayList<Book> minMax(ArrayList<Book> list, int min, int max) {
		ArrayList<Book> result = new ArrayList<>();
		
		for(Book bk : list) {
			int price = bk.getPrice();
			if(price>=min && price<=max) {
				result.add(bk);
			}
			
		}
		return result;
	}
	// 콜렉션과 출판사를 전달받아서 그 출판사에 출판한 책 정보를 반환하는 메소드
	public static ArrayList<Book> publisher(ArrayList<Book> list, String pub) {
		ArrayList<Book> result = new ArrayList<>();
		for(Book bk : list) {
			String pub2 = bk.getPublisher();
			if(pub2.contains(pub)){
				result.add(bk);
			}
		}
		return result;
	}
	
	// 콜렉션을 전달받아서 출판사 정보를 반환하는 메소드
	public static HashSet<String> collectPublisher(ArrayList<Book> list) {
		HashSet<String> publisherSet = new HashSet<>();
		for(Book bk : list){
			publisherSet.add(bk.getPublisher());
		}
		return publisherSet;
	}
	
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		
		books.add(new Book("이것이 자바다", "신용권", "한빛미디어", 30000));
		books.add(new Book("점프 투 파이썬", "박응용", "이지스퍼블리싱", 18000));
		books.add(new Book("마음의 소리", "조석", "네이버", 20000));
		books.add(new Book("파이썬 웹 크롤러", "한성용", "한빛미디어", 25000));
		books.add(new Book("텐서플로 첫걸음", "박해선", "한빛미디어", 55000));
		books.add(new Book("자바의 정석", "남궁성", "도우출판사", 12000));
		books.add(new Book("모두의 파이썬", "이승찬", "길벗", 54700));
		books.add(new Book("java8 인 액션", "신용권", "한빛미디어", 23000));
		books.add(new Book("Java스크립트 패턴과 테스트", "이일웅", "길벗", 38000));
		books.add(new Book("열혈 C 프로그래밍", "윤성우", "오렌지미디어", 27000));
		
		ArrayList<Book> sbook = searchBook(books, "java");
		ArrayList<Book> mbook = minMax(books, 20000, 30000);
		ArrayList<Book> pbook = publisher(books, "한빛");
		HashSet<String> cbook = collectPublisher(books);
		
		System.out.println("제목이 포함된 출력값");
		for(Book sb : sbook){
			System.out.println(sb.getPrice()+", "+sb.getTitle()+", "+sb.getPublisher());
		}
		System.out.println("최대 최소값");
		for(Book mb : mbook){
			System.out.println(mb.getPrice()+", "+mb.getTitle()+", "+mb.getPublisher());
		}
		System.out.println(pbook.toString());
		
		System.out.println(cbook.toString());
	}
	
	
	public static class Book {
		private String title;
		private String author;
		private String publisher;
		private int price;
		
		public Book() {}
		public Book(String title, String author, String publisher, int price) {
			super();
			this.title = title;
			this.author = author;
			this.publisher = publisher;
			this.price = price;
		}
		
		public String getTitle() {
			return title;
		}
		public String getAuthor() {
			return author;
		}
		public String getPublisher() {
			return publisher;
		}
		public int getPrice() {
			return price;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price
					+ "]";
		}
		
		
	}
}
