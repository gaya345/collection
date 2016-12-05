package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 방문자 이름을 저장하는 ArrayList를 생성하고
		// 방문자 이름을 여러 개 입력하기
		// '김'씨 성을 가진 사람만 새로운 ArrayList에 저장하기
		ArrayList<String> name1 = new ArrayList<String>();
		name1.add("김길동");
		name1.add("김구");
		name1.add("강감찬");
		name1.add("홍길동");
		name1.add("유길동");
		name1.add("이길동");
		name1.add("삼길동");
		
		ArrayList<String> name2 = new ArrayList<String>();
		
		for(String n : name1) {
			String name3 = n.substring(0,1);
			if("김".equals(name3)){
				name2.add(n);
			}
			
		}
		System.out.println(name2);
	}
}
