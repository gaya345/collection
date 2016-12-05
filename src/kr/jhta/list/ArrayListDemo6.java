package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		ArrayList<Item> cart = new ArrayList<>();
		//	책(이름:자바의정석, 가격:35000)을 1권을 장바구니에 담기
		Product pro1 = new Product("자바의정석", 35000);
		int qty1 = 1;
		Item item1 = new Item();
		item1.setProduct(pro1);
		item1.setQuarity(qty1);
		cart.add(item1);
		
		//	연필(이름:모나미연필, 가격:500)10개를 장바구니에 담기
		Product pro2 = new Product("모나미연필", 500);
		int qty2 = 10;
		Item item2 = new Item();
		item2.setProduct(pro2);
		item2.setQuarity(qty2);
		cart.add(item2);
		
		// 구매총액을 계산하기
		int totalPrice = 0;
		for (Item item : cart) {
			totalPrice += item.getQuarity() * item.getProduct().getPrice();
		}
		System.out.println(totalPrice);
	}

	public static class Product{
		private String name;
		private int price;
		
		public Product(){}

		public Product(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public int getPrice() {
			return price;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
	}
	
	public static class Item {
		private Product product;
		private int quarity;
		
		public Item () {}

		public Item(Product product, int quarity) {
			super();
			this.product = product;
			this.quarity = quarity;
		}

		public Product getProduct() {
			return product;
		}

		public int getQuarity() {
			return quarity;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public void setQuarity(int quarity) {
			this.quarity = quarity;
		}

		@Override
		public String toString() {
			return "Item [product=" + product + ", quarity=" + quarity + "]";
		}
		
	}
}
