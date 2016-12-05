package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo4 {
	
	// 정적메소드 정의하기
	// ArrayList와 "성씨"를 전달받아서 그 "성씨" 해당하는 이름을 출력하는 메소드
	public static void displayNameByFamilyName(ArrayList<String> list, String familyName) {
		
		for(String s : list) {
			String fl = s.substring(0,familyName.length());
			if(fl.equals(familyName)){
				//System.out.println(s);
				
			}
		}
	}
	
	//정적메소드 정의하기
	// ArrayList와 "성씨"를 전달받아서 그"성씨"에 해당하는 이름을 ArrayList에 담아서 반환하기
	public static ArrayList<String> getNamesByFamilyName(ArrayList<String> list, String familyName){
		ArrayList<String> result = new ArrayList<>();
		for(String s : list){
			String fl = s.substring(0, familyName.length());
			if(fl.equals(familyName))
				result.add(s);
		}
		return result;
	}
	
	public static void main(String[] args) {
		ArrayList<String> name1 = new ArrayList<String>();
		name1.add("김길동");
		name1.add("김구");
		name1.add("강감찬");
		name1.add("홍길동");
		name1.add("유길동");
		name1.add("이길동");
		name1.add("삼길동");
		
		displayNameByFamilyName(name1, "김");
		ArrayList<String> name2 = getNamesByFamilyName(name1, "홍");
		System.out.println(name2);
	}
}
