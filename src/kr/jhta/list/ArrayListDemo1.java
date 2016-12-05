package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// 방문자 이름을 저장하는 ArrayList를 생성할고
		// 방문자 이름을 여러개 입력하기
		// 출력은 '김'씨 성을 가진 사람만 화면에 출력하기
		ArrayList<String> names = new ArrayList<String>();
		names.add("김유신");
		names.add("강호동");
		names.add("유재석");
		names.add("홍길동");
		names.add("강감찬");
		names.add("우리집");	
		names.add("김구");
	
		for(String n : names) {
			String firstLetter= n.substring(0,1);
			if("김".equals(firstLetter)){
				System.out.println(n);
			}
		}
	}
}
