package kr.jhta.bookstore;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BookStore {
	ArrayList<Customer> customerlist = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	private Customer loginCustom = null;
	
	
	private boolean isExistId(String id){
		boolean isExist = false;
		for (Customer customer : customerlist){
			if(customer.getId().equals(id)){
				isExist = true;
				break;
			}
		}
		return isExist;
	}
		
	public void register () {
		Customer custom = new Customer();
		System.out.println("이름");
		custom.setName(sc.nextLine());
			
		System.out.println("아이디");
		String id = sc.nextLine();
		if(isExistId(id)){
			System.out.println("이미 사용중인 아이디입니다.");
			return;
		} else {
			custom.setId(id);
		}
		
		System.out.print("비밀번호");
		custom.setPwd(sc.nextLine());
		
		System.out.println("전화번호");
		custom.setTel(sc.nextLine());
		
		System.out.println("이메일");
		custom.setEmail(sc.nextLine());
		
		custom.setRegdate(new Date());
		custom.setPoint(0);
		
		customerlist.add(custom);
		
	}
	
	public void login() {
		System.out.println("아이디를 입력하세요");
		String loginId = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String loginpwd =sc.nextLine();

		for(Customer custom : customerlist) {
			if(loginId.equals(custom.getId()) && loginpwd.equals(custom.getPwd())){
				loginCustom = custom;
				System.out.println("["+loginCustom.getName()+"]님 로그인 되었습니다.");
			} 
		}
		if(loginCustom == null){
			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
		}
	}	
}
