package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		// 상품정보를 담는 ArrayList를 생성하고
		// 상품정보 여러개를 담기
		// 저장된 상품 중에서 색상이 "검정" 색인 상품만 화면에 출력하기
		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product("청바지","검정",45000));
		productlist.add(new Product("목도리","빨강",25000));
		productlist.add(new Product("스카프","빨강",62000));
		productlist.add(new Product("치마","노랑",25000));
		productlist.add(new Product("자켓","검정",115000));
		
		for(Product p : productlist) {
			String name = p.getColor();
			if("검정".equals(name)) {
				System.out.println(p.getName()+" "+ p.getColor()+" "+ p.getPrice());
			}

		}
		
	}
	
	public static class Product {
		
		private String name;
		private String color;
		private int price;
		
		public Product() {}		
		public Product(String name, String color, int price) {
			super();
			this.name = name;
			this.color = color;
			this.price = price;
		}



		public void setName(String name) {
			this.name = name;
		}



		public void setColor(String color) {
			this.color = color;
		}



		public void setPrice(int price) {
			this.price = price;
		}



		public String getName() {
			return name;
		}



		public String getColor() {
			return color;
		}



		public int getPrice() {
			return price;
		}
	}
}
